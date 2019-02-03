name         := "$name;format="norm"$"
organization := "$organization$"
version      := "0.0.1-SNAPSHOT"
scalaVersion := "$scala_version$"

scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature", "-Xlint")

// Convenience for sbt console
// ...but leave consoleQuick as escape hatch if the build is broken!
initialCommands in console      := "import $package$._"
initialCommands in consoleQuick := ""

libraryDependencies += Dependencies.scalaTest % Test
