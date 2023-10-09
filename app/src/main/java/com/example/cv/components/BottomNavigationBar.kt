package com.example.cv.components

import android.graphics.drawable.Drawable
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import com.example.cv.R

data class BottomNavItem(val label: String, val icon: Int)

val items = listOf(
    BottomNavItem("Accueil", R.drawable.home),
    BottomNavItem("Compétences", R.drawable.skills),
    BottomNavItem("Formations", R.drawable.school),
    BottomNavItem("Expériences", R.drawable.work)
)

@Composable
fun BottomNavigationBar(selectedItem: Int, onItemSelected: (Int) -> Unit) {
    NavigationBar {
        items.forEachIndexed { index, item ->
            NavigationBarItem(
                icon = {
                    Icon(
                        painter = painterResource(id = item.icon),
                        contentDescription = item.label
                    )
                },
                label = { Text(item.label) },
                selected = selectedItem == index,
                onClick = { onItemSelected(index) }
            )
        }
    }
}