//sbtPlugin := true
enablePlugins(SbtPlugin)
val ghOwner = "CareCloud"

organization  := "com.carecloud"

name := "sbt-cxf"

scalaVersion := "2.12.12"

licenses += ("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0.html"))

githubOwner := ghOwner

githubRepository := "sbt-cxf"

githubTokenSource := TokenSource.Environment("GITHUB_TOKEN") || TokenSource.GitConfig("github.token")

// resolvers ++= Seq[Resolver](
// Resolver.githubPackages(ghOwner)
// )