plugins {
    kotlin("jvm") version "1.9.10"

    idea
}

allprojects {
    group = "dev.springrunner"
    version = "0.1.0"

    repositories {
        mavenCentral()
    }
}

subprojects {
    apply {
        plugin("application")
        plugin("kotlin")
        plugin("idea")
    }

    dependencies {
        testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.2")
        testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.2")

        testImplementation("io.kotest:kotest-runner-junit5:5.6.2")
        testImplementation("io.kotest:kotest-assertions-core:5.6.2")
        testImplementation("io.kotest:kotest-property:5.6.2")
    }

    sourceSets {
        main {
            kotlin.srcDir("src")
            java.srcDir("src")
        }
        test {
            kotlin.srcDir("test")
            java.srcDir("test")
        }
    }

    tasks.withType<Test> {
        useJUnitPlatform()

        testLogging {
            events("passed", "skipped", "failed")

            showCauses = true
            showExceptions = true
            showStackTraces = true
            exceptionFormat = org.gradle.api.tasks.testing.logging.TestExceptionFormat.FULL

            showStandardStreams = false
        }
    }
}
