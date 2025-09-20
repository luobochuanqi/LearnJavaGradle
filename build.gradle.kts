plugins {
    id("java")
    id("application")
}

group = "xyz.luobochuanqi"
version = "1.0-SNAPSHOT"

repositories {
}

dependencies {
    implementation("com.google.code.gson:gson:2.10.1")
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

application {
    mainClass.set("xyz.luobochuanqi.App")
}