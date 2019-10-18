plugins {
    kotlin("multiplatform")
    id("kotlin-dce-js")
}

repositories {
    mavenCentral()
}

kotlin {
    jvm()
    js {
        useCommonJs()
        nodejs {
            runTask {

            }
        }
    }

    sourceSets {
        commonMain {
            dependencies {
                implementation(kotlin("stdlib-common"))
            }
        }
        val jvmMain by getting {
            dependencies {
                implementation(kotlin("stdlib-jdk8"))
            }
        }

        val jsMain by getting {
            dependencies {
                implementation(kotlin("stdlib-js"))
            }
        }
    }
}

val runDceJsKotlin by tasks.existing(org.jetbrains.kotlin.gradle.dsl.KotlinJsDce::class) {
    keep("kotlin-mpp-npm-demo-mpp.de.takeweiland.kotlinmppnpmdemo.common.commonFun")
}