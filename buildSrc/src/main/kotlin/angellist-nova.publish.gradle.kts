import com.vanniktech.maven.publish.JavadocJar
import com.vanniktech.maven.publish.KotlinJvm
import com.vanniktech.maven.publish.MavenPublishBaseExtension
import com.vanniktech.maven.publish.SonatypeHost

plugins {
    id("com.vanniktech.maven.publish")
}

publishing {
  repositories {
      if (project.hasProperty("publishLocal")) {
          maven {
              name = "LocalFileSystem"
              url = uri("${rootProject.layout.buildDirectory.get()}/local-maven-repo")
          }
      }
  }
}

repositories {
    gradlePluginPortal()
    mavenCentral()
}

extra["signingInMemoryKey"] = System.getenv("GPG_SIGNING_KEY")
extra["signingInMemoryKeyId"] = System.getenv("GPG_SIGNING_KEY_ID")
extra["signingInMemoryKeyPassword"] = System.getenv("GPG_SIGNING_PASSWORD")

configure<MavenPublishBaseExtension> {
    if (!project.hasProperty("publishLocal")) {
        signAllPublications()
        publishToMavenCentral(SonatypeHost.CENTRAL_PORTAL)
    }

    coordinates(project.group.toString(), project.name, project.version.toString())
    configure(
        KotlinJvm(
            javadocJar = JavadocJar.Dokka("dokkaJavadoc"),
            sourcesJar = true,
        )
    )

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
    }
}

tasks.withType<Zip>().configureEach {
    isZip64 = true
}
