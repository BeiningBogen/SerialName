plugins {
    kotlin("multiplatform")
    id("com.google.devtools.ksp")
}

version = "0.1.0"

kotlin {
    jvm {
        withJava()
    }
    ios()

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.3.2")
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test-common"))
                implementation(kotlin("test-annotations-common"))
            }
            kotlin.srcDir("build/generated/ksp")
        }
        val jvmTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
    }
}

dependencies {
    add("kspMetadata", project(":test-processor"))
}
