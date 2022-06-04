package com.devcomentry.plants.presentation.home

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.devcomentry.plants.ui.*
import com.devcomentry.plants.ui.color.TextColor

@Composable
@Preview(showSystemUi = true)
fun HomeScreenPreview() {
    HomeScreen()
}

@Composable
fun HomeScreen() {
    val (value, onValueChange) = remember { mutableStateOf("") }

    Column(
        modifier = Modifier.padding(top = SpaceScreenNormal)
    ) {
        TextField(
            value = value,
            onValueChange = onValueChange,
            textStyle = TextStyle(fontSize = 17.sp),
            leadingIcon = {
                Icon(
                    Icons.Filled.Search, null,
                    tint = Color.Gray
                )
            },
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFFE7F1F1), RoundedCornerShape(16.dp)),
            placeholder = { Text(text = "Enter plant's name here...") },
            colors = TextFieldDefaults.textFieldColors(
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                backgroundColor = Color.Transparent,
                cursorColor = Color.DarkGray
            )
        )
        SalesCard(
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    bottom = SpaceScreenSmall,
                    top = SpaceScreenNormal
                )
        )
        PlantsBoldText(
            text = "Categories", color = TextColor, fontSize = TextSize18,
            modifier = Modifier.padding(vertical = SpaceScreenSuperSmall)
        )
        CategoryList(
            onCategorySelected = {
                Log.d("HomeScreen", "HomeScreen: $it")
            },
            modifier = Modifier.padding(
                bottom = SpaceScreenSuperSmall
            )
        )
        HomeList()
    }
}