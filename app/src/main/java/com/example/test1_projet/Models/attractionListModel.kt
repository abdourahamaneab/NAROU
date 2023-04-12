package com.example.test1_projet.Models


import androidx.annotation.DrawableRes

data class AttractionListModel(
    val name: String,
    val rating: Float,
    val distance: String,
    @DrawableRes val imageResId: Int
)
