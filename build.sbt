// For sbt's scripted testing plugin that g8 integrates
resolvers += Resolver.typesafeIvyRepo("releases")

enablePlugins(ScriptedPlugin)

scriptedLaunchOpts ++= List("-Xms1024m", "-Xmx1024m", "-XX:ReservedCodeCacheSize=128m", "-Xss2m", "-Dfile.encoding=UTF-8")

// Make `sbt test` run the g8 scripted test
// g8Test seems busted in recent sbt-giter8 though: https://github.com/foundweekends/giter8/issues/393
test in Test := {
  val _ = (g8Test in Test).toTask("").value
}
