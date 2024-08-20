plugins {
    java
    application
}

application {
    mainClass.set("src/main/java/ru/bykova/Main.java")
}

dependencies {
    implementation("log4j:log4j:1.2.17")
    implementation(project(":starter-lib"))
}
