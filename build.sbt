// For sbt's scripted testing plugin that g8 integrates
resolvers += Resolver.typesafeIvyRepo("releases")

scriptedLaunchOpts ++= sys.process.javaVmArguments.filter(
  a => Seq("-Xmx", "-Xms", "-XX", "-Dsbt.log.noformat").exists(a.startsWith)
)
