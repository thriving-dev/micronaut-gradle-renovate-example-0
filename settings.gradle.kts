rootProject.name = "micronaut-gradle-renovate-example-0"

dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            plugin("johnrengelman-shadow", "com.github.johnrengelman.shadow").version("8.1.1")
            plugin("micronaut-application", "io.micronaut.application").version("4.3.1")
            plugin("micronaut-aot", "io.micronaut.aot").version("4.3.1")

            library("junit", "org.junit.jupiter:junit-jupiter:5.10.2")
            library("assertj", "org.assertj:assertj-core:3.25.3")
            library("testcontainers", "org.testcontainers:testcontainers:1.19.4")
            library("testcontainers-junit5", "org.testcontainers:junit-jupiter:1.19.4")

            bundle("testcontainers-junit", listOf("testcontainers", "testcontainers-junit5"))
        }
    }
}