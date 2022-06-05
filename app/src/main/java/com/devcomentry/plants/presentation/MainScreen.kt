package com.devcomentry.plants.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.devcomentry.plants.R
import com.devcomentry.plants.presentation.favorites.FavoriteScreen
import com.devcomentry.plants.presentation.home.HomeScreen
import com.devcomentry.plants.presentation.profile.ProfileScreen
import com.devcomentry.plants.ui.*
import com.devcomentry.plants.ui.color.HintColor
import com.devcomentry.plants.ui.common.BottomNavigationItem
import com.devcomentry.plants.ui.common.ImageButton
import com.devcomentry.plants.ui.common.PlantsBottomNavigation

@Preview(showSystemUi = true)
@Composable
fun MainPreview() {
    MainScreen()
}

@Composable
fun MainScreen() {
    val currentRoute = remember {
        mutableStateOf(BottomNavigationItem.Home.route)
    }
    Scaffold(
        bottomBar = {
            PlantsBottomNavigation(currentRoute.value) {
                currentRoute.value = it.route
            }
        },
        backgroundColor = Color.White,
    )
    {
        Column(
            modifier = Modifier.padding(it).padding(SpaceScreenSmall)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                ImageButton(
                    painterResource(R.drawable.ic_menu),
                    onClick = {

                    },
                    backgroundColor = Color.White,
                    contentColor = Color.Black,
                    imgSize = ImgSizeSmall,
                    size = ImgSizeNormal
                )
                PlantsLightText("Welcome", Color.Black, fontSize = TextSize18)
                ImageButton(
                    painterResource(R.drawable.ic_outline_shopping_cart_24),
                    onClick = {

                    },
                    backgroundColor = Color.White,
                    contentColor = HintColor,
                    imgSize = ImgSizeSmall,
                    size = ImgSizeNormal
                )
            }
            when (currentRoute.value) {
                BottomNavigationItem.Home.route -> HomeScreen()
                BottomNavigationItem.Profile.route -> ProfileScreen()
                BottomNavigationItem.Favorite.route -> FavoriteScreen()
            }
        }
    }

}