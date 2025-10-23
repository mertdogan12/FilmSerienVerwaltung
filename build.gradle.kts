plugins {
    id("java")
    id("application")
}

group = "de.dogan.filmSerienVerwaltung"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.test {
    useJUnitPlatform()
}

application {
    mainClass = "de.dogan.filmSerienVerwaltung.Main"
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

tasks.named<Jar> ("jar") {
    manifest {
        attributes("Main-Class" to "de.dogan.filmSerienVerwaltung.Main")
    }
}
