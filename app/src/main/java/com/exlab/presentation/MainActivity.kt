package com.exlab.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.exlab.navigation.home.HomeNavigation
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {

    private val homeNavigation: HomeNavigation by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        homeNavigation.navigateToHome(this)
    }
}