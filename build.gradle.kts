group = "org.example"
version = "1.0-SNAPSHOT"

val scalaLangVersion by extra {"2.13.6"}
val scalaLibVersion by extra {"2.13"}

plugins {
    scala
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.scala-lang:scala-library:$scalaLangVersion")
    testImplementation("org.scalatest:scalatest_2.13:3.0.0")
    testImplementation("junit:junit:4.13")
    testRuntimeOnly("org.scala-lang.modules:scala-xml_2.13:1.2.0")
}
