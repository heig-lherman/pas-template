val scala3Version = "3.3.5"

lazy val root = project
  .in(file("."))
  .settings(
    name := "scala3",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    libraryDependencies += "org.scalameta" %% "munit" % "1.1.0" % Test
  )
