package com.devcomentry.composeexample

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
@Preview(showSystemUi = true)
fun Preview() {

}


@Composable
fun ColumnDemo() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Hello")
        Text("Who are u?")
    }
}

@Composable
fun RowDemo() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text("Hello")
        Text("Who are u?")
    }
}

@Composable
fun BoxDemo() {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Box(
            modifier = Modifier
                .width(50.dp)
                .height(50.dp)
                .background(
                    Color.Blue
                )
        )
        Box(
            modifier = Modifier
                .width(30.dp)
                .height(30.dp)
                .background(
                    Color.Red
                )
        )
        Text("First")

    }
}