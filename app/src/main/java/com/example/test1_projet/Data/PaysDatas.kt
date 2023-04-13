package com.example.test1_projet.Data

import com.example.test1_projet.Models.PaysModel
import com.example.test1_projet.R

class PaysDatas {
    private val france = PaysModel(name = "france", desc = "description", R.drawable.louvre)
    private val italie = PaysModel(name = "italie", desc = "description", R.drawable.italie)
    private val chine = PaysModel(name = "chine", desc = "description", R.drawable.china)
    private val mexique = PaysModel(name = "mexique", desc = "description", R.drawable.mexico)
    private val usa = PaysModel(name = "usa", desc = "description", R.drawable.nyc)
    private val dubai = PaysModel(name = "dubai", desc = "description", R.drawable.dubaii)

    fun getPaysByName(name: String): PaysModel? {
        return when (name) {
            "france" -> france
            "italie" -> italie
            "chine" -> chine
            "mexique" -> mexique
            "usa" -> usa
            "dubai" -> dubai
            else -> null
        }
    }
}