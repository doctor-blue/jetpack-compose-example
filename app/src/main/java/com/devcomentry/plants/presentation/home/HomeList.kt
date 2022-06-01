package com.devcomentry.plants.presentation.home

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.devcomentry.plants.data.DataResources
import com.devcomentry.plants.data.Plant
import com.devcomentry.plants.ui.CommonItemRadius

@Composable
@Preview
fun HomeListPreview() {
    HomeList()
}

@Composable
fun HomeItem(plant: Plant) {
    Card(
        shape = RoundedCornerShape(CommonItemRadius),
        backgroundColor = Color.White
    ) {
        Image(
            painter = painterResource(plant.image),
            contentDescription = "Home Item"
        )
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomeList(
    list: List<Plant> = DataResources.plants
) {
    LazyVerticalGrid(
        cells = GridCells.Adaptive(minSize = 60.dp),
        state = rememberLazyListState(),
        contentPadding = PaddingValues(10.dp)
    ) {
        items(list) {
            HomeItem(it)
        }
    }
}