plugins {
    kotlin("jvm") version "2.2.21"
}

group = "com.rmpader"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-reactor:1.10.2")
    implementation("io.projectreactor.kotlin:reactor-kotlin-extensions:1.2.4")
    implementation("io.projectreactor:reactor-core:3.7.12")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.10.2")
    testImplementation(kotlin("test-junit5"))
    testImplementation("io.projectreactor:reactor-test:3.7.12")
    testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.10.2")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}