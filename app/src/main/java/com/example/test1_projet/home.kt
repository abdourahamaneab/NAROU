package com.example.test1_projet

import android.os.Bundle

import androidx.cardview.widget.CardView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterViewFlipper
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.test1_projet.Models.AdapterFlipperModel
import com.example.test1_projet.adapter.AdapteurFlippeur

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class home : Fragment() {
    private var param1: String? = null
    private var param2: String? = null

    private var flipper: AdapterViewFlipper? = null
    private var list: ArrayList<AdapterFlipperModel>? = null
    private var adapter: AdapteurFlippeur? = null
    lateinit var cardClick : CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        flipper = view.findViewById(R.id.adapter_flipper_home)
        list = ArrayList()
        list!!.add(AdapterFlipperModel("Louvre", "France", R.drawable.louvre))
        list!!.add(AdapterFlipperModel("Champs de riz", "Chine", R.drawable.china))
        list!!.add(AdapterFlipperModel("Pyramide Maya", "Mexique", R.drawable.mexico))
        list!!.add(AdapterFlipperModel("Eiffel", "France", R.drawable.touref))
        list!!.add(AdapterFlipperModel("Statut de la liberte", "USA", R.drawable.nyc))
        list!!.add(AdapterFlipperModel("Vatican", "Italie", R.drawable.italie))
        list!!.add(AdapterFlipperModel("gratte cile", "Dubai", R.drawable.dubaii))

        adapter = AdapteurFlippeur(requireContext(), list!!)
        flipper!!.adapter = adapter
        flipper!!.startFlipping()
        flipper!!.flipInterval = 3000

        // click sur la carte de france
        cardClick = view.findViewById(R.id.france_home)
        cardClick.setOnClickListener {
            onClick("France")

        }

        // click sur la carte de chine
        cardClick = view.findViewById(R.id.chineClick)
        cardClick.setOnClickListener {
            onClick("Chine")

        }

        // click sur la carte de mexique
        cardClick = view.findViewById(R.id.mexiqueClique)
        cardClick.setOnClickListener {
            onClick("Mexique")

        }

        // click sur la carte de usa
        cardClick = view.findViewById(R.id.usaClick)
        cardClick.setOnClickListener {
            onClick("USA")

        }

        // click sur la carte de italie
        cardClick = view.findViewById(R.id.italieClick)
        cardClick.setOnClickListener {
            onClick("Italie")

        }

        // click sur la carte de dubai
        cardClick = view.findViewById(R.id.dubaiClick)
        cardClick.setOnClickListener {
            onClick("Dubai")

        }



        return view
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            home().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

    fun onClick(pays: String) {





        val action = homeDirections.actionHome2ToActivityVilleInfo(pays)

        // faire une action pour aller vers la page de la ville
        findNavController().navigate(action)

    }
}
