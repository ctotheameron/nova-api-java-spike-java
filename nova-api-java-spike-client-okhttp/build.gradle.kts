plugins {
    id("angellist-nova-java-spike.kotlin")
    id("angellist-nova-java-spike.publish")
}

dependencies {
    api(project(":nova-api-java-spike-core"))

    implementation("com.squareup.okhttp3:okhttp:4.12.0")
    implementation("com.squareup.okhttp3:logging-interceptor:4.12.0")

    testImplementation(kotlin("test"))
    testImplementation("org.assertj:assertj-core:3.27.7")
    testImplementation("com.github.tomakehurst:wiremock-jre8:2.35.2")
}
