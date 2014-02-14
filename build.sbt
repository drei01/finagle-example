name := "thrift-example"

version := "1.0"

scalaVersion := "2.10.0"

com.twitter.scrooge.ScroogeSBT.newSettings

scroogeThriftOutputFolder in Compile  := file("src/main/scala")

libraryDependencies ++= Seq(
  "org.apache.thrift" % "libthrift" % "0.8.0",
  "com.twitter" %% "scrooge-core" % "3.11.2",
  "com.twitter" %% "finagle-thrift" % "6.5.0"
)