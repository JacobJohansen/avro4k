plugins {
   kotlin("jvm")
   id("com.gradle.plugin-publish") version "0.12.0"
   id("java-gradle-plugin")
   id("org.jetbrains.kotlin.plugin.serialization")
}

group = "com.sksamuel.avro4k"
version = "0.30.0"

repositories {
   mavenCentral()
   jcenter()
}

gradlePlugin{
   plugins {
      create("Avro4KSchemaGeneration") {
         id = "com.skamuel.avro4k"
         implementationClass = "com.skamuel.avro4k.plugin.Avro4KPlugin"
      }
   }
}

dependencies {
    implementation(project(":avro4k-core"))
    implementation(kotlin("stdlib"))
    testImplementation("junit", "junit", "4.12")
}
