rootProject.name = "karambit"

include("core")
include("playground")

// Feature Previews
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

// Plugin Repositories
pluginManagement {
  repositories {
    gradlePluginPortal()
    mavenLocal()
  }
}
