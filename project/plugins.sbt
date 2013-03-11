resolvers ++= Seq(
  DefaultMavenRepository,
  "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/",
  "Typesafe Other Repository" at "http://repo.typesafe.com/typesafe/repo/"
)

// Type "sbt gen-idea" to create an IntelliJ IDEA project.

addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.2.0")

// Type "sbt eclipse" to create an eclipse project

addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "2.1.2")

addSbtPlugin("play" % "sbt-plugin" % "2.1.0")

// Comment to get more information during initialization
logLevel := Level.Warn
