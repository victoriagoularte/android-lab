object BuildPlugins {
    val android by lazy { "com.android.tools.build:gradle:${Versions.gradlePlugin}" }
    val kotlin by lazy { "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}" }
}


object AndroidX {
    val core by lazy { "androidx.core:core-ktx:${Versions.core}" }
    val appCompat by lazy { "androidx.appcompat:appcompat:${Versions.appCompat}" }
    val constraintLayout by lazy { "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}" }
    val viewModel by lazy { "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.viewModel}" }
    val navigation by lazy { "androidx.navigation:navigation-ui-ktx:${Versions.navigation}" }
    val lifecycle by lazy { "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycle}" }
    val cardView by lazy { "androidx.cardview:cardview:${Versions.cardView}" }
    val room by lazy { "androidx.room:room-runtime:${Versions.room}" }
    val roomCompiler by lazy { "androidx.room:room-compiler:${Versions.room}" }
    val roomKtx by lazy { "androidx.room:room-ktx:${Versions.room}" }

    fun loadAll() =
        listOf(core, appCompat, constraintLayout, viewModel, navigation, lifecycle, cardView)
}

object AndroidTest {
    val junit by lazy { "junit:junit:${Versions.jUnit}" }
    val junitExt by lazy { "androidx.test.ext:junit:${Versions.junit}" }
    val espresso by lazy { "androidx.test.espresso:espresso-core:${Versions.espresso}" }
    val navigation by lazy { "androidx.navigation:navigation-testing:${Versions.navigation}" }

    fun loadAll() = listOf(junit, junitExt, espresso, navigation)
}

object Test {
    val coroutinesTest by lazy { "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.coroutinesTest}" }
    val kotlinTest by lazy { "org.jetbrains.kotlin:kotlin-test:${Versions.kotlinTest}" }
    val turbine by lazy { "app.cash.turbine:turbine:${Versions.turbine}" }
    val mockk by lazy { "io.mockk:mockk:${Versions.mockk}" }
    val koinTest by lazy { "io.insert-koin:koin-test:${Versions.koin}" }
    val koinTestJunit by lazy { "io.insert-koin:koin-test-junit4:${Versions.koin}" }

    fun loadAll() = listOf(coroutinesTest, kotlinTest, turbine, mockk, koinTest, koinTestJunit)
}

object Coroutines {
    val core by lazy { "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutinesCore}" }
    val android by lazy { "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutinesAndroid}" }

    fun loadAll() = listOf(
        core, android
    )
}

object Koin {
    val android by lazy { "io.insert-koin:koin-android:${Versions.koin}" }
}

object Network {
    val retrofit by lazy { "com.squareup.retrofit2:retrofit:${Versions.retrofit}" }
    val gson by lazy { "com.squareup.retrofit2:converter-gson:${Versions.retrofit}" }
    val logging by lazy { "com.squareup.okhttp3:logging-interceptor:${Versions.logging}" }

    fun loadAll() = listOf(retrofit, gson, logging)
}

object Features {
    val first by lazy { ":features:first" }
    val home by lazy { ":features:home" }

    fun loadAll() = listOf(first, home)
}

object LocalLibs {
    val ds by lazy { ":ds" }
    val navigation by lazy { ":navigation" }

    fun loadAll() = listOf(ds, navigation)
}

object Compose {
    val bom by lazy { "androidx.compose:compose-bom:2022.10.00" }
    val material3 by lazy { "androidx.compose.material3:material3" }
    val material2 by lazy { "androidx.compose.material:material" }
    val foundation by lazy { "androidx.compose.foundation:foundation" }
    val ui by lazy { "androidx.compose.ui:ui" }
    val support by lazy { "androidx.compose.ui:ui-tooling-preview" }
    val materialIcons by lazy { "androidx.compose.material:material-icons-core" }
    val materialIconsExt by lazy { "androidx.compose.material:material-icons-extended" }
    val windowSize by lazy { "androidx.compose.material3:material3-window-size-class" }
    val activity by lazy { "androidx.activity:activity-compose:1.5.1" }
    val viewModel by lazy { "androidx.lifecycle:lifecycle-viewmodel-compose:2.5.1" }
    val liveData by lazy { "androidx.compose.runtime:runtime-livedata" }
    val uiTest by lazy { "androidx.compose.ui:ui-test-junit4" }
    val uiManifest by lazy { "androidx.compose.ui:ui-test-manifest" }
    val uiTooling by lazy { "androidx.compose.ui:ui-tooling" }

    fun loadAll() = listOf(
        material2,
        material3,
        foundation,
        ui,
        support,
        materialIcons,
        materialIconsExt,
        windowSize,
        activity,
        viewModel,
        liveData,
        uiTest,
        uiManifest,
        uiTooling
    )
}
