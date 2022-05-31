package com.devcomentry.plants.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import com.devcomentry.plants.ui.color.PlantsDarkColor
import com.devcomentry.plants.ui.color.PlantsLightColor

// ...

@Composable
fun PlantsTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colors = if (darkTheme) PlantsDarkColor else PlantsLightColor,
        content = content
    )
}