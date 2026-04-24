plugins {
    `maven-publish`
    signing
}

configure<PublishingExtension> {
    publications {
        register<MavenPublication>("maven") {
            from(components["java"])

            pom {
                name.set("AngelList Nova API")
                description.set("The AngelList Nova API exposes programmatic access to fund operations including\ndistributions, vehicles, and entity management. Authentication is via OAuth2\nclient_credentials with per-scope authorization. All write operations require an\n`X-Organization-Id` header identifying the acting organization.")
                url.set("https://docs.angellist.com/nova-api")

                licenses {
                    license {
                        name.set("Apache-2.0")
                    }
                }

                developers {
                    developer {
                        name.set("Angellist Nova")
                        email.set("support@angellist.com")
                    }
                }

                scm {
                    connection.set("scm:git:git://github.com/stainless-sdks/nova-api-java-spike-java.git")
                    developerConnection.set("scm:git:git://github.com/stainless-sdks/nova-api-java-spike-java.git")
                    url.set("https://github.com/stainless-sdks/nova-api-java-spike-java")
                }

                versionMapping {
                    allVariants {
                        fromResolutionResult()
                    }
                }
            }
        }
    }
    repositories {
        if (project.hasProperty("publishLocal")) {
            maven {
                name = "LocalFileSystem"
                url = uri("${rootProject.layout.buildDirectory.get()}/local-maven-repo")
            }
        }
    }
}

signing {
    val signingKeyId = System.getenv("GPG_SIGNING_KEY_ID")?.ifBlank { null }
    val signingKey = System.getenv("GPG_SIGNING_KEY")?.ifBlank { null }
    val signingPassword = System.getenv("GPG_SIGNING_PASSWORD")?.ifBlank { null }
    if (signingKey != null && signingPassword != null) {
        useInMemoryPgpKeys(
            signingKeyId,
            signingKey,
            signingPassword,
        )
        sign(publishing.publications["maven"])
    }
}

tasks.named("publish") {
    dependsOn(":closeAndReleaseSonatypeStagingRepository")
}
