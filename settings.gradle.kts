

rootProject.name="raspberryjam-app"

pluginManagement {
    plugins {
        val kotlinVersion: String by settings
        val shadowVersion: String by settings

        id("org.jetbrains.kotlin.multiplatform") version kotlinVersion
        id("org.jetbrains.kotlin.jvm") version kotlinVersion
        id("org.jetbrains.kotlin.plugin.serialization") version kotlinVersion
        //id("com.github.johnrengelman.shadow") version shadowVersion
    }

    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}

include(":shared")
include(":cli")

project(":shared").name = "shared"
project(":cli").name = "cli"