package com.devcomentry.plants.presentation.home

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.devcomentry.plants.R
import com.devcomentry.plants.data.DataResources
import com.devcomentry.plants.data.Plant
import com.devcomentry.plants.ui.*
import com.devcomentry.plants.ui.color.MainColor
import com.devcomentry.plants.ui.color.RedMain
import com.devcomentry.plants.ui.color.TextColor

@Composable
@Preview
fun HomeListPreview() {
    HomeList()
}

@Composable
fun HomeItem(plant: Plant) {
    Card(
        shape = RoundedCornerShape(CommonItemRadius),
        backgroundColor = Color.White,
        modifier = Modifier
            .padding(6.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Column {
                Image(
                    painter = painterResource(plant.image),
                    contentDescription = plant.name,
                    modifier = Modifier.fillMaxWidth(),
                    contentScale = ContentScale.FillWidth
                )
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
            }
            Image(
                painter = painterResource(
                    if (plant.isFavorite)
                        R.drawable.ic_heart_fill
                    else
                        R.drawable.ic_heart
                ),
                contentDescription = plant.name,
                modifier =
                Modifier
                    .align(Alignment.BottomEnd)
                    .padding(0.dp)
                    .padding(
                        bottom = SpaceScreenSuperSmall,
                        end = SpaceScreenSuperSmall
                    ),
                contentScale = ContentScale.FillWidth,
                colorFilter = ColorFilter.tint(
                    color =
                    if (plant.isFavorite)
                        RedMain
                    else
                        Color.Gray
                )
            )
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomeList(
    list: List<Plant> = DataResources.plants
) {
    LazyVerticalGrid(
        cells = GridCells.Fixed(2),
        state = rememberLazyListState(),
    ) {
        items(list) {
            HomeItem(plant = it)
        }
    }
}