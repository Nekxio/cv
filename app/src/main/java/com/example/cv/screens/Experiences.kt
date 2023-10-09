package com.example.cv.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.ListItem
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.cv.components.items
import com.example.cv.data.Experiences
import com.example.cv.layout.DefaultLayout

@Composable
fun ExperiencesScreen(navController: NavHostController, experiences: List<Experiences>) {
    DefaultLayout(navController = navController) {
        Column(
            modifier = Modifier
                .padding(all = 14.dp)
                .fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Mes expériences",
                style = MaterialTheme.typography.headlineSmall,
                modifier = Modifier.padding(vertical = 16.dp)
            )
            Spacer(modifier = Modifier.height(20.dp))
            LazyColumn {
                items(experiences) { item ->
                    ListExperiences(experience = item)
                }
            }
        }
    }
}

@Composable
fun ListExperiences(experience: Experiences) {
    ListItem(
        headlineContent = { Text(text = experience.job) },
        overlineContent = { Text(text = experience.company) },
        supportingContent = {
            if (!experience.techno.isNullOrEmpty()) {
                experience.techno.forEach { techno ->
                    Text(text = techno)
                }
            }
        },
        leadingContent = {
            Icon(
                Icons.Filled.PlayArrow,
                contentDescription = "Work",
            )
        },
        trailingContent = {
            Text(text = experience.date)
        }
    )
    Divider(color = MaterialTheme.colorScheme.primary, thickness = 1.dp)
}