plugins {
    id("nova-api-java-spike.java")
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":nova-api-java-spike-java-core"))
    implementation(project(":nova-api-java-spike-java-client-okhttp"))
}

tasks.withType<JavaCompile>().configureEach {
    // Allow using more modern APIs, like `List.of` and `Map.of`, in examples.
    options.release.set(9)
}

application {
    // Use `./gradlew :nova-api-java-spike-java-example:run` to run `Main`
    // Use `./gradlew :nova-api-java-spike-java-example:run -Pexample=Something` to run `SomethingExample`
    mainClass = "com.nova_api_java_spike.api.example.${
        if (project.hasProperty("example"))
            "${project.property("example")}Example"
        else
            "Main"
    }"
}
