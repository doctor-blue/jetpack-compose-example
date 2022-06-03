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
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.devcomentry.plants.data.DataResources
import com.devcomentry.plants.data.Plant
import com.devcomentry.plants.ui.*

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
            .padding(0.dp)
            .padding(Space10)
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Column {
                Image(
                    painter = painterResource(plant.image),
                    contentDescription = "Home Item",
                    modifier = Modifier.fillMaxWidth()
                )
                PlantsMediumText(
                    text = plant.name,
                    color = Color.Black,
                    fontSize = TextSize14,
                    modifier = Modifier
                        .padding(
                            horizontal = SpaceScreenSuperSmall
                        )
                        .padding(top = SpaceScreenSuperSmall)
                )
                PlantsBoldText(
                    text = "${plant.price} ${plant.unit}",
                    color = Color.Black,
                    fontSize = TextSize14,
                    modifier = Modifier.padding(
                        horizontal = SpaceScreenSuperSmall
                    )
                )
            }
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
        contentPadding = PaddingValues(10.dp)
    ) {
        items(list) {
            HomeItem(plant = it)
        }
    }
}