import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm")
    application
}

repositories {
    mavenCentral()
    jcenter()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation(project(":mpp"))
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
    kotlinOptions.javaParameters = true
    kotlinOptions.freeCompilerArgs += "-Xjvm-default=enable"
}

application {
    mainClassName = "de.takeweiland.kotlinmppnpmdemo.ServerMainKt"
}