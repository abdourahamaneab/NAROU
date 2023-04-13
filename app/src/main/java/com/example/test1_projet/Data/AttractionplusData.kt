package com.example.test1_projet.Data

import com.example.test1_projet.Models.AttractionInfos
import com.example.test1_projet.R

class AttractionplusData {
    val france = listOf(
        AttractionInfos(
            name = "Louvre",
            description = "Le musée du Louvre est un musée d'art et d'archéologie situé à Paris,  Il est le plus grand musée du monde." +
                    " Le musée du Louvre est le premier musée d'art et d'archéologie au monde en nombre de visiteurs annuels, avec 9,6 millions de visiteurs en 2018. Il est le deuxième musée le plus visité au monde après le British Museum de Londres.isiteurs en 2018.",
            imageRes = R.drawable.louvre ),
        AttractionInfos(
            name = "Tour Eiffel",
            description = "La tour Eiffel est une tour de fer puddlé de 324 mètres de hauteur (avec antennes) située à Paris, sur la rive gauche de la Seine dans le 7e arrondissement. " +
                    "Son nom officiel est tour Eiffel, mais elle est souvent appelée simplement la tour de Paris ou la dame de fer. " +
                    "Elle est devenue le symbole de la capitale française et un emblème de la France dans le monde entier.",
            imageRes = R.drawable.touref ),

        AttractionInfos(
            name = "Statue de la Liberté",
            description = "La Statue de la Liberté est une statue de la liberté érigée à New York en 1886. " +
                    "Elle est un symbole de l'indépendance des États-Unis et de la liberté. " +
                    "Elle est située sur Liberty Island, dans l'embouchure de l'Hudson, à New York, dans l'État de New York, aux États-Unis.",
            imageRes = R.drawable.nyc ),
        AttractionInfos(
            name = "Taj Mahal",
            description = "Le Taj Mahal est un mausolée situé à Agra, en Inde. " +
                    "Il a été construit entre 1631 et 1648 par l'empereur moghol Shah Jahan en mémoire de sa femme Mumtaz Mahal. " +
                    "Le Taj Mahal est considéré comme l'une des merveilles du monde.",
            imageRes = R.drawable.agra_taj_mahal ),



        )
    val italie = listOf(
        AttractionInfos(
            name = "Tour Eiffel",
            description = "La tour Eiffel est une tour de fer puddlé de 324 mètres de hauteur (avec antennes) située à Paris, sur la rive gauche de la Seine dans le 7e arrondissement. " +
                    "Son nom officiel est tour Eiffel, mais elle est souvent appelée simplement la tour de Paris ou la dame de fer. " +
                    "Elle est devenue le symbole de la capitale française et un emblème de la France dans le monde entier.",
            imageRes = R.drawable.touref ),
    )


}