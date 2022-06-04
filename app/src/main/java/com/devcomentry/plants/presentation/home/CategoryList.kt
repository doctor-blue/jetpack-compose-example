package com.devcomentry.plants.presentation.home

import android.util.Log
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.devcomentry.plants.data.DataResources
import com.devcomentry.plants.data.PlantsCategory
import com.devcomentry.plants.ui.*
import com.devcomentry.plants.ui.color.HintColor
import com.devcomentry.plants.ui.color.MainColor

@Composable
fun CategoryItem(
    category: PlantsCategory,
    isSelected: Boolean,
    onCategorySelected: (PlantsCategory) -> Unit
) {
    Button(
        shape = RoundedCornerShape(CommonItemRadius),
        modifier = Modifier
            .padding(
                horizontal = Space4
            ),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = if (isSelected) MainColor else Color.White,
        ),
        elevation = ButtonDefaults.elevation(Space2),
        onClick = {
            onCategorySelected(category)
        }
    ) {
        PlantsMediumText(
            text = stringResource(id = category.title),
            color = if (isSelected) Color.White else HintColor,
            fontSize = TextSize14,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth()
        )
    }
}


@Composable
fun CategoryList(
    modifier: Modifier = Modifier,
    categoryList: List<PlantsCategory> = DataResources.categories,
    onCategorySelected: (PlantsCategory) -> Unit,
) {
    val currentCategory = remember {
        mutableStateOf(PlantsCategory.All)
    }

    Log.d("HomeScreen", "CategoryList: $currentCategory")
    LazyRow(modifier = modifier) {
        items(categoryList) { category ->
            CategoryItem(category = category, isSelected = currentCategory.value == category) {
                currentCategory.value = it
                onCategorySelected(it)
            }
        }
    }
}