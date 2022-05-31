package com.devcomentry.plants

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.Scaffold
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.devcomentry.plants.presentation.MainScreen
import com.devcomentry.plants.presentation.favorites.FavoriteScreen
import com.devcomentry.plants.presentation.home.HomeScreen
import com.devcomentry.plants.presentation.profile.ProfileScreen
import com.devcomentry.plants.ui.common.BottomNavigationItem
import com.devcomentry.plants.ui.common.PlantsBottomNavigation
import com.devcomentry.plants.ui.theme.PlantsTheme

class MainActivity : AppCompatActivity() {
    private var navController: NavHostController? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            navController = rememberNavController()
            PlantsTheme {
                MainScreen()
            }
        }
    }
}