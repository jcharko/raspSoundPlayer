version = "1.0-SNAPSHOT"

plugins {
    kotlin("jvm") version "1.5.10"
    application
    id("com.github.johnrengelman.shadow") version "5.0.0"
}

application {
    mainClassName = "MainKt"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.1stleg:jnativehook:2.0.2")
    implementation(kotlin("stdlib"))
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
    implementation("com.pi4j:pi4j-core:1.4")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}

tasks {
    withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
        kotlinOptions.jvmTarget = "1.8"
    }

    shadowJar {
        // defaults to project.name
        //archiveBaseName.set("${project.name}-fat")

        // defaults to all, so removing this overrides the normal, non-fat jar
        archiveClassifier.set("")
    }
}