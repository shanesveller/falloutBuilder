
plugins {
    kotlin("jvm") version "1.2.51"
}

repositories {
    mavenCentral()
}

val droolsVersion = "7.7.0.Final"

dependencies {
    compile(kotlin("stdlib"))
    compile(kotlin("test"))
    compile(kotlin("test-junit"))
    testRuntime(kotlin("reflect"))

    // OptaPlanner
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

val test by tasks.getting(Test::class) {
    useJUnitPlatform {
        includeEngines("spek")
    }

    testLogging {
        events("PASSED", "FAILED", "SKIPPED")
    }
}
