import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import com.google.protobuf.gradle.*

plugins {
    application
    kotlin("jvm") version "1.5.10"
    kotlin("kapt") version "1.4.31"
    id("com.google.protobuf") version "0.8.15"
}

group = "me.slack"
version = "1.0-SNAPSHOT"



sourceSets {
    main {
        java {
            srcDirs("build/generated/source/proto/main/grpc")
            srcDirs("build/generated/source/proto/main/grpckt")
            srcDirs("build/generated/source/proto/main/java")
        }

        proto {
            srcDirs("build/generated/source/proto/main/grpc")
            srcDirs("build/generated/source/proto/main/grpckt")
            srcDirs("build/generated/source/proto/main/java")
            exclude("src/main/java")
            exclude("src/main/proto")
        }
    }
}



protobuf {
    protoc {
        artifact = "com.google.protobuf:protoc:3.14.0"
    }

    plugins {
        id("grpc") {
            artifact = "io.grpc:protoc-gen-grpc-java:1.36.0"
        }
        id("grpckt") {
            artifact = "io.grpc:protoc-gen-grpc-kotlin:1.0.0:jdk7@jar"
        }
    }

    generateProtoTasks {
        ofSourceSet("main").forEach {
            it.plugins {
                // Apply the "grpc" plugin whose spec is defined above, without options.
                id("grpc")
                id("grpckt")
            }
        }
    }
}


dependencies {
    implementation("io.grpc:grpc-netty-shaded:1.42.1")
    implementation("io.grpc:grpc-protobuf:1.42.1")
    implementation("io.grpc:grpc-kotlin-stub:1.2.0")
    implementation("com.google.protobuf:protobuf-java:3.19.1")

    implementation("javax.annotation:javax.annotation-api:1.3.2")
    implementation("org.slf4j:slf4j-log4j12:1.7.32")
    runtimeOnly("javax.xml.bind:jaxb-api:2.4.0-b180830.0359")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.2-native-mt")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("org.xerial:sqlite-jdbc:3.36.0.2")
    testImplementation(kotlin("test-junit"))
}

tasks.withType<Jar> {
    manifest {
        attributes["Main-Class"] = "me.slack.MainGrpcServer"
    }

    // To add all of the dependencies
    from(sourceSets.main.get().output)

    dependsOn(configurations.runtimeClasspath)
    from({
        configurations.runtimeClasspath.get().filter { it.name.endsWith("jar") }.map { zipTree(it) }
    })
}



repositories {
    mavenCentral()
}

tasks.test {
    useJUnit()
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
}