name := "$name;format="norm"$"

organization := "$organization$"

version := "0.0.1-SNAPSHOT"

scalaVersion := "$scala_version$"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "$scalatest_version$" % "test"
)

initialCommands := "import $package$._"

