package com.example.test1_projet.Data

import com.example.test1_projet.Models.restoModels
import com.example.test1_projet.R

class RestoPays {
    val france = listOf(
        restoModels("L'Ambroisie", R.drawable.fran_resto_ambro),
        restoModels("La Tour d'Argent", R.drawable.fran_resto2_tur_argt),
        restoModels("Le Jules Verne ", R.drawable.fran_resto3_jul_vern),
    )

    val italie = listOf(
        restoModels("Osteria Francescana", R.drawable.italie_restau_oste),
        restoModels("La Pergola ", R.drawable.italie_restau_pergola),
        restoModels("Piazza Duomo ", R.drawable.italie_restau_piazza),
    )
    val chine = listOf(
        restoModels("Quanjude ", R.drawable.chine_restau_quanju),
        restoModels("Din Tai Fung", R.drawable.chine_restau_din_haidilao),
        restoModels("Haidilao Hot Pot", R.drawable.chine_restau_din_haidilao),
    )
    val USA = listOf(
        restoModels(" Eleven Madison Park ", R.drawable.usa_restau_eleven),
        restoModels(" Alinea ", R.drawable.usa_restau_aline),
        restoModels(" French Laundry ", R.drawable.usa_restau_french),
    )

    // recupere les resto par nom
    fun getRestoByName(name: String): List<restoModels>{
        return when (name) {
            "france" -> france
            "italie" -> italie
            "chine" -> chine
            "usa" -> USA
            else -> france
        }
    }

}