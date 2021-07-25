name         := "$name;format="norm"$"
organization := "$organization$"
version      := "0.0.1-SNAPSHOT"
scalaVersion := "$scala_version$"

Test / compile / scalacOptions -= "-Xfatal-warnings" // A bit too harsh for TDD

// Convenience for sbt console
// ...but leave consoleQuick as escape hatch if the build is broken!
console / initialCommands := "import $package$._"
consoleQuick / initialCommands := ""

libraryDependencies += Dependencies.scalaTest % Test
