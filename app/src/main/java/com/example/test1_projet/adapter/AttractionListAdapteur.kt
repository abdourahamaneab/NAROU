package com.example.test1_projet.adapter


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

import com.example.test1_projet.Models.AttractionListModel
import com.example.test1_projet.R


class AttractionListAdapter(private val attractions: List<AttractionListModel>) :
    RecyclerView.Adapter<AttractionListAdapter.AttractionViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AttractionViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.fragment_attraction_ville, parent, false)
        return AttractionViewHolder(view)
    }

    override fun onBindViewHolder(holder: AttractionViewHolder, position: Int) {
        val attraction = attractions[position]
        holder.bind(attraction)
    }

    override fun getItemCount(): Int {
        return attractions.size
    }

    class AttractionViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(attraction: AttractionListModel) {
            itemView.findViewById<TextView>(R.id.recycler_name).text = attraction.name
           // itemView.findViewById<TextView>(R.id.recycler_rating).text = attraction.rating.toString()
            itemView.findViewById<TextView>(R.id.recycler_distance).text = attraction.distance
            itemView.findViewById<ImageView>(R.id.recycler_image).setImageResource(attraction.imageResId)

        }
    }
}
