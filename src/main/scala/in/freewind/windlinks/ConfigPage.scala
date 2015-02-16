package in.freewind.windlinks

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.prefix_<^._

object ConfigPage {

  val Component = ReactComponentB[String]("ConfigPage").render(title => {
    <.div("Config page: " + title)
  }).build

}

