package com.example;

import rife.bld.Project;

import java.util.List;

import static rife.bld.dependencies.Repository.*;
import static rife.bld.dependencies.Scope.*;

public class QuarkusappBuild extends Project {
  public QuarkusappBuild() {
    pkg = "com.example";
    name = "Quarkusapp";
    mainClass = "com.example.QuarkusappMain";
    version = version(0,1,0);

    downloadSources = true;
    repositories = List.of(MAVEN_CENTRAL, RIFE2_RELEASES);

    scope(compile)
      .include(dependency("io.quarkus", "quarkus-resteasy-reactive-jackson", version("3.0.3.Final")))
      .include(dependency("io.quarkus", "quarkus-vertx", version("3.0.3.Final")));

    scope(test)
      .include(dependency("org.junit.jupiter", "junit-jupiter", version(5,9,3)))
      .include(dependency("org.junit.platform", "junit-platform-console-standalone", version(1,9,3)));

    //().javaOptions().property("quarkus.package.type", "native");
  }

  public static void main(String[] args) {
    new QuarkusappBuild().start(args);
  }
}