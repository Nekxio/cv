package com.example.cv.controllers

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.cv.data.experiences
import com.example.cv.data.skills
import com.example.cv.screens.EducationScreen
import com.example.cv.screens.ExperiencesScreen
import com.example.cv.screens.HomeScreen
import com.example.cv.screens.SkillsScreen

@Composable
fun NavigationController(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = "home"
) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination
    ) {
        composable("home") { HomeScreen(navController = navController) }
        composable("skills") { SkillsScreen(navController = navController, skills = skills) }
        composable("education") { EducationScreen(navController = navController) }
        composable("experiences") {
            ExperiencesScreen(navController = navController, experiences = experiences)
        }
    }
}
