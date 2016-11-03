name         := "$name;format="norm"$"
organization := "$organization$"
version      := "0.0.1-SNAPSHOT"
scalaVersion := "$scala_version$"

scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature", "-Xlint")

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "$scalatest_version$" % "test"
)

// Convenience for sbt console
initialCommands in console := "import $package$._"

// ...but leave consoleQuick as escape hatch if the build is broken!
initialCommands in consoleQuick := ""
