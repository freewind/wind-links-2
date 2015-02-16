package in.freewind.windlinks

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.all._
import org.scalajs.dom.ext.KeyValue

object ConfigPage {

  case class State(projects: Seq[Project])

  lazy val All = ReactComponentB[Unit]("ConfigPage")
    .initialState(State(SampleData.projects))
    .backend(new Backend(_))
    .render((_, state, backend) => {
    div(id := "config-page") {
      div(className := "project-list") {
        ProjectList((state, backend))
      }
    }
  }).build

  lazy val ProjectList = ReactComponentB[(State, Backend)]("ProjectList").render(props => {
    val (state, backend) = props
    div(
      state.projects.map(p => div(button(onClick --> backend.selectProject(p))(p.name))),
      div {
        input(`type` := "text", onKeyUp ==> backend.createProject, placeholder := "new project")
      }
    )
  }).build

  class Backend($: BackendScope[_, State]) {
    def selectProject(project: Project): Unit = {
      println("######### select project: " + project.name)
    }
    def createProject(e: ReactKeyboardEventI): Unit = {
      val value = e.target.value.trim
      if (!value.isEmpty && e.key == KeyValue.Enter) {
        $.modState { state =>
          state.copy(projects = state.projects :+ Project(value))
        }
      }
    }
  }

}

