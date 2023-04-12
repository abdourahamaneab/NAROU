package com.example.test1_projet.Data

import com.example.test1_projet.Models.AttractionListModel
import com.example.test1_projet.R

class AttractionData {
    val attractions = listOf(
        AttractionListModel(name = "Tour Eiffel", 4F, "1000", R.drawable.touref),
        AttractionListModel(name = "Statue de la Liberté", 4.5F,"3000", R.drawable.nyc),
        AttractionListModel(name = "Taj Mahal",4.5F, "40000", R.drawable.agra_taj_mahal)
    )

    val attractions2 = listOf(
        AttractionListModel(name = "Tour Eiffel", 4F, "1000", R.drawable.touref),
          )

    val attractions3 = listOf(
        AttractionListModel(name = "Tour Eiffel", 4F, "1000", R.drawable.touref),
          )
}
