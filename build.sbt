organization := "com.github.benhutchison"

scalaVersion := "2.11.2"

name := "scala-js-paper"

version := "1.0"

libraryDependencies +=
  "org.scala-lang.modules.scalajs" %%% "scalajs-dom" % "0.6"

scalaJSSettings

lazy val example = project.dependsOn(root)

lazy val root =  (project in file("."))