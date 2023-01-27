
val jdkVersion = JavaLanguageVersion.of(17)

plugins {
    java
    application
    kotlin("jvm") version "1.8.0"
}

java {
    toolchain {
        languageVersion.set(jdkVersion)
    }
}

kotlin {
    jvmToolchain {
        languageVersion.set(jdkVersion)
    }
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
    // this can be replaced with buildList once gradle 8.0 comes out
    kotlinOptions.freeCompilerArgs += mutableListOf<String>().apply {
        add("-Xdebug")
    }
}

application {
    mainClass.set("xdebugerror.XDebugErrorKt")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4")
}
