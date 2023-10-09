package com.example.cv.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.cv.R
import com.example.cv.components.CommonCardInfos
import com.example.cv.components.CommonCard
import com.example.cv.layout.DefaultLayout

@Composable
fun EducationScreen(navController: NavHostController) {
    DefaultLayout(navController = navController) {
        Column(
            modifier = Modifier
                .padding(all = 14.dp)
                .fillMaxWidth()
                .verticalScroll(rememberScrollState()),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Mes formations",
                style = MaterialTheme.typography.headlineSmall,
                modifier = Modifier.padding(vertical = 16.dp)
            )
            Spacer(modifier = Modifier.height(20.dp))
            Column {
                CommonCard(infos = CommonCardInfos("IUT de Lens", "DUT MMI", R.drawable.school))
                CommonCard(
                    infos = CommonCardInfos(
                        "WIS Lille",
                        "Bachelor chef de projet digital",
                        R.drawable.school
                    )
                )
                CommonCard(
                    infos = CommonCardInfos(
                        "My Digital School",
                        "MBA Développeur Fullstack",
                        R.drawable.school
                    )
                )
            }
        }
    }
}