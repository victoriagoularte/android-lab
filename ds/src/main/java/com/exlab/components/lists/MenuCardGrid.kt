package com.exlab.components.lists

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.exlab.components.cards.MenuCard

@Composable
fun MenuCardGrid(cards: List<MenuCardData>) {
    LazyVerticalGrid(
        columns = GridCells.Adaptive(minSize = 128.dp)
    ) {
        items(cards) { card ->
            val label = stringResource(card.label)
            val description = stringResource(card.description)
            MenuCard(card.icon, label, description)
        }
    }
}

data class MenuCardData(
    @StringRes val label: Int,
    @StringRes val description: Int,
    @DrawableRes val icon: Int,
)