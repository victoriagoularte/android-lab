package com.exlab.home.navigation

import android.content.Context
import android.content.Intent
import com.exlab.home.presentation.HomeActivity
import com.exlab.navigation.home.HomeNavigation

class HomeNavigationImpl : HomeNavigation {

    override fun navigateToHome(context: Context) {
        context.startActivity(Intent(context, HomeActivity::class.java))
    }
}
