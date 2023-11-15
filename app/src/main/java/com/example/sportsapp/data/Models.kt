package com.example.sportsapp.data

import androidx.annotation.DrawableRes

data class Sport (
    val id: Long,
    val name:String, // subject
    val organizator: Organizator,
    var sportType:SportType=SportType.ONEPLAYER,
    var createdAT: String="",
    val locationInfo: String="",
    @DrawableRes val sportPicture: Int
)

data class Organizator(
    val id: Long=1,
    val organizatorName: String,
    val organizatorSurname: String,
    val organizatorMail: String,
   @DrawableRes val organizatorPicture:Int
)


data class ListItemModel(
    val sportType:SportType,
    val sport:Sport,
    val organizator: Organizator
)

enum class SportType{
    ONEPLAYER, TWOPLAYER,MULTIPLAYER
}