package com.example.sportsapp.ui.theme

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.Icon
import androidx.compose.material3.LargeFloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.sportsapp.ui.theme.components.SportsDetailTopBar
import com.example.sportsapp.ui.theme.components.SportsListItem
import com.example.sportsapp.ui.theme.components.SportsTopBar

@Composable
fun HomeScreen(modifier: Modifier= Modifier,

) {
    Box(modifier = modifier.fillMaxWidth()){
        
        // Burda list content dondurcem.
       SportsListContent()
        // Istersem fab eklerim. Onu da scaffold'a ekliycem.
    }
}


@Composable
fun SportsListContent() {
// Burda hangi listenin donecegine karar vercem.
//    if(){
//        SportsDetialLazyColumn()
//    }else{
//SportsLazyColumn()
//    }

SportsLazyColumn()
}
val exampleList= listOf<Int>(1,2,3,4,5,6,7)

@Composable
fun SportsLazyColumn(modifier: Modifier= Modifier){
    LazyColumn(modifier = modifier){
        item {
            SportsTopBar(modifier= Modifier.fillMaxWidth())
        }
        items(exampleList.size){
            SportsListItem()
        }
    }
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






