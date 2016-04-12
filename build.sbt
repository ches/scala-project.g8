// For sbt's scripted testing plugin that g8 integrates
resolvers += Resolver.typesafeIvyRepo("releases")

giter8Settings
G8Keys.g8TestBufferLog := false

scriptedLaunchOpts ++= sys.process.javaVmArguments.filter(
  a => Seq("-Xmx", "-Xms", "-XX", "-Dsbt.log.noformat").exists(a.startsWith)
)
