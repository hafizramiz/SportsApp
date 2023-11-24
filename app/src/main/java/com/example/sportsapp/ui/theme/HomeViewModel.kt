package com.example.sportsapp.ui.theme

import androidx.compose.runtime.MutableState
import androidx.lifecycle.ViewModel
import com.example.sportsapp.data.AllSportsListDatabase
import com.example.sportsapp.data.ListItemDatabase
import com.example.sportsapp.data.ListItemModel
import com.example.sportsapp.data.Sport
import com.example.sportsapp.data.SportType
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update

class AppViewModel:ViewModel(){
    private val _uiState= MutableStateFlow (AppUiState(emptyMap()))
    val uiState:StateFlow<AppUiState> =_uiState
init {
    // Init icersiinde baslangic AppuiState' vercem.Sport tipine gore
    // gruplandirma yaptim.
    val gruplandirilmisButunSporlar:Map<SportType,List<ListItemModel>> =
   ListItemDatabase.allListItems.groupBy { it.sportType }

    // gruplandirma yaptiktan sonra uiState i degistircem.
    _uiState.value= AppUiState(gruplandirilmisButunSporlar=gruplandirilmisButunSporlar)
}
    fun guncelleSportType(sportType: SportType){
        _uiState.update {
            it.copy(
                mevcutSportStype = sportType,
                isShowingHomePage = true
            )
        }
    }


}


data class AppUiState(
    val gruplandirilmisButunSporlar:Map<SportType,List<ListItemModel>>,
val mevcutSportStype:SportType=SportType.ONEPLAYER,
    var isShowingHomePage:Boolean=true
){
    val tiklanincaSecilenSportListesi: List<ListItemModel> by lazy {
        ListItemDatabase.allListItems
    }
}