package com.example.test1_projet.Data

import com.example.test1_projet.Models.restoModels
import com.example.test1_projet.R

class RestoPays {
    val france = listOf(
        restoModels("resto1", R.drawable.agra_taj_mahal),
        restoModels("resto2", R.drawable.nyc),
        restoModels("resto3", R.drawable.mexico),
        restoModels("resto4", R.drawable.home_bg),
        restoModels("resto5", R.drawable.agra_taj_mahal),
        restoModels("resto6", R.drawable.nyc),
    )

    val italie = listOf(
        restoModels("resto1", R.drawable.agra_taj_mahal),
        restoModels("resto2", R.drawable.nyc),
        restoModels("resto3", R.drawable.mexico),
        restoModels("resto4", R.drawable.home_bg),
        restoModels("resto5", R.drawable.agra_taj_mahal),
        restoModels("resto6", R.drawable.nyc),
    )

    // recupere les resto par nom
    fun getRestoByName(name: String): List<restoModels>{
        return when (name) {
            "france" -> france
            "italie" -> italie
            else -> france
        }
    }

}