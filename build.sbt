name := """dana-instant"""
organization := "com.danainstant"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

scalaVersion := "2.12.8"

libraryDependencies += guice

// https://mvnrepository.com/artifact/com.graphql-java/graphql-java-tools
libraryDependencies += "com.graphql-java" % "graphql-java-tools" % "5.2.4"
// https://mvnrepository.com/artifact/com.graphql-java/graphql-java-servlet
libraryDependencies += "com.graphql-java" % "graphql-java-servlet" % "6.1.3"
//postgres
libraryDependencies += "org.postgresql" % "postgresql" % "42.2.5.jre7"
//ebean
libraryDependencies += "io.ebean" % "ebean" % "11.39.3"


