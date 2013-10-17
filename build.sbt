import AssemblyKeys._

organization := "com.github.ababup1192"

name := "scalafx-test"

version := "0.1.0"

scalaVersion := "2.10.2"

fork in run := true

unmanagedJars in Compile += Attributed.blank(file(System.getenv("JAVA_HOME") + "/jre/lib/jfxrt.jar"))

scalacOptions := Seq("-unchecked", "-deprecation")

libraryDependencies ++= Seq(
  "org.scalafx" %% "scalafx" % "1.0.0-M5"
)

assemblySettings
