package com.devcomentry.plants.presentation.home

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.devcomentry.plants.ui.PlantsBoldText

@Composable
fun HomeScreen() {
    Column {
        PlantsBoldText("Hello", Color.Black)
    }
}