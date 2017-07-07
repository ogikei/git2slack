name := "git2slack"

version := "1.0"

scalaVersion := "2.12.2"

resolvers += "Typesafe Repo" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies ++= Seq(
  "com.amazonaws" % "aws-lambda-java-core" % "1.1.0",
  "com.amazonaws" % "aws-lambda-java-events" % "1.3.0",
  "com.typesafe.play" % "play-json_2.12" % "2.6.0"
)
