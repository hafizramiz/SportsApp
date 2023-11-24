package com.example.sportsapp.ui.theme

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Send
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.LargeFloatingActionButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.sportsapp.R
import com.example.sportsapp.ui.theme.SportsRoute.ONEPLAYER


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SportsAppPortrait(modifier: Modifier = Modifier) {
    // State bilgisini burda tuttum. Bunu alttaki composable'lara vercem.

    val appViewModel: AppViewModel = viewModel()
    val appUiState = appViewModel.uiState.collectAsState().value
    var selectedDestination by remember {
        mutableStateOf(SportsRoute.HOMEPAGE)
    }
    Scaffold(
        topBar = {
            Row(
            modifier = modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = null,
                modifier = Modifier.padding(start = 16.dp),
            )
            Text(
                text = "Search",
                modifier = Modifier
                    .weight(1f)
                    .padding(16.dp),
                style = MaterialTheme.typography.bodyMedium,
            )
        }
        },
        floatingActionButton ={ FloatingActionButton(
            onClick = {

            },
            modifier = Modifier
                .padding(16.dp),
        ) {
            Icon(
                imageVector = Icons.Default.Edit,
                contentDescription = null,
                modifier = Modifier.size(28.dp)
            )
        }},
        bottomBar = {
            // Buraya navigation bar gelecek
            SportsBottomNavigation(
                selectedDestination = selectedDestination,
                onClick = {
                    // Burda onclick fonksiyonun verdigi route'u burdaki degiskene esitledim.
                        selectedDestination = it
                },
            )
        }) { innerPadding ->
        if (selectedDestination == SportsRoute.HOMEPAGE) {
            HomeScreen(modifier=Modifier.padding(innerPadding),
                appUiState = appUiState)
        }
        else {
            // diger sayfalara tiklaninca daha yapilmadi yazisi cikacak.
            Text(
                modifier = Modifier.padding(innerPadding),
                text = "Bu sayfalar daha yapilmadi"
            )
        }
        //HomeScreen(modifier = Modifier.padding(innerPadding))
    }

}


// Stateless Widget
@Composable
fun SportsBottomNavigation(
    modifier: Modifier = Modifier,
    selectedDestination: String,
    onClick: (String) -> Unit,
    ) {
    NavigationBar {
        // Simdi olusturdugum listenin icinde gezerek navbar itemlari olusturcam.
        TOPLEVELDESTINATIONS.forEach { destinationItem ->
            NavigationBarItem(
                // Burda bir az dusunmemiz gerekecek.
                selected = selectedDestination==destinationItem.route,
                // Burda callback fonksiyona listedeki indexleri verdim. Yani on click metotunu yukarda cagirdgim zaman
                // Bana bir 0,1, gibi degerler verecek. Bende ona gore istedigim sayfaya yonlendirecegim.
                //Ama bunu yapmamak icin listede data class'tan olusturdugum her bir nesnenin icinde
                // route diye bir degisken tanimladim.
                onClick = {
                    onClick(destinationItem.route)
                          },
                icon = { Icon(
                    destinationItem.selectedIcon,
                    contentDescription = null
                )},
                label = { Text(text = stringResource(id = destinationItem.iconTextId)) }
            )
        }
    }
}


// Routlar'i object class icine yazcam. Routlari yazdim.
object SportsRoute {
    const val HOMEPAGE="HomePage"
    const val ONEPLAYER = "OnePlayer"
}
// bu data class'taki degiskenler ben NavigationBar yaptigim zaman NavigationBarItem diye bir sinifi cagiriyorum
// onun benden istediklerini vermek icin bu sinifi kullandim.

data class TopLevelDestination(
    val route: String,
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector,
    val iconTextId: Int
)
// Simdi bu data class'tan olusturacagim nesneleri bir liste icinde toplayacagim.
//Peki object sinifini neden yaptim. Cunku o siniftan bir nesne uretmeden direk degiskenlerine eriscem ve kullancam
val TOPLEVELDESTINATIONS = listOf<TopLevelDestination>(
    // simdi data class'tan bir nesne uretip bunun icine atacam.
    TopLevelDestination(
        route = SportsRoute.HOMEPAGE,
        selectedIcon = Icons.Filled.Home,
        unselectedIcon = Icons.Filled.Home,
        iconTextId = R.string.tab_homepage
    ),
    TopLevelDestination(
        route = ONEPLAYER,
        selectedIcon = Icons.Default.Person,
        unselectedIcon = Icons.Default.Person,
        iconTextId = R.string.tab_oneplayer
    ),


)
// Burda daha sonra listeye ilave edip 3 tane secenekli yapcam.