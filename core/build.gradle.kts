plugins {
  kotlin("jvm")
  kotlin("plugin.serialization")
  id("io.bkbn.sourdough.library.jvm")
  id("com.apollographql.apollo3")
  id("io.gitlab.arturbosch.detekt")
  id("com.adarshr.test-logger")
  id("org.jetbrains.kotlinx.kover")
  id("maven-publish")
  id("java-library")
}

apollo {
  generateKotlinModels.set(true)
  service("karambit") {
    schemaFile.set(file("src/main/graphql/schema.graphqls"))
    packageName.set("io.github.unredundant.karambit.core")
  }
}

sourdoughLibrary {
  githubOrg.set("unredundant")
  githubRepo.set("karambit")
  libraryName.set("karambit-core")
  libraryDescription.set("Dagger.io Kotlin SDK")
  licenseName.set("MIT License")
  licenseUrl.set("https://mit-license.org")
  developerId.set("unredundant")
  developerName.set("Ryan Brink")
  developerEmail.set("admin@bkbn.io")
}

dependencies {
  api("com.apollographql.apollo3:apollo-runtime:4.0.0-alpha.2")
}

testing {
  suites {
    named<JvmTestSuite>("test") {
      useJUnitJupiter()
      dependencies {
        // Kotest
        implementation("io.kotest:kotest-runner-junit5-jvm:5.5.4")
        implementation("io.kotest:kotest-assertions-core-jvm:5.5.4")
      }
    }
  }
}
