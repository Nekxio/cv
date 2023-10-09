package com.example.cv.screens

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.example.cv.components.NameCard
import com.example.cv.components.Card
import com.example.cv.components.PersonnalInfos
import com.example.cv.layout.DefaultLayout

@Composable
fun HomeScreen(navController: NavHostController) {
    DefaultLayout(navController = navController) {
        NameCard(
            Card("Léo", "Développeur Android"),
            PersonnalInfos(
                "0612345678",
                "leo.hilaire@my-digital-school.org",
                "57 rue Pierre Mauroy, 59000 Lille"
            )
        )
    }
}