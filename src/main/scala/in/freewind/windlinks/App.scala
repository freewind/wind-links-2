package in.freewind.windlinks

import japgolly.scalajs.react.vdom.all._
import japgolly.scalajs.react.{ReactComponentB, _}
import org.scalajs.dom

import scala.scalajs.js.JSApp

object App extends JSApp {


  val Hello = ReactComponentB[String]("Hello").render(i => h1(i)).build

  override def main(): Unit = {
    Hello("scalajs-react") render dom.document.body
  }

}
