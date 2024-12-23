ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.15"

lazy val root = (project in file("."))
  .settings(
    name := "redis4cats-nsme-showcase",
    libraryDependencies ++= List(
      "dev.profunktor" %% "redis4cats-effects" % "1.7.2",
      "org.typelevel" %% "cats-effect" % "3.5.7"
    )
  )
