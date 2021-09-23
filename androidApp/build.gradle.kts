plugins {
  kotlin("multiplatform")
  id("com.android.application")
  id("kotlin-android-extensions")
}

repositories {
  google()
  jcenter()
}

kotlin {
  android()
  sourceSets {
    val androidMain by getting {
      dependencies {
        implementation(project(":shared"))

        implementation(Libs.Android.activity_compose)
        implementation(Libs.Android.navigation_compose)
        implementation(Libs.Android.core_ktx)
        implementation(Libs.Android.appcompat)
        implementation(Libs.Android.google_material)

//        implementation(Libs.Android.compose_compiler)
//        implementation(Libs.Android.compose_ui_tooling)
//        implementation(Libs.Android.compose_ui_tooling_preview)
//        implementation(Libs.Android.compose_ui)
//        implementation(Libs.Android.compose_material)
//        implementation(Libs.Android.compose_material_icons_extended)
//        androidTestImplementation(Libs.Android.compose_ui_test_junit4)

        implementation(Libs.Android.accompanist_insets)
      }
    }
  }
}

android {
  compileSdkVersion(31)
  defaultConfig {
    applicationId = "me.user.androidApp"
    minSdkVersion(24)
    targetSdkVersion(31)
    versionCode = 1
    versionName = "1.0"
  }
  compileOptions {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
  }
  buildTypes {
    getByName("release") {
      isMinifyEnabled = false
    }
  }
  buildFeatures {
    compose = true
  }
  composeOptions {
    kotlinCompilerExtensionVersion = Version.compose
  }
}