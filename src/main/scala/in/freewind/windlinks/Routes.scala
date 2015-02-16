package in.freewind.windlinks

import japgolly.scalajs.react.extra.router.{Redirect, RoutingRules}

object Routes extends RoutingRules {

  val root = register(rootLocation(MainPage.Component("title1")))

  register(location("#config", ConfigPage.All("title2")))

  override protected val notFound: Routes.DynAction = redirect(root, Redirect.Replace)

}
