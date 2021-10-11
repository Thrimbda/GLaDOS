import mill._, scalalib._, scalajslib._
import mill.scalajslib.api.ModuleKind

object GLaDOS extends ScalaModule with ScalaJSModule {
  def scalaVersion = "3.0.1"
  def scalaJSVersion = "1.7.1"

  def moduleKind = ModuleKind.CommonJSModule
}
