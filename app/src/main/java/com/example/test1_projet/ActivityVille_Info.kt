package com.example.test1_projet

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView


import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.test1_projet.Data.AttractionData
import com.example.test1_projet.Data.PaysDatas
import com.example.test1_projet.Models.PaysModel
import androidx.navigation.fragment.findNavController
import com.example.test1_projet.R.*
import com.example.test1_projet.adapter.AttractionListAdapter


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ActivityVille_Info.newInstance] factory method to
 * create an instance of this fragment.
 */
class ActivityVille_Info : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    lateinit var pays: String
    lateinit var btVoirPlus: Button
    lateinit var btnHotel: Button
    lateinit var btnResto: Button

    private lateinit var adapter: AttractionListAdapter
    private val attractions = AttractionData().france

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
        // Inflate the layout for this fragment
        val view = inflater.inflate(layout.fragment_activity_ville__info, container, false)
        adapter = AttractionListAdapter(attractions)

        pays = arguments?.getString("pays").toString().toLowerCase()
        println(pays)
        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerViewA)
        recyclerView.layoutManager = LinearLayoutManager(activity)
        recyclerView.adapter = adapter
        loadDonnerPays(view, pays)
        // action de cliquer sur le boutton voirPlus
        btVoirPlus=view.findViewById(R.id.btn_Voirplus)
        btVoirPlus.setOnClickListener {
            onclickerVoirplus()
        }
        // action de cliquer sur le boutton hotel
        btnHotel = view.findViewById(R.id.btnhotellist)
        btnHotel.setOnClickListener {
            onclickHotels()
        }

        // action de cliquer sur le boutton resto
        btnResto = view.findViewById(R.id.btn_resto)
        btnResto.setOnClickListener {
            onclickResto()
        }

        return view
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment ActivityVille_Info.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            ActivityVille_Info().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

    // fonction qui charge les données(photo, nom, description)
    fun loadDonnerPays(view: View, paysT: String) {
        val pays = PaysDatas().getPaysByName(paysT)
        val nomPays: String = pays?.name ?: "Pays inconnu"
        val imagePays = pays?.imageResourceId
        val descriptionPays = pays?.desc ?: "Description inconnu"

        println(descriptionPays+"-"+nomPays)
        // recuperer et changer le nom du pays avec id nomp
        val textView = view.findViewById<TextView>(R.id.NomPays)
        // changer le nom du pays
        textView?.text = nomPays
        // recuperer et changer l'image du pays avec id img
        val imageView = view.findViewById<ImageView>(R.id.imageHaut)
        // changer l'image du pays
        imageView?.setImageResource(imagePays!!)


    }

    fun onclickerVoirplus() {
        val action = ActivityVille_InfoDirections.actionActivityVilleInfoToAttractionDetails()
        findNavController().navigate(action)
    }

    fun onclickHotels() {
        val action2 = ActivityVille_InfoDirections.actionActivityVilleInfoToHotelFragment2()
        findNavController().navigate(action2)
    }

    fun onclickResto(){
        val action3 = ActivityVille_InfoDirections.actionActivityVilleInfoToRestoFragment()
        findNavController().navigate(action3)
    }
}