name := "example"

scalaVersion := "2.11.2"

libraryDependencies ++= Seq(
  "com.github.benhutchison" %%% "scala-js-paper" % "1.0",
  "org.scala-lang.modules.scalajs" %%% "scalajs-dom" % "0.6"
)

scalaJSSettings