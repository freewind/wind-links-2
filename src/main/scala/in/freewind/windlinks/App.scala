package in.freewind.windlinks

import japgolly.scalajs.react.extra.router.{AbsUrl, BaseUrl}
import japgolly.scalajs.react.vdom.all._
import japgolly.scalajs.react.{ReactComponentB, _}
import org.scalajs.dom

import scala.scalajs.js.JSApp

object App extends JSApp {

  val Hello = ReactComponentB[String]("Hello").render(i => h1(i)).build

  override def main(): Unit = {
    val url = AbsUrl.fromWindow.value.split('#')(0)
    Routes.router(new BaseUrl(url))() render dom.document.body
  }

}
