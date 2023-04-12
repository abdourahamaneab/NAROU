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
    lateinit var franceClick : CardView

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

        franceClick = view.findViewById(R.id.france_home)
        franceClick.setOnClickListener {

            val action = homeDirections.actionHome2ToActivityVilleInfo()
            // faire une action pour aller vers la page de la ville
            findNavController().navigate(action)

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
}
