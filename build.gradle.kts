plugins {
	java
	id("org.springframework.boot") version "3.4.0"
	id("io.spring.dependency-management") version "1.1.6"
  id("io.sentry.jvm.gradle") version "4.3.0"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"

java {
	sourceCompatibility = JavaVersion.VERSION_17
}

repositories {
	mavenCentral()
}

dependencies {
  implementation("org.springframework.boot:spring-boot-starter-thymeleaf")
  // https://mvnrepository.com/artifact/nz.net.ultraq.thymeleaf/thymeleaf-layout-dialect
  implementation("nz.net.ultraq.thymeleaf:thymeleaf-layout-dialect")
  implementation("org.springframework.boot:spring-boot-starter-web")
  developmentOnly("org.springframework.boot:spring-boot-devtools")
  testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<Test> {
	useJUnitPlatform()
}

sentry {
  // Generates a JVM (Java, Kotlin, etc.) source bundle and uploads your source code to Sentry.
  // This enables source context, allowing you to see your source
  // code as part of your stack traces in Sentry.
  includeSourceContext = true

  org = "cable8mm"
  projectName = "demo-for-spring-boot"
  authToken = "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"
}
