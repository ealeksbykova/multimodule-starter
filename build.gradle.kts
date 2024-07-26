plugins {
    idea
}

version = "1.0.0"

subprojects {
    apply(plugin = "java")

    plugins.withType<JavaPlugin> {
        extensions.configure<JavaPluginExtension> {
            sourceCompatibility = JavaVersion.VERSION_21
            targetCompatibility = JavaVersion.VERSION_21
        }
    }

    repositories {
        mavenCentral()
    }
}

tasks.wrapper {
    distributionType = Wrapper.DistributionType.ALL
}