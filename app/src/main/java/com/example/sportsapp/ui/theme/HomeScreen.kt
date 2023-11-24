package com.example.sportsapp.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LargeFloatingActionButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.sportsapp.R
import com.example.sportsapp.ui.theme.components.SportsDetailTopBar
import com.example.sportsapp.ui.theme.components.SportsListItem
import com.example.sportsapp.ui.theme.components.SportsTopBar

@Composable
fun HomeScreen(modifier: Modifier= Modifier,
appUiState: AppUiState
) {
    Box(modifier = modifier.fillMaxWidth()){
        
        // Burda list content dondurcem.
       SportsListContent(appUiState=appUiState)
        // Istersem fab eklerim. Onu da scaffold'a ekliycem.
    }
}


@Composable
fun SportsListContent(appUiState: AppUiState) {
// Burda hangi listenin donecegine karar vercem.
//    if(){
//        SportsDetialLazyColumn()
//    }else{
//SportsLazyColumn()
//    }

SportsLazyColumn(appUiState = appUiState)
}
val exampleList= listOf<Int>(1,2,3,4,5,6,7)

@Composable
fun SportsLazyColumn(modifier: Modifier= Modifier,
                     appUiState: AppUiState
){
   SportsListItem(appUiState = appUiState)
}

@Composable
fun SportsDetialLazyColumn(
    modifier: Modifier = Modifier.fillMaxSize(),
) {
    LazyColumn(modifier = modifier){
        item {
            SportsDetailTopBar()
        }
        items(exampleList.size){
           Text(text = "Detail ekrani burasi icin bir list item card yazcam")
        }
}
    }






