package in.freewind.windlinks

import japgolly.scalajs.react._

import japgolly.scalajs.react.vdom.prefix_<^._

object MainPage {

  val Component = ReactComponentB[String]("MainPage").render(title => {
    <.div("Main page:" + title)
  }).build

}

