package com.example.test1_projet.Data

import com.example.test1_projet.Models.AttractionListModel
import com.example.test1_projet.R

class AttractionData {
    val france = listOf(
        AttractionListModel(name = "Tour Eiffel", 4F, "1000", R.drawable.touref),
        AttractionListModel(name = "Statue de la Liberté", 4.5F,"3000", R.drawable.nyc),
        AttractionListModel(name = "Taj Mahal",4.5F, "40000", R.drawable.agra_taj_mahal)
    )

    val italie = listOf(
        AttractionListModel(name = "Tour de pise", 4F, "1000", R.drawable.tour_de_pise),
        AttractionListModel(name = "La Chappelle Sixtine", 4.5F,"3000", R.drawable.chapel_sixtine),
        AttractionListModel(name = "Le Colisée",4.5F, "40000", R.drawable.venise)

        )
    val chine = listOf(
        AttractionListModel(name = "L'Armée de Terre Cuite à Xi'ang", 4F, "1000", R.drawable.arme_de_terre),
        AttractionListModel(name = "La Grande Muraille de Chine", 4.5F,"3000", R.drawable.muraille_de_chine),
        AttractionListModel(name = "Le Temple du Ciel",4.5F, "40000", R.drawable.ville_de_pekin)
          )

    fun getAttractionsByCountryName(name: String): List<AttractionListModel>? {
        return when (name) {
            "france" -> france
            "italie" -> italie
            "chine" -> chine

            else -> null

        }
    }
}
