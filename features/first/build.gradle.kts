plugins {
    id("com.android.library")
    id("kotlin-kapt")
    id("kotlin-parcelize")
    kotlin("android")
}

android {
    compileSdk = ConfigData.compileSdkVersion

    defaultConfig {
        minSdk = ConfigData.minSdkVersion
        targetSdk = ConfigData.targetSdkVersion
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false

        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_11.toString()
    }
}

dependencies {
    AndroidX.loadAll().forEach { implementation(it) }
    Coroutines.loadAll().forEach { implementation(it) }
    Network.loadAll().forEach { implementation(it) }

    annotationProcessor(AndroidX.room)
    kapt(AndroidX.roomCompiler)

    implementation(Koin.android)
}
