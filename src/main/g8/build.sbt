name         := "$name;format="norm"$"
organization := "$organization$"
version      := "0.0.1-SNAPSHOT"
scalaVersion := "$scala_version$"

scalacOptions ++= Seq("-encoding", "utf8")
scalacOptions ++= Seq(
  "-deprecation",
  "-explaintypes",
  "-feature",
  "-unchecked",
  "-Xlint",
  "-Ywarn-adapted-args",
  "-Ywarn-dead-code",
  "-Ywarn-inaccessible",
  "-Ywarn-infer-any",
  "-Ywarn-unused-import",
  "-Ywarn-value-discard",
)
Compile / console / scalacOptions -= "-Ywarn-unused-import"
Test / console / scalacOptions    -= "-Ywarn-unused-import"

// Convenience for sbt console
// ...but leave consoleQuick as escape hatch if the build is broken!
console / initialCommands := "import $package$._"
consoleQuick / initialCommands := ""

libraryDependencies += Dependencies.scalaTest % Test
