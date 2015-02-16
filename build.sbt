enablePlugins(ScalaJSPlugin)

name := "wind-links"

version := "1.0"

scalaVersion := "2.11.5"

//////////////////////////////// scalajs-react ///////////////////////////////////////

// Minimal usage
libraryDependencies += "com.github.japgolly.scalajs-react" %%% "core" % "0.8.0"

// React itself
//   (react-with-addons.js can be react.js, react.min.js, react-with-addons.min.js)
jsDependencies += "org.webjars" % "react" % "0.12.1" / "react-with-addons.js" commonJSName "React"

// Test support including ReactTestUtils
//   (requires react-with-addons.js instead of just react.js)
libraryDependencies += "com.github.japgolly.scalajs-react" %%% "test" % "0.8.0" % "test"

// Scalaz support
libraryDependencies += "com.github.japgolly.scalajs-react" %%% "ext-scalaz71" % "0.8.0"

// Monocle support
libraryDependencies += "com.github.japgolly.scalajs-react" %%% "ext-monocle" % "0.8.0"

// Extra features
libraryDependencies += "com.github.japgolly.scalajs-react" %%% "extra" % "0.8.0"

// will create xxx-jsdeps.js
skip in packageJSDependencies := false

// http://www.scala-js.org/doc/tutorial.html
// Automatically Creating a Launcher
persistLauncher in Compile := true

persistLauncher in Test := false
