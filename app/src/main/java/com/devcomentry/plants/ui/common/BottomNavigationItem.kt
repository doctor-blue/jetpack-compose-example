package com.devcomentry.plants.ui.common

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Color
import com.devcomentry.plants.R
import com.devcomentry.plants.ui.color.MainColor
import com.devcomentry.plants.ui.color.Pink

sealed class BottomNavigationItem(
    val route: String,
    @DrawableRes val icon: Int,
    @DrawableRes val iconActive: Int,
    val activeColor: Color,
    val color: Color = Color.Gray
) {
    object Home : BottomNavigationItem(
        "home",
        R.drawable.ic_home,
        R.drawable.ic_home_fill,
        MainColor
    )

    object Favorite : BottomNavigationItem(
        "favorite",
        R.drawable.ic_heart,
        R.drawable.ic_heart_fill,
        Pink
    )

    object Profile : BottomNavigationItem(
        "profile",
        R.drawable.ic_person,
        R.drawable.ic_person_fill,
        MainColor
    )
}