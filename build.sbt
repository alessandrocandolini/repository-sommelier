import Dependencies._
import Settings._

name := """repository-sommelier"""
version := "1.0-SNAPSHOT"

lazy val root = (project in file("."))
  .settings(commonSettings)
  .settings(Defaults.itSettings)
  .settings(
    name := "repository-sommelier",
    scalaVersion := Versions.scala,
    assembly / assemblyJarName := "repository-sommelier.jar",
    assembly / test := Def.sequential(Test / test, IntegrationTest / test).value,
    scalafmtOnCompile := false,
    libraryDependencies ++= (dependencies ++ testDependencies)
  )
  .configs(IntegrationTest)
