package com.devcomentry.plants.data

import com.devcomentry.plants.R

object DataResources {
    val categories: List<PlantsCategory> = listOf(
        PlantsCategory.All,
        PlantsCategory.Flowers,
        PlantsCategory.GreenPlant,
        PlantsCategory.IndoorPlants
    )

    val plants: List<Plant> = listOf(
        Plant(
            "Sample 1",
            60.0,
            "$",
            "",
            R.drawable.sample9,
            PlantsCategory.IndoorPlants,
            true
        ),
        Plant(
            "Sample 2",
            80.0,
            "$",
            "",
            R.drawable.sample9,
            PlantsCategory.IndoorPlants,
            false
        ),
        Plant(
            "Sample 3",
            75.0,
            "$",
            "",
            R.drawable.sample9,
            PlantsCategory.IndoorPlants,
            true
        ),
        Plant(
            "Sample 4",
            50.0,
            "$",
            "",
            R.drawable.sample9,
            PlantsCategory.IndoorPlants,
            false
        ),
        Plant(
            "Sample 5",
            90.0,
            "$",
            "",
            R.drawable.sample9,
            PlantsCategory.IndoorPlants,
            false
        ),
        Plant(
            "Sample 6",
            91.2,
            "$",
            "",
            R.drawable.sample9,
            PlantsCategory.IndoorPlants,
            false
        ),
        Plant(
            "Sample 7",
            102.6,
            "$",
            "",
            R.drawable.sample9,
            PlantsCategory.IndoorPlants,
            false
        ),
        Plant(
            "Sample 8",
            18.7,
            "$",
            "",
            R.drawable.sample9,
            PlantsCategory.IndoorPlants,
            false
        ),
        Plant(
            "Sample 9",
            20.5,
            "$",
            "",
            R.drawable.sample9,
            PlantsCategory.IndoorPlants,
            false
        ),
        Plant(
            "Sample 10",
            9.8,
            "$",
            "",
            R.drawable.sample9,
            PlantsCategory.IndoorPlants,
            false
        ),
        Plant(
            "Sample 11",
            228.0,
            "$",
            "",
            R.drawable.sample9,
            PlantsCategory.IndoorPlants,
            false
        ),
    )

}