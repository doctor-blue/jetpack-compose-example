package com.devcomentry.plants.ui.common

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.devcomentry.plants.ui.ImgSizeMedium
import com.devcomentry.plants.ui.ImgSizeNormal


@Composable
fun ImageButton(
    painter: Painter,
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {},
    tintFilter: ColorFilter? = null,
    imgSize: Dp = ImgSizeNormal,
    size: Dp = ImgSizeMedium,
    backgroundColor: Color,
    contentColor: Color,
    contentDescription: String = "ImageButton"
) {
    Button(
        onClick = onClick,
        shape = CircleShape,
        modifier = modifier.size(size),
        contentPadding = PaddingValues(0.dp),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = backgroundColor,
            contentColor = contentColor
        ),
        elevation = ButtonDefaults.elevation(0.dp)
    ) {
        Image(
            painter = painter,
            colorFilter = tintFilter,
            modifier = Modifier.size(imgSize),
            contentDescription = contentDescription
        )
    }
}