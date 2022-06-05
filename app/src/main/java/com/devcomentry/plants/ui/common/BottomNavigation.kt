package com.devcomentry.plants.ui.common

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.devcomentry.plants.ui.ImgSizeSmall
import com.devcomentry.plants.ui.SpaceScreenSmall

@Composable
@Preview
fun BottomNavPreview() {
    PlantsBottomNavigation("favorite") {}
}

@Composable
fun PlantsBottomNavigation(
    selectedRoute: String,
    onItemSelected: (BottomNavigationItem) -> Unit
) {
    val items = listOf(
        BottomNavigationItem.Home,
        BottomNavigationItem.Favorite,
        BottomNavigationItem.Profile,
    )

    val navShape = RoundedCornerShape(
        topStart = ImgSizeSmall, topEnd = ImgSizeSmall
    )

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clip(navShape)
            .background(MaterialTheme.colors.surface)
            .padding(vertical = SpaceScreenSmall),
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically
    ) {
        items.forEach {

            val isSelected = it.route == selectedRoute

            val iconColor = if (isSelected)
                it.activeColor
            else
                it.color

            IconButton(onClick = {
                if (!isSelected)
                    onItemSelected(it)
            }) {
                Icon(
                    painter = painterResource(if (isSelected) it.iconActive else it.icon),
                    contentDescription = null,
                    tint = iconColor
                )
            }

        }


    }


}