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
    plugin("kotlin")
}

val kotlin_version: String by extra

val droolsVersion = "7.7.0.Final"

repositories {
    mavenCentral()
}

dependencies {
    compile(kotlinModule("stdlib-jdk8", kotlin_version))
    compile("org.optaplanner", "optaplanner-core", droolsVersion)
    compile("org.drools", "drools-core", droolsVersion)
    compile("org.drools", "drools-compiler", droolsVersion)
    testCompile("junit", "junit", "4.12")
    testCompile("org.optaplanner", "optaplanner-test", droolsVersion)
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}
tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}