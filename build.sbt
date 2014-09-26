import SonatypeKeys._

organization := "com.github.benhutchison"

scalaVersion := "2.11.2"

name := "scala-js-paper"

version := "1.0"

libraryDependencies +=
  "org.scala-lang.modules.scalajs" %%% "scalajs-dom" % "0.6"

scalaJSSettings

lazy val example = project.dependsOn(root)

lazy val root =  (project in file("."))


sonatypeSettings

publishArtifact in Test := false

publishTo <<= version { (v: String) =>
  Some("releases"  at "https://oss.sonatype.org/service/local/staging/deploy/maven2")
}

publishMavenStyle := true

pomExtra :=
  <url>https://github.com/benhutchison/scala-js-paper</url>
    <licenses>
      <license>
        <name>Apache license</name>
        <url>http://opensource.org/licenses/Apache-2.0</url>
      </license>
    </licenses>
    <scm>
      <url>git://github.com/benhutchison/scala-js-paper.git</url>
    </scm>
    <developers>
      <developer>
        <id>benhutchison</id>
        <name>Ben Hutchison</name>
        <url>https://github.com/benhutchison</url>
      </developer>
    </developers>