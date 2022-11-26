plugins {
    id("com.android.library")
    kotlin("android")
}

android {
    compileSdk = ConfigData.compileSdkVersion

    defaultConfig {
        minSdk = ConfigData.minSdkVersion
        targetSdk = ConfigData.targetSdkVersion

        testInstrumentationRunner = ConfigData.testInstrumentationRunner
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    buildFeatures {
        compose = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.3.2"
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_11.toString()
    }
}

dependencies {
    val composeBom = platform(Compose.bom)
    implementation(composeBom)
    androidTestImplementation(composeBom)

    implementation(AndroidX.core)
    implementation(AndroidX.appCompat)
    Compose.loadAll().forEach { implementation(it) }
    testImplementation(AndroidTest.junit)
    androidTestImplementation(AndroidTest.junitExt)
}