package com.example.test1_projet.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.test1_projet.Models.AttractionInfos
import com.example.test1_projet.R

class AttractionInfoAdapter(
    private val attractions: List<AttractionInfos>,

) : RecyclerView.Adapter<AttractionInfoAdapter.AttractionViewHolder>() {

    inner class AttractionViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val nameTextView: TextView = itemView.findViewById(R.id.nom)
        private val descriptionTextView: TextView = itemView.findViewById(R.id.description)
        private val imageView: ImageView = itemView.findViewById(R.id.image)

        fun bind(attraction: AttractionInfos) {
            nameTextView.text = attraction.name
            descriptionTextView.text = attraction.description
            imageView.setImageResource(attraction.imageRes)


        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AttractionViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.fragment_item_attraction_list, parent, false
        )
        return AttractionViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: AttractionViewHolder, position: Int) {
        val attraction = attractions[position]
        holder.bind(attraction)
    }

    override fun getItemCount(): Int = attractions.size
}
