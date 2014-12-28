name := """play-java-intro"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

libraryDependencies ++= Seq(
  "org.postgresql" % "postgresql" % "9.3-1102-jdbc41",
  "be.objectify" %% "deadbolt-java" % "2.3.2",
  "com.feth"      %%  "play-authenticate" % "0.6.8",
  "org.webjars" % "jquery" % "2.1.1",
  "org.webjars" % "bootstrap" % "3.3.1",
    javaJdbc,
  javaEbean
)
