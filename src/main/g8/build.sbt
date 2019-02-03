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
scalacOptions in (Compile, console) -= "-Ywarn-unused-import"
scalacOptions in (Test, console)    -= "-Ywarn-unused-import"

// Convenience for sbt console
// ...but leave consoleQuick as escape hatch if the build is broken!
initialCommands in console      := "import $package$._"
initialCommands in consoleQuick := ""

libraryDependencies += Dependencies.scalaTest % Test
