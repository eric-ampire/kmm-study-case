plugins {
  kotlin("multiplatform")
  id("com.android.library")
  id("kotlin-android-extensions")
  kotlin("plugin.serialization") version Version.kotlin
}

repositories {
  google()
  jcenter()
}

kotlin {
  android()
  ios {
    binaries {
      framework {
        baseName = "shared"
      }
    }
  }
  sourceSets {
    // Common
    val commonMain by getting {
      dependencies {
        implementation(Libs.Common.kotlinx_datetime)
        implementation(Libs.Common.kotlinx_coroutine_core)
        implementation(Libs.Common.koin_core)
        implementation(Libs.Common.firebase_auth)
        implementation(Libs.Common.firebase_firestore)
      }
    }
    val commonTest by getting {
      dependencies {
        implementation(kotlin("test-common"))
        implementation(kotlin("test-annotations-common"))
        implementation(Libs.Common.koin_test)
        implementation(Libs.Common.mockk)
      }
    }

    // Android
    val androidMain by getting
    val androidTest by getting

    // iOS
    val iosMain by getting
    val iosTest by getting
  }
}

android {
  compileSdkVersion(29)
  sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")
  defaultConfig {
    minSdkVersion(24)
    targetSdkVersion(29)
  }
  compileOptions {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
  }
}