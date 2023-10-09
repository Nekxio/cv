package com.example.cv.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.cv.components.CommonCardInfos
import com.example.cv.components.CommonCard
import com.example.cv.data.Skill
import com.example.cv.layout.DefaultLayout

@Composable
fun SkillsScreen(navController: NavHostController, skills: List<Skill>) {
    DefaultLayout(navController = navController) {
        Column(
            modifier = Modifier
                .padding(all = 14.dp)
                .fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Mes compétences",
                style = MaterialTheme.typography.headlineSmall,
                modifier = Modifier.padding(vertical = 16.dp)
            )
            Spacer(modifier = Modifier.height(20.dp))
            LazyVerticalGrid(
                columns = GridCells.Adaptive(150.dp),
                contentPadding = PaddingValues(
                    start = 15.dp,
                    top = 15.dp,
                    end = 15.dp,
                    bottom = 15.dp
                ),
                horizontalArrangement = Arrangement.spacedBy(32.dp),
                content = {
                    items(skills) { item ->
                        ListSkills(skill = item)
                    }
                }
            )
        }
    }
}


@Composable
fun ListSkills(skill: Skill) {
    CommonCard(infos = CommonCardInfos(skill.title, null, skill.icon))
}
