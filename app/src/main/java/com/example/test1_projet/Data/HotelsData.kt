package com.example.test1_projet.Data

import com.example.test1_projet.Models.HotelsModels
import com.example.test1_projet.R

class HotelsData {
            val france = listOf(
                HotelsModels("Hôtel Malte - Astotel", R.drawable.china),
                HotelsModels("Hôtel Bradford Elysées - Astotel", R.drawable.stairs),
                HotelsModels("Hôtel de la Tamise - Astotel", R.drawable.stairs),
                HotelsModels("Hôtel Le Milie Rose", R.drawable.exteriorhotel),
                HotelsModels("Hôtel Le Relais Saint Germain", R.drawable.exteriorhotel),
                HotelsModels("Hôtel Le Relais Saint Germain", R.drawable.exteriorhotel),
                HotelsModels("Hôtel Le Relais Saint Germain", R.drawable.exteriorhotel),

            )

            val italie = listOf(
                HotelsModels("Hôtel Malte - Astotel", R.drawable.stairs),
                HotelsModels("Hôtel Bradford Elysées - Astotel", R.drawable.stairs),
                HotelsModels("Hôtel de la Tamise - Astotel", R.drawable.stairs),
                HotelsModels("Hôtel Le Milie Rose", R.drawable.exteriorhotel),
                HotelsModels("Hôtel Le Relais Saint Germain", R.drawable.exteriorhotel),
                HotelsModels("Hôtel Le Relais Saint Germain", R.drawable.exteriorhotel),
                HotelsModels("Hôtel Le Relais Saint Germain", R.drawable.exteriorhotel),

            )

    // recupere les hotels par nom
    fun getHotelsByName(name: String): List<HotelsModels>{
        return when (name) {
            "france" -> france
            "italie" -> italie
            else -> france
        }
    }

}