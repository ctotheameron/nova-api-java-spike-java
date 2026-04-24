plugins {
    id("angellist-nova.java")
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":nova-api-java-spike-core"))
    implementation(project(":nova-api-java-spike-client-okhttp"))
}

tasks.withType<JavaCompile>().configureEach {
    // Allow using more modern APIs, like `List.of` and `Map.of`, in examples.
    options.release.set(9)
}

application {
    // Use `./gradlew :nova-api-java-spike-example:run` to run `Main`
    // Use `./gradlew :nova-api-java-spike-example:run -Pexample=Something` to run `SomethingExample`
    mainClass = "io.github.ctotheameron.example.${
        if (project.hasProperty("example"))
            "${project.property("example")}Example"
        else
            "Main"
    }"
}
