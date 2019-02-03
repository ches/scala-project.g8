import sbt._

object Dependencies {
  object Versions {
    val scalaTest = "$scalatest_version$"
  }

  lazy val scalaTest = "org.scalatest" %% "scalatest" % Versions.scalaTest
}
