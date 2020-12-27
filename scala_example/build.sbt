ThisBuild / version      := "1.0-SNAPSHOT"
ThisBuild / scalaVersion := "2.12.12"
ThisBuild / organization := "im.qinggo.scala_java_example_2"

lazy val ScalaExample = (project in file("."))
  .settings(
    name := "scala_example",
  )