plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    compileSdk = ConfigData.compileSdkVersion

    defaultConfig {
        applicationId = ConfigData.applicationId
        minSdk = ConfigData.minSdkVersion
        targetSdk = ConfigData.targetSdkVersion
        versionCode = ConfigData.versionCode
        versionName = ConfigData.versionName

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
        getByName("debug") {

        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
        kotlinOptions {
            jvmTarget = "1.8"
        }
    }
}

dependencies {
    AndroidX.loadAll().forEach { implementation(it) }
    Coroutines.loadAll().forEach { implementation(it) }
    Network.loadAll().forEach { implementation(it) }

    implementation(Koin.android)

    Features.loadAll().forEach { implementation(project(it)) }
    LocalLibs.loadAll().forEach { implementation(project(it)) }

    Test.loadAll().forEach { testImplementation(it) }
    AndroidTest.loadAll().forEach { androidTestImplementation(it) }
}