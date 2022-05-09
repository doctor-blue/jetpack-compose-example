package com.devcomentry.composeexample

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview

@Composable
@Preview(showSystemUi = true)
fun Preview(){
//    ColumnTest()
    RowTest()
}


@Composable
fun ColumnTest(){
    Column(verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Hello")
        Text("Who are u?")
    }
}
@Composable
fun RowTest(){
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text("Hello")
        Text("Who are u?")
    }
}