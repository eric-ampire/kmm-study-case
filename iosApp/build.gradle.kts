plugins {
    id("org.jetbrains.gradle.apple.applePlugin") version "212.4638.14-0.13.1"
}

apple {
    iosApp {
        productName = "kmmstudycase"

        sceneDelegateClass = "SceneDelegate"
        launchStoryboard = "LaunchScreen"

        //productInfo["NSAppTransportSecurity"] = mapOf("NSAllowsArbitraryLoads" to true)
        //buildSettings.OTHER_LDFLAGS("")

        dependencies {
            implementation(project(":shared"))
        }
    }
}
