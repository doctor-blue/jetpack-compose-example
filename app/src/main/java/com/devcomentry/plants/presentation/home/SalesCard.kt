package com.devcomentry.plants.presentation.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.devcomentry.plants.R
import com.devcomentry.plants.ui.*
import com.devcomentry.plants.ui.color.MainColor
import com.devcomentry.plants.ui.color.TextColor

@Preview
@Composable
fun Preview() {
    SalesCard()
}

@Composable
fun SalesCard(
    modifier: Modifier = Modifier,
) {
    Button(
        shape = RoundedCornerShape(CommonItemRadius),
        modifier = modifier,
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color(0xffefebe8),
        ),
        elevation = ButtonDefaults.elevation(Space2),
        onClick = {

        }
    ) {
        Row {
            Column {
                PlantsMediumText(
                    text = "Brighten a Day,\nToday",
                    color = TextColor,
                    fontSize = TextSize32
                )
                PlantsMediumText(
                    text = "Discount until", color = TextColor,
                    fontSize = TextSize16
                )
                PlantsBoldText(
                    text = "70% Off", color = MainColor,
                    fontSize = TextSize18,
                )
            }
            Image(
                painter = painterResource(R.drawable.sample_avatar),
                contentDescription = "avatar",
                contentScale = ContentScale.Crop,            // crop the image if it's not a square
                modifier = Modifier
                    .size(Space100)
                    .clip(CircleShape)
                    .align(Alignment.CenterVertically)
            )
        }
    }
}