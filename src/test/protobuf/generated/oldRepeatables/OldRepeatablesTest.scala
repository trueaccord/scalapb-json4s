// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package generated.oldRepeatables

import _root_.scalapb.internal.compat.JavaConverters._

@SerialVersionUID(0L)
final case class OldRepeatablesTest(
    repeatedStrings: _root_.scala.Seq[_root_.scala.Predef.String] =
      _root_.scala.Seq.empty,
    unknownFields: _root_.scalapb.UnknownFieldSet =
      _root_.scalapb.UnknownFieldSet.empty
) extends scalapb.GeneratedMessage
    with scalapb.lenses.Updatable[OldRepeatablesTest] {
  @transient
  private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
  private[this] def __computeSerializedValue(): _root_.scala.Int = {
    var __size = 0
    repeatedStrings.foreach { __item =>
      val __value =
        generated.oldRepeatables.OldRepeatablesTest._typemapper_repeatedStrings
          .toBase(__item)
      __size += 1 + _root_.com.google.protobuf.CodedOutputStream
        .computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
    }
    __size += unknownFields.serializedSize
    __size
  }
  override def serializedSize: _root_.scala.Int = {
    var read = __serializedSizeCachedValue
    if (read == 0) {
      read = __computeSerializedValue()
      __serializedSizeCachedValue = read
    }
    read
  }
  def writeTo(
      `_output__`: _root_.com.google.protobuf.CodedOutputStream
  ): _root_.scala.Unit = {
    repeatedStrings.foreach { __v =>
      val __m =
        generated.oldRepeatables.OldRepeatablesTest._typemapper_repeatedStrings
          .toBase(__v)
      _output__.writeTag(1, 2)
      _output__.writeUInt32NoTag(__m.serializedSize)
      __m.writeTo(_output__)
    };
    unknownFields.writeTo(_output__)
  }
  def clearRepeatedStrings = copy(repeatedStrings = _root_.scala.Seq.empty)
  def addRepeatedStrings(
      __vs: _root_.scala.Predef.String*
  ): OldRepeatablesTest = addAllRepeatedStrings(__vs)
  def addAllRepeatedStrings(
      __vs: Iterable[_root_.scala.Predef.String]
  ): OldRepeatablesTest = copy(repeatedStrings = repeatedStrings ++ __vs)
  def withRepeatedStrings(
      __v: _root_.scala.Seq[_root_.scala.Predef.String]
  ): OldRepeatablesTest = copy(repeatedStrings = __v)
  def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) =
    copy(unknownFields = __v)
  def discardUnknownFields =
    copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
  def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
    (__fieldNumber: @ _root_.scala.unchecked) match {
      case 1 =>
        _root_.scalapb.internal.compat.convertTo(
          repeatedStrings.iterator.map(
            OldRepeatablesTest._typemapper_repeatedStrings.toBase
          )
        )
    }
  }
  def getField(
      __field: _root_.scalapb.descriptors.FieldDescriptor
  ): _root_.scalapb.descriptors.PValue = {
    _root_.scala.Predef.require(
      __field.containingMessage eq companion.scalaDescriptor
    )
    (__field.number: @ _root_.scala.unchecked) match {
      case 1 =>
        _root_.scalapb.descriptors.PRepeated(
          repeatedStrings.iterator
            .map(
              generated.oldRepeatables.OldRepeatablesTest._typemapper_repeatedStrings
                .toBase(_)
                .toPMessage
            )
            .toVector
        )
    }
  }
  def toProtoString: _root_.scala.Predef.String =
    _root_.scalapb.TextFormat.printToUnicodeString(this)
  def companion = generated.oldRepeatables.OldRepeatablesTest
  // @@protoc_insertion_point(GeneratedMessage[generated.OldRepeatablesTest])
}

object OldRepeatablesTest
    extends scalapb.GeneratedMessageCompanion[
      generated.oldRepeatables.OldRepeatablesTest
    ]
    with scalapb.JavaProtoSupport[
      generated.oldRepeatables.OldRepeatablesTest,
      generated.OldRepeatables.OldRepeatablesTest
    ] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[
    generated.oldRepeatables.OldRepeatablesTest
  ] with scalapb.JavaProtoSupport[
      generated.oldRepeatables.OldRepeatablesTest,
      generated.OldRepeatables.OldRepeatablesTest
    ] = this
  def toJavaProto(
      scalaPbSource: generated.oldRepeatables.OldRepeatablesTest
  ): generated.OldRepeatables.OldRepeatablesTest = {
    val javaPbOut = generated.OldRepeatables.OldRepeatablesTest.newBuilder
    javaPbOut.addAllRepeatedStrings(
      _root_.scalapb.internal.compat
        .toIterable(
          scalaPbSource.repeatedStrings.iterator.map(__e =>
            com.google.protobuf.wrappers.StringValue.toJavaProto(
              generated.oldRepeatables.OldRepeatablesTest._typemapper_repeatedStrings
                .toBase(__e)
            )
          )
        )
        .asJava
    )
    javaPbOut.build
  }
  def fromJavaProto(
      javaPbSource: generated.OldRepeatables.OldRepeatablesTest
  ): generated.oldRepeatables.OldRepeatablesTest =
    generated.oldRepeatables.OldRepeatablesTest(
      repeatedStrings = javaPbSource.getRepeatedStringsList.asScala.iterator
        .map(__e =>
          generated.oldRepeatables.OldRepeatablesTest._typemapper_repeatedStrings
            .toCustom(
              com.google.protobuf.wrappers.StringValue.fromJavaProto(__e)
            )
        )
        .toSeq
    )
  def parseFrom(
      `_input__`: _root_.com.google.protobuf.CodedInputStream
  ): generated.oldRepeatables.OldRepeatablesTest = {
    val __repeatedStrings: _root_.scala.collection.immutable.VectorBuilder[
      _root_.scala.Predef.String
    ] = new _root_.scala.collection.immutable.VectorBuilder[
      _root_.scala.Predef.String
    ]
    var `_unknownFields__` : _root_.scalapb.UnknownFieldSet.Builder = null
    var _done__ = false
    while (!_done__) {
      val _tag__ = _input__.readTag()
      _tag__ match {
        case 0 => _done__ = true
        case 10 =>
          __repeatedStrings += generated.oldRepeatables.OldRepeatablesTest._typemapper_repeatedStrings
            .toCustom(
              _root_.scalapb.LiteParser
                .readMessage[com.google.protobuf.wrappers.StringValue](_input__)
            )
        case tag =>
          if (_unknownFields__ == null) {
            _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder()
          }
          _unknownFields__.parseField(tag, _input__)
      }
    }
    generated.oldRepeatables.OldRepeatablesTest(
      repeatedStrings = __repeatedStrings.result(),
      unknownFields =
        if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty
        else _unknownFields__.result()
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[
    generated.oldRepeatables.OldRepeatablesTest
  ] = _root_.scalapb.descriptors.Reads {
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(
        __fieldsMap.keys.forall(_.containingMessage eq scalaDescriptor),
        "FieldDescriptor does not match message type."
      )
      generated.oldRepeatables.OldRepeatablesTest(
        repeatedStrings = __fieldsMap
          .get(scalaDescriptor.findFieldByNumber(1).get)
          .map(_.as[_root_.scala.Seq[com.google.protobuf.wrappers.StringValue]])
          .getOrElse(_root_.scala.Seq.empty)
          .iterator
          .map(
            generated.oldRepeatables.OldRepeatablesTest._typemapper_repeatedStrings
              .toCustom(_)
          )
          .toSeq
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor =
    OldRepeatablesProto.javaDescriptor.getMessageTypes().get(0)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor =
    OldRepeatablesProto.scalaDescriptor.messages(0)
  def messageCompanionForFieldNumber(
      __number: _root_.scala.Int
  ): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @ _root_.scala.unchecked) match {
      case 1 => __out = com.google.protobuf.wrappers.StringValue
    }
    __out
  }
  lazy val nestedMessagesCompanions
      : Seq[_root_.scalapb.GeneratedMessageCompanion[
        _ <: _root_.scalapb.GeneratedMessage
      ]] = Seq.empty
  def enumCompanionForFieldNumber(
      __fieldNumber: _root_.scala.Int
  ): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(
    __fieldNumber
  )
  lazy val defaultInstance = generated.oldRepeatables.OldRepeatablesTest(
    repeatedStrings = _root_.scala.Seq.empty
  )
  implicit class OldRepeatablesTestLens[UpperPB](
      _l: _root_.scalapb.lenses.Lens[
        UpperPB,
        generated.oldRepeatables.OldRepeatablesTest
      ]
  ) extends _root_.scalapb.lenses.ObjectLens[
        UpperPB,
        generated.oldRepeatables.OldRepeatablesTest
      ](_l) {
    def repeatedStrings: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[
      _root_.scala.Predef.String
    ]] = field(_.repeatedStrings)((c_, f_) => c_.copy(repeatedStrings = f_))
  }
  final val REPEATEDSTRINGS_FIELD_NUMBER = 1
  @transient
  private[oldRepeatables] val _typemapper_repeatedStrings
      : _root_.scalapb.TypeMapper[
        com.google.protobuf.wrappers.StringValue,
        _root_.scala.Predef.String
      ] = implicitly[_root_.scalapb.TypeMapper[
    com.google.protobuf.wrappers.StringValue,
    _root_.scala.Predef.String
  ]]
  def of(
      repeatedStrings: _root_.scala.Seq[_root_.scala.Predef.String]
  ): _root_.generated.oldRepeatables.OldRepeatablesTest =
    _root_.generated.oldRepeatables.OldRepeatablesTest(
      repeatedStrings
    )
  // @@protoc_insertion_point(GeneratedMessageCompanion[generated.OldRepeatablesTest])
}
