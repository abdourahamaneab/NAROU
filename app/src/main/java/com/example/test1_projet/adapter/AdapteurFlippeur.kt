package com.example.test1_projet.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.test1_projet.Models.AdapterFlipperModel
import com.example.test1_projet.R

class AdapteurFlippeur(context: Context, private val data: List<AdapterFlipperModel>) :BaseAdapter() {

    private val inflater: LayoutInflater = LayoutInflater.from(context)

    override fun getCount(): Int {
        return data.size
    }

    override fun getItem(position: Int): Any {
        return data[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View = convertView ?: inflater.inflate(R.layout.fragment_home_part_defilante, parent, false)
        val name: TextView = view.findViewById(R.id.adapterflipper_name)
        val state: TextView = view.findViewById(R.id.adapterflipper_state)
        val image: ImageView = view.findViewById(R.id.adapterflipper_image)

        val item = getItem(position) as AdapterFlipperModel

        name.text = item.name
        state.text = item.state
        image.setImageResource(item.imageResourceId)

        return view
    }
}

