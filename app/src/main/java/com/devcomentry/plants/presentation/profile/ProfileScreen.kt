package com.devcomentry.plants.presentation.profile

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.devcomentry.plants.R
import com.devcomentry.plants.ui.*
import com.devcomentry.plants.ui.color.HintColor
import com.devcomentry.plants.ui.color.TextColor

@Composable
fun ProfileScreen() {
    Column {
        Card(
            modifier = Modifier.fillMaxWidth(),
            backgroundColor = Color.White,
            shape = RoundedCornerShape(CommonItemRadius),
        ) {
            Row(
                modifier = Modifier.padding(SpaceScreenSuperSmall)
            ) {
                Image(
                    painter = painterResource(R.drawable.sample_avatar),
                    contentDescription = "Avatar",
                    modifier = Modifier.clip(
                        CircleShape
                    ).size(Space100),
                    contentScale = ContentScale.Crop
                )
                Column(
                    modifier = Modifier.fillMaxWidth()
                        .padding(
                            start = SpaceScreenSmall,
                            top = SpaceScreenSmall
                        )
                ) {
                    PlantsBoldText(
                        "Tan",
                        color = TextColor,
                    )
                    PlantsMediumText(
                        "Mobile Developer",
                        color = HintColor,
                        modifier = Modifier.padding(
                            top = Space4
                        )
                    )
                }
            }


        }
    }
}
