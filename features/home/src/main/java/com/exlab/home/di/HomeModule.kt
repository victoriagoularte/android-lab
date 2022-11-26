package com.exlab.home.di

import com.exlab.home.navigation.HomeNavigationImpl
import com.exlab.navigation.home.HomeNavigation
import org.koin.dsl.module

val navigationModule = module {

    factory<HomeNavigation> { HomeNavigationImpl() }
}

val homeModule = listOf(navigationModule)