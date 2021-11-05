import mill._, scalalib._, scalajslib._, publish._
import mill.scalajslib.api.ModuleKind

object GLaDOS extends ScalaModule with ScalaJSModule with PublishModule {
  def scalaVersion = "3.0.1"
  def scalaJSVersion = "1.7.1"

  def moduleKind = ModuleKind.CommonJSModule

  def publishVersion = "0.1.0"

  def pomSettings = PomSettings(
    description = "GLaDOS quotes",
    organization = "com.thrimbda",
    url = "https://github.com/thrimbda/GLaDOS",
    licenses = Seq(License.MIT),
    versionControl = VersionControl.github("thrimbda", "GLaDOS"),
    developers = Seq(
      Developer("thrimbda", "Wang Siyuan", "https://github.com/Thrimbda")
    )
  )
}
