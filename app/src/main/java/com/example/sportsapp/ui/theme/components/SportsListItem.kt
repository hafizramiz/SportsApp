package com.example.sportsapp.ui.theme.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.sportsapp.R
import com.example.sportsapp.ui.theme.AppUiState

@Composable
fun SportsListItem(modifier: Modifier = Modifier,
                   appUiState:AppUiState
) {
    // buraya app ui state gerekli ona gore liste olusturacak.

    val tiklanincaSecilenSportListesi=appUiState.tiklanincaSecilenSportListesi

    LazyColumn(verticalArrangement = Arrangement.spacedBy(
        8.dp)){

        items(tiklanincaSecilenSportListesi.size){listItem->
            Surface(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(120.dp)
            ) {
                Card(
                    modifier = modifier
                        .padding(horizontal = 16.dp, vertical = 4.dp)
                        .semantics {
                            //selected = isSelected yapcam
                        }
                        .clickable {
                            // Burda detail sayfasina gitcem.
                        }
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Image(
                            contentScale = ContentScale.Crop,
                            modifier = Modifier.size(120.dp),
                            painter = painterResource(id = tiklanincaSecilenSportListesi[listItem].sport.sportPicture),
                            contentDescription = null
                        )
                        Column(
                            modifier = Modifier
                                .padding(5.dp)
                                .fillMaxWidth()
                        ) {
                            //
                            Text(
                                text = tiklanincaSecilenSportListesi[listItem].sport.name, style = MaterialTheme.typography.titleMedium,
                                fontWeight = FontWeight.Bold
                            )
                            // sender
                            Row(
                                horizontalArrangement = Arrangement.spacedBy(20.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Image(
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier
                                        .size(30.dp)
                                        .clip(CircleShape),
                                    painter = painterResource(id = tiklanincaSecilenSportListesi[listItem].organizator.organizatorPicture),
                                    contentDescription = null
                                )
                                Text(text = tiklanincaSecilenSportListesi[listItem].organizator.organizatorName)
                            }
                            // sender. createdAt
                            Text(text = tiklanincaSecilenSportListesi[listItem].sport.createdAT)
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Icon(
                                    modifier = Modifier.size(15.dp),
                                    imageVector = Icons.Default.LocationOn, contentDescription = null
                                )
                                // subject=location
                                Text(
                                    text = tiklanincaSecilenSportListesi[listItem].sport.locationInfo,
                                    style = MaterialTheme.typography.bodySmall,
                                    fontStyle = FontStyle.Italic
                                )
                                Spacer(modifier = Modifier.weight(1f))
                                // body=olympic
                                Text(
                                    text = tiklanincaSecilenSportListesi[listItem].sportType.toString(),
                                )
                            }
                        }
                        IconButton(
                            onClick = { },
                            modifier = Modifier.clip(CircleShape)
                        ) {
                            Icon(imageVector = Icons.Default.FavoriteBorder, contentDescription = null)
                        }
                    }
                }
            }
        }
    }
}
