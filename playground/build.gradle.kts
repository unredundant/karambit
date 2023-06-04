plugins {
  kotlin("jvm")
  kotlin("plugin.serialization")
  id("io.bkbn.sourdough.application.jvm")
  id("io.gitlab.arturbosch.detekt")
  id("application")
}

dependencies {
  implementation(projects.karambit.core)
}

application {
  mainClass.set("io.github.unredundant.karambit.playground.PlaygroundKt")
}
