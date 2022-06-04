package com.devcomentry.plants.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.devcomentry.plants.R

enum class PlantsCategory(
    @StringRes val title: Int,
    @DrawableRes val icon: Int
) {
    All(R.string.all, -1),
    GreenPlant(R.string.green_plants, R.drawable.green_plants),
    Flowers(
        R.string.flowers,
        R.drawable.flower_plant
    ),
    IndoorPlants(R.string.indoor_plants, R.drawable.indoor_plants)
}