ThisBuild / version := "1.0"
ThisBuild / scalaVersion := "2.12.8"

lazy val hello = taskKey[Unit]("An example task")
lazy val hello2 = taskKey[Unit]("An example task") := { println("Hello!") }

lazy val common = project
lazy val client = project.dependsOn(common)
lazy val server = project.dependsOn(common)

lazy val root = (project in file("."))
  .settings(
    name := "sbtExplore",
    hello := { println("test runs oki...") },
    hello2
  ).aggregate(client, server)

