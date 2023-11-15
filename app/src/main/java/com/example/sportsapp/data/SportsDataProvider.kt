package com.example.sportsapp.data

import com.example.sportsapp.R

object OrganizatorListDatabase {
    val allOrganizatorList = listOf<Organizator>(
        Organizator(
            id = 4L,
            organizatorName = "Ety",
            organizatorSurname = "Gordan",
            organizatorMail = "ety@gmail.com",
            organizatorPicture = R.drawable.avatar9
        ),
        Organizator(
            id = 5L,
            organizatorName = "Bella",
            organizatorSurname = "Aaron",
            organizatorMail = "bella@gmail.com",
            organizatorPicture = R.drawable.avatar4
        ),
        Organizator(
            id = 6L,
            organizatorName = "Jaxson",
            organizatorSurname = "Jacob",
            organizatorMail = "Jacob@gmail.com",
            organizatorPicture = R.drawable.avatar8
        ),
        Organizator(
            id = 7L,
            organizatorName = "Oliver",
            organizatorSurname = "Aaron",
            organizatorMail = "Aaron@gmail.com",
            organizatorPicture = R.drawable.avatar7
        ),
        Organizator(
            id = 8L,
            organizatorName = "Ety",
            organizatorSurname = "Gordan",
            organizatorMail = "ety@gmail.com",
            organizatorPicture = R.drawable.avatar6
        ),
        Organizator(
            id = 9L,
            organizatorName = "Bella",
            organizatorSurname = "Aaron",
            organizatorMail = "bella@gmail.com",
            organizatorPicture = R.drawable.avatar5
        ),
        Organizator(
            id = 10L,
            organizatorName = "Jaxson",
            organizatorSurname = "Jacob",
            organizatorMail = "Jacob@gmail.com",
            organizatorPicture = R.drawable.avatar4
        ),
        Organizator(
            id = 7L,
            organizatorName = "Oliver",
            organizatorSurname = "Aaron",
            organizatorMail = "Aaron@gmail.com",
            organizatorPicture = R.drawable.avatar3
        ),
        Organizator(
            id = 4L,
            organizatorName = "Ety",
            organizatorSurname = "Gordan",
            organizatorMail = "ety@gmail.com",
            organizatorPicture = R.drawable.avatar2
        ),
        Organizator(
            id = 5L,
            organizatorName = "Bella",
            organizatorSurname = "Aaron",
            organizatorMail = "bella@gmail.com",
            organizatorPicture = R.drawable.avatar1
        ),
        Organizator(
            id = 6L,
            organizatorName = "Jaxson",
            organizatorSurname = "Jacob",
            organizatorMail = "Jacob@gmail.com",
            organizatorPicture = R.drawable.avatar8
        ),
        Organizator(
            id = 7L,
            organizatorName = "Oliver",
            organizatorSurname = "Aaron",
            organizatorMail = "Aaron@gmail.com",
            organizatorPicture = R.drawable.avatar7
        ),
    )
}

object AllSportsListDatabase {
    val allSportList = listOf<Sport>(
        Sport(
            id = 0L,
            name = "Baseball",
            organizator = OrganizatorListDatabase.allOrganizatorList[0],
            //sportType = SportType.MULTIPLAYER,
            createdAT = "01.01.2023",
            locationInfo = "Washington DC",
            sportPicture = R.drawable.baseball
        ),
        Sport(
            id = 1L,
            name = "Badminton",
            organizator = OrganizatorListDatabase.allOrganizatorList[1],
            //sportType = SportType.ONEPLAYER,
            createdAT = "13.07.2023",
            locationInfo = "Ankara",
            sportPicture = R.drawable.badminton
        ),
        Sport(
            id = 2L,
            name = "Basketball",
            organizator = OrganizatorListDatabase.allOrganizatorList[2],
            //sportType = SportType.MULTIPLAYER,
            createdAT = "19.04.2023",
            locationInfo = "Istanbul",
            sportPicture = R.drawable.basketball
        ),
        Sport(
            id = 3L,
            name = "Sailing",
            organizator = OrganizatorListDatabase.allOrganizatorList[3],
            // sportType = SportType.ONEPLAYER,
            createdAT = "14.05.2023",
            locationInfo = "Izmir",
            sportPicture = R.drawable.sailing
        ),
        Sport(
            id = 4L,
            name = "Cycling",
            organizator = OrganizatorListDatabase.allOrganizatorList[4],
            // sportType = SportType.ONEPLAYER,
            createdAT = "23.06.2023",
            locationInfo = "Paris",
            sportPicture = R.drawable.cycling
        ),
        Sport(
            id = 5L,
            name = "Golf",
            organizator = OrganizatorListDatabase.allOrganizatorList[5],
            //sportType = SportType.ONEPLAYER,
            createdAT = "06.05.2023",
            locationInfo = "Paris",
            sportPicture = R.drawable.golf
        ),
        Sport(
            id = 6L,
            name = "Equestrian",
            organizator = OrganizatorListDatabase.allOrganizatorList[6],
            // sportType = SportType.ONEPLAYER,
            createdAT = "23.06.2023",
            locationInfo = "Paris",
            sportPicture = R.drawable.equestrian
        ),
        Sport(
            id = 7L,
            name = "Karate",
            organizator = OrganizatorListDatabase.allOrganizatorList[7],
            //  sportType = SportType.TWOPLAYER,
            createdAT = "23.06.2023",
            locationInfo = "Samsun",
            sportPicture = R.drawable.karate
        ),
        Sport(
            id = 8L,
            name = "Cricket",
            organizator = OrganizatorListDatabase.allOrganizatorList[8],
            // sportType = SportType.TWOPLAYER,
            createdAT = "30.07.2023",
            locationInfo = "Antalya",
            sportPicture = R.drawable.cricket
        ),
    )
}

object ListItemDatabase {
    val allListItems = listOf<ListItemModel>(
        ListItemModel(
            sportType = SportType.MULTIPLAYER,
            AllSportsListDatabase.allSportList[0],
            OrganizatorListDatabase.allOrganizatorList[0]
        ), ListItemModel(
            sportType = SportType.ONEPLAYER,
            AllSportsListDatabase.allSportList[1],
            OrganizatorListDatabase.allOrganizatorList[1]
        ),
        ListItemModel(
            sportType = SportType.MULTIPLAYER,
            AllSportsListDatabase.allSportList[2],
            OrganizatorListDatabase.allOrganizatorList[2]
        ),
        ListItemModel(
            sportType = SportType.ONEPLAYER,
            AllSportsListDatabase.allSportList[3],
            OrganizatorListDatabase.allOrganizatorList[3]
        ),
        ListItemModel(
            sportType = SportType.ONEPLAYER,
            AllSportsListDatabase.allSportList[4],
            OrganizatorListDatabase.allOrganizatorList[4]
        ),
        ListItemModel(
            sportType = SportType.ONEPLAYER,
            AllSportsListDatabase.allSportList[5],
            OrganizatorListDatabase.allOrganizatorList[5]
        ),
        ListItemModel(
            sportType = SportType.ONEPLAYER,
            AllSportsListDatabase.allSportList[6],
            OrganizatorListDatabase.allOrganizatorList[6]
        ),
        ListItemModel(
            sportType = SportType.TWOPLAYER,
            AllSportsListDatabase.allSportList[7],
            OrganizatorListDatabase.allOrganizatorList[7]
        ),
        ListItemModel(
            sportType = SportType.TWOPLAYER,
            AllSportsListDatabase.allSportList[8],
            OrganizatorListDatabase.allOrganizatorList[8]
        ),
    )
}

