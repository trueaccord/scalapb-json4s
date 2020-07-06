addSbtPlugin("com.jsuereth" % "sbt-pgp" % "2.0.1")

addSbtPlugin("com.github.gseitz" % "sbt-release" % "1.0.13")

addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "3.9.4")

addSbtPlugin("com.thesamet" % "sbt-protoc" % "0.99.34")
libraryDependencies += "com.thesamet.scalapb" %% "compilerplugin" % "0.10.7"

addSbtPlugin("com.typesafe" % "sbt-mima-plugin" % "0.7.0")

addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.4.0")
