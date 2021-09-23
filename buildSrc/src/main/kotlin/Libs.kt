object Libs {
  object Android {
    const val activity_compose = "androidx.activity:activity-compose:1.3.0-alpha08"
    const val core_ktx = "androidx.core:core-ktx:1.5.0"
    const val navigation_compose = "androidx.navigation:navigation-compose:2.4.0-alpha06"
    const val appcompat = "androidx.appcompat:appcompat:1.3.0"

    const val compose_compiler = "androidx.compose.compiler:compiler:${Version.compose}"
    const val compose_material = "androidx.compose.material:material:${Version.compose}"
    const val compose_runtime_livedata = "androidx.compose.runtime:runtime-livedata:${Version.compose}"
    const val compose_material_icons_extended = "androidx.compose.material:material-icons-extended:${Version.compose}"
    const val compose_ui = "androidx.compose.ui:ui:${Version.compose}"
    const val compose_ui_test_junit4 = "androidx.compose.ui:ui-test-junit4:${Version.compose}"
    const val compose_ui_tooling = "androidx.compose.ui:ui-tooling:${Version.compose}"
    const val compose_ui_tooling_preview = "androidx.compose.ui:ui-tooling-preview:${Version.compose}"

    const val firebase_bom = "com.google.firebase:firebase-bom:28.1.0"
    const val firebase_auth = "com.google.firebase:firebase-auth-ktx"
    const val firebase_firestore = "com.google.firebase:firebase-firestore-ktx"

    private const val accompanist = "com.google.accompanist"
    const val accompanist_insets = "$accompanist:accompanist-insets:0.18.0"
    const val google_material = "com.google.android.material:material:1.4.0"
  }
  object IOS {

  }
  object Common {
    const val google_services_plugin = "com.google.gms:google-services:4.3.10"
    const val gradle_plugin = "com.android.tools.build:gradle:7.0.2"
    const val kotlin_plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Version.kotlin}"
    const val mockk = "io.mockk:mockk-common:${Version.mockk}"
    const val kotlinx_datetime = "org.jetbrains.kotlinx:kotlinx-datetime:0.2.1"
    const val kotlinx_coroutine_core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Version.coroutine}"
    const val koin_core = "io.insert-koin:koin-core:${Version.koin}"
    const val koin_test = "io.insert-koin:koin-test:${Version.koin}"

    const val firebase_auth = "dev.gitlive:firebase-auth:${Version.firebase}"
    const val firebase_firestore = "dev.gitlive:firebase-firestore:${Version.firebase}"
  }
}
