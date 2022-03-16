plugins {
    kotlin("multiplatform")
    id("com.google.devtools.ksp")
}

version = "1.0-SNAPSHOT"

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
        }
        val jvmTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
    }

    sourceSets.named("commonTest") {
        kotlin.srcDir("build/generated/ksp")
    }
}

dependencies {
    add("kspMetadata", project(":test-processor"))
    /*add("kspJvm", project(":test-processor"))
    add("kspJvmTest", project(":test-processor"))
    add("kspIosX64", project(":test-processor"))
    add("kspIosX64Test", project(":test-processor"))*/

    // The universal "ksp" configuration has performance issue and is deprecated on multiplatform since 1.0.1
    // ksp(project(":test-processor"))
}
