package com.example.cv.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

data class CommonCardInfos(val title: String, val subtitle: String?, val icon: Int)

@Composable
fun CommonCard(infos: CommonCardInfos) {
    ElevatedCard(
        elevation = CardDefaults.cardElevation(
            defaultElevation = 6.dp
        ),
        modifier = Modifier
            .padding(vertical = 20.dp)
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
                .width(150.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Icon(
                painter = painterResource(id = infos.icon),
                contentDescription = infos.title,
                modifier = Modifier
                    .padding(16.dp)
                    .size(24.dp)
            )
            Text(
                text = infos.title,
                modifier = Modifier
                    .padding(16.dp),
                textAlign = TextAlign.Center,
            )
            if (infos.subtitle?.isNotBlank() == true) {
                Text(
                    text = infos.subtitle,
                    modifier = Modifier
                        .padding(16.dp),
                    textAlign = TextAlign.Center,
                )
            }
        }
    }
}