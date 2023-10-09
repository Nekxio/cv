package com.example.cv.layout

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.example.cv.components.AppBar
import com.example.cv.components.BottomNavigationBar

@Composable
fun DefaultLayout(navController: NavHostController, content: @Composable () -> Unit) {
    var selectedItem by remember { mutableIntStateOf(0) }

    Scaffold(topBar = {
        AppBar()
    }, bottomBar = {
        BottomNavigationBar(selectedItem = selectedItem) { selected ->
            selectedItem = selected
            when (selected) {
                0 -> navController.navigate("home")
                1 -> navController.navigate("skills")
                2 -> navController.navigate("education")
                3 -> navController.navigate("experiences")
            }
        }
    }) { contentPadding ->
        Box(modifier = Modifier.padding(contentPadding)) {
            content()
        }
    }
}