package com.example.sportsapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.sportsapp.ui.theme.HomeScreen
import com.example.sportsapp.ui.theme.SportsAppPortrait
import com.example.sportsapp.ui.theme.SportsAppTheme
import com.example.sportsapp.ui.theme.SportsLazyColumn
import com.example.sportsapp.ui.theme.components.SportsDetailTopBar
import com.example.sportsapp.ui.theme.components.SportsListItem
import com.example.sportsapp.ui.theme.components.SportsTopBar

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SportsAppTheme {
              // SportsDetailTopBar()
               // SportsListItem()
              SportsAppPortrait()
            }
        }
    }
}


