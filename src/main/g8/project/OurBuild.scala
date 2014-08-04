import sbt._
import sbt.{Project, Build}
import sbt.Keys._

object OurBuild extends Build {
  override lazy val settings = super.settings ++ giter8.ScaffoldPlugin.scaffoldSettings
}
