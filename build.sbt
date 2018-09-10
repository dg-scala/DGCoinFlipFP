name := "DGCoinFlipFP"

version := "0.1"

scalaVersion := "2.12.6"

scalacOptions += "-Ypartial-unification"

libraryDependencies ++= Seq(
  "org.typelevel" %% "cats-core" % "1.3.1",
  "org.typelevel" %% "cats-effect" % "1.0.0"
)
