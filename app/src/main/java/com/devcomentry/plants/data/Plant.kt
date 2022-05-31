package com.devcomentry.plants.data

import androidx.annotation.DrawableRes

class Plant(
    val name: String,
    val price: Double,
    val unit: String,
    val description: String,
    @DrawableRes val image: Int,
    val category: PlantsCategory,
    val isFavorite: Boolean
)