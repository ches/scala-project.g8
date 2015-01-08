name := "$name;format="norm"$"

organization := "$organization$"

version := "0.0.1-SNAPSHOT"

scalaVersion := "$scala_version$"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "$scalatest_version$" % "test"
)

initialCommands in console := "import $package$._"

// console-quick does not put our project on classpath
initialCommands in consoleQuick := ""

