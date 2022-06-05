package com.devcomentry.plants.presentation.favorites

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.devcomentry.plants.data.DataResources
import com.devcomentry.plants.data.Plant
import com.devcomentry.plants.ui.*
import com.devcomentry.plants.ui.color.HintColor
import com.devcomentry.plants.ui.color.MainColor
import com.devcomentry.plants.ui.color.TextColor

@Preview
@Composable
fun FavoritePreview() {
    FavoriteScreen()
}

@Composable
fun FavoriteItem(
    plant: Plant
) {
    Card(
        shape = RoundedCornerShape(CommonItemRadius),
        backgroundColor = Color.White,
        modifier = Modifier
            .padding(
                vertical = Space4
            ).fillMaxWidth()
    ) {
        Row(
            modifier = Modifier.padding(SpaceScreenSuperSmall)
        ) {
            Image(
                painter = painterResource(plant.image),
                contentDescription = "Favorite",
                contentScale = ContentScale.Crop,            // crop the image if it's not a square
                modifier = Modifier
                    .size(Space100)
                    .clip(
                        RoundedCornerShape(Space16)
                    )
                    .align(Alignment.CenterVertically)
            )
            Column(
                modifier = Modifier.fillMaxWidth()
                    .padding(
                        start = SpaceScreenSmall
                    )
            ) {
                PlantsMediumText(
                    text = plant.name,
                    color = TextColor,
                    fontSize = TextSize14,
                    modifier = Modifier
                        .padding(
                            horizontal = SpaceScreenSuperSmall
                        )
                        .padding(
                            top = SpaceScreenSuperSmall,
                            bottom = SpaceScreenSuperSmall
                        )
                )
                PlantsBoldText(
                    text = "${plant.price} ${plant.unit}",
                    color = MainColor,
                    fontSize = TextSize14,
                    modifier = Modifier
                        .padding(
                            horizontal = SpaceScreenSuperSmall
                        )
                        .padding(bottom = SpaceScreenSuperSmall),
                    maxLines = 1
                )
                PlantsBoldText(
                    text = plant.category.name,
                    color = HintColor,
                    fontSize = TextSize14,
                    modifier = Modifier
                        .padding(
                            horizontal = SpaceScreenSuperSmall
                        )
                        .padding(
                            top = SpaceScreenSuperSmall,
                            bottom = SpaceScreenSuperSmall
                        )
                )
            }
        }
    }
}

@Composable
fun FavoriteScreen(
    plants: List<Plant> = DataResources.plants.filter { it.isFavorite }
) {
    Column {
        PlantsBoldText(
            text = "Your plants",
            color = TextColor,
            fontSize = TextSize18,
            modifier = Modifier.padding(vertical = SpaceScreenSuperSmall)
        )
        LazyColumn {
            items(
                plants
            ) {
                FavoriteItem(it)
            }
        }
    }
}