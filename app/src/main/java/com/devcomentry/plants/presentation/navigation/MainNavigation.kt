package com.devcomentry.plants.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.devcomentry.lib.ComposeScreen

sealed class Screen(_route: String) : ComposeScreen(_route) {
    object MainScreen : Screen("main_screen")
}

@Composable
fun MainNavGraph(
    navController: NavHostController,
) {
    NavHost(
        navController = navController,
        startDestination = Screen.MainScreen.route
    ) {

    }
}