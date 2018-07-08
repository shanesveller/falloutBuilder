import org.gradle.api.plugins.ExtensionAware
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

buildscript {
    var kotlin_version: String by extra
    kotlin_version = "1.2.50"

    repositories {
        mavenCentral()
    }
    dependencies {
        classpath(kotlinModule("gradle-plugin", kotlin_version))
    }
}

plugins {
    java
}

group = "com.shanesveller"
version = "0.1-SNAPSHOT"

apply {
    // plugin("java")
    plugin("kotlin")
}

/*
test {
    filters {
        engines {
            include("spek")
        }
    }
}
*/

val kotlin_version: String by extra

val droolsVersion = "7.7.0.Final"

repositories {
    mavenCentral()
}

dependencies {
    compile(kotlinModule("stdlib-jdk8", kotlin_version))
    compile(kotlinModule("reflect", kotlin_version))
    compile(kotlinModule("test", kotlin_version))
    compile(kotlinModule("test-junit", kotlin_version))

    compile("org.optaplanner", "optaplanner-core", droolsVersion)
    compile("org.drools", "drools-core", droolsVersion)
    compile("org.drools", "drools-compiler", droolsVersion)
    testCompile("org.optaplanner", "optaplanner-test", droolsVersion)

    // JUnit 5
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.2.0")
    testRuntimeOnly( "org.junit.jupiter:junit-jupiter-engine:5.2.0" )
    testRuntime("org.junit.platform:junit-platform-console:1.2.0")
    testRuntime("org.junit.platform:junit-platform-launcher:1.2.0")
    // Spek
    testCompile("org.jetbrains.spek:spek-api:1.1.5") {
        exclude(group = "org.jetbrains.kotlin")
    }
    testRuntime("org.jetbrains.spek:spek-junit-platform-engine:1.1.5") {
        exclude(group = "org.junit.platform")
        exclude(group = "org.jetbrains.kotlin")
    }
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}
tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}
