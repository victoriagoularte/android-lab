package com.exlab.home.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.exlab.components.lists.MenuCardData
import com.exlab.components.lists.MenuCardGrid
import com.exlab.home.R
import com.exlab.theme.Theme

class HomeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.surface
            ) {
                val cards = listOf(
                    MenuCardData(
                        R.string.menu_calendar_label,
                        R.string.menu_calendar_description,
                        com.google.android.material.R.drawable.material_ic_calendar_black_24dp
                    ),
                    MenuCardData(
                        R.string.menu_calendar_label,
                        R.string.menu_calendar_description,
                        com.google.android.material.R.drawable.material_ic_calendar_black_24dp
                    ),
                    MenuCardData(
                        R.string.menu_calendar_label,
                        R.string.menu_calendar_description,
                        com.google.android.material.R.drawable.material_ic_calendar_black_24dp
                    ),
                    MenuCardData(
                        R.string.menu_calendar_label,
                        R.string.title_activity_home,
                        com.google.android.material.R.drawable.material_ic_calendar_black_24dp
                    )
                )
                MenuCardGrid(cards = cards)
            }

        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Theme {
        Greeting("Android")
    }
}