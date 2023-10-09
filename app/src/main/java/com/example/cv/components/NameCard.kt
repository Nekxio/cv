package com.example.cv.components

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Icon
import androidx.compose.material3.ListItem
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cv.R
import com.example.cv.ui.theme.CvTheme

data class Card(val name: String, val job: String)
data class PersonnalInfos(val phone: String, val email: String, val location: String)

@Composable
fun NameCard(status: Card, infos: PersonnalInfos) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(all = 14.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(R.drawable.profile_picture),
            contentDescription = "Contact profile picture",
            modifier = Modifier
                .size(100.dp)
                .clip(CircleShape)
                .border(2.dp, MaterialTheme.colorScheme.primary, CircleShape)
        )

        Spacer(modifier = Modifier.width(8.dp))

        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                text = status.name,
                color = MaterialTheme.colorScheme.primary,
                style = MaterialTheme.typography.headlineLarge.copy(
                    fontWeight = FontWeight.Bold
                )
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = status.job,
                style = MaterialTheme.typography.headlineSmall
            )
            Spacer(modifier = Modifier.height(50.dp))
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {

                ListItem(
                    headlineContent = { Text(text = infos.phone) },
                    leadingContent = {
                        Icon(
                            Icons.Filled.Phone,
                            contentDescription = "Phone icon",
                        )
                    }
                )
                ListItem(
                    headlineContent = { Text(text = infos.email) },
                    leadingContent = {
                        Icon(
                            Icons.Filled.Email,
                            contentDescription = "Email icon",
                        )
                    }
                )
                ListItem(
                    headlineContent = { Text(text = infos.location) },
                    leadingContent = {
                        Icon(
                            Icons.Filled.LocationOn,
                            contentDescription = "Location icon",
                        )
                    }
                )
            }
        }
    }
}

@Preview(name = "Light Mode")
@Preview(
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    showBackground = true,
    name = "Dark Mode"
)

@Preview
@Composable
fun PreviewMessageCard() {
    CvTheme {
        Surface {
            NameCard(
                status = Card("Léo", "Développeur Android"),
                infos = PersonnalInfos(
                    "0612345678",
                    "leo.hilaire@my-digital-school.org",
                    "57 rue Pierre Mauroy, 59000 Lille"
                )
            )
        }
    }
}