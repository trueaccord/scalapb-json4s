package com.trueaccord.scalapb.json

import com.google.protobuf.any.{Any => PBAny}
import com.trueaccord.scalapb.json.JsonFormat.GenericCompanion
import org.json4s.JsonAST.{JNothing, JObject, JString, JValue}

import scala.util.matching.Regex
import scala.language.existentials

object AnyFormat {

  private val PrefixedTypeUrl = """type\.googleapis\.com/(.*)""".r

  // TODO consider caching the results. If so, refactor away from a singleton (or key by FormatRegistry as well).
  private def findCompanionOf(typeUrl: String, formatRegistry: FormatRegistry): Option[GenericCompanion] =
    typeUrl match {
      case PrefixedTypeUrl(typeName) =>
        formatRegistry.registeredCompanions.find(_.scalaDescriptor.fullName == typeName)
      case _ => None
    }

  val anyWriter: (Printer, PBAny) => JValue = { case (printer, any) =>
    // Find the companion so it can be used to JSON-serialize the message. Perhaps this can be circumvented by
    // including the original GeneratedMessage with the Any (at least in memory).
    val cmp = findCompanionOf(any.typeUrl, printer.formatRegistry)
      .getOrElse(throw new IllegalStateException(s"Unknown type ${any.typeUrl}; you may have to register it via FormatRegistry.registerCompanion"))

    // Unpack the message...
    val message = any.unpack(cmp)

    // ... and add the @type marker to the resulting JSON
    printer.toJson(message) match {
      case JObject(fields) => JObject(("@type" -> JString(any.typeUrl)) +: fields)
      case value =>
        // Safety net, this shouldn't happen
        throw new IllegalStateException(s"Message of type ${any.typeUrl} emitted non-object JSON $value")
    }
  }

  val anyParser: (Parser, JValue) => PBAny = {
    case (parser, obj @ JObject(fields)) =>
      obj \ "@type" match {
        case JString(typeUrl) =>
          val cmp = findCompanionOf(typeUrl, parser.formatRegistry)
            .getOrElse(throw new JsonFormatException(s"Unknown type $typeUrl; you may have to register it via FormatRegistry.registerCompanion"))
          val tail = fields.filterNot(_._1 == "@type")
          val message = parser.fromJson(JObject(tail))(cmp)
          PBAny(typeUrl = typeUrl, value = message.toByteString)

        case JNothing =>
          throw new JsonFormatException("Object of type com.google.protobuf.any.Any missing @type field")

        case unknown =>
          throw new JsonFormatException(s"Expected string @type field, got $unknown")
      }

    case (_, unknown) =>
      throw new JsonFormatException(s"Expected an object, got $unknown")
  }
}
