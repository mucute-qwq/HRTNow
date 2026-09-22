plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.compose)
}

android {
    namespace = "io.github.mucute.qwq.hrtnow"
}

dependencies {
    implementation(project(":shared"))
}