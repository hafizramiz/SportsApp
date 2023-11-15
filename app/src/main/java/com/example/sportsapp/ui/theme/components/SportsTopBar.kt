package com.example.sportsapp.ui.theme.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilledIconButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SportsTopBar(modifier: Modifier = Modifier) {
    Row( modifier=modifier,
        horizontalArrangement = Arrangement.Center) {
        Text(text = "Sports", style = MaterialTheme.typography.titleLarge)
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SportsDetailTopBar() {
   TopAppBar(title = { Text(text = "Sport Info")},
       navigationIcon = {
       FilledIconButton(
           onClick = {},
           modifier = Modifier.padding(8.dp),
           colors = IconButtonDefaults.filledIconButtonColors(
               containerColor = MaterialTheme.colorScheme.surface,
               contentColor = MaterialTheme.colorScheme.onSurface
           )
       ) {
           Icon(
               imageVector = Icons.Default.ArrowBack,
               contentDescription = null,
               modifier = Modifier.size(14.dp)
           )
       }
   },
       actions = {
           IconButton(onClick = { }) {
               Icon(imageVector = Icons.Default.MoreVert, contentDescription = null)
           }
       }
   )
}