plugins {
    id("angellist-nova.java")
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":angellist-nova-java-core"))
    implementation(project(":angellist-nova-java-client-okhttp"))
}

tasks.withType<JavaCompile>().configureEach {
    // Allow using more modern APIs, like `List.of` and `Map.of`, in examples.
    options.release.set(9)
}

application {
    // Use `./gradlew :angellist-nova-java-example:run` to run `Main`
    // Use `./gradlew :angellist-nova-java-example:run -Pexample=Something` to run `SomethingExample`
    mainClass = "com.angellist.nova.api.example.${
        if (project.hasProperty("example"))
            "${project.property("example")}Example"
        else
            "Main"
    }"
}
