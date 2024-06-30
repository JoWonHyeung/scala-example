ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.12.2"

lazy val root = (project in file("."))
  .settings(
    name := "scala-example"
  )

libraryDependencies += "net.lingala.zip4j" % "zip4j" % "2.11.5"
libraryDependencies += "org.apache.zookeeper" % "zookeeper" % "3.9.2"
libraryDependencies += "org.json" % "json" % "20240303"