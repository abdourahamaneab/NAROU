package com.example.test1_projet.adapter

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.test1_projet.Models.HotelsModels
import com.example.test1_projet.Models.restoModels
import com.example.test1_projet.R

import com.example.test1_projet.placeholder.PlaceholderContent.PlaceholderItem
import com.example.test1_projet.databinding.FragmentRestoBinding

/**
 * [RecyclerView.Adapter] that can display a [PlaceholderItem].
 * TODO: Replace the implementation with code for your data type.
 */
class MyrestoRecyclerViewAdapter(
    private val values: List<restoModels>
) : RecyclerView.Adapter<MyrestoRecyclerViewAdapter.MyrestolViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyrestolViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.fragment_hotel, parent, false)
        return MyrestolViewHolder(view)
    }


    override fun onBindViewHolder(holder: MyrestolViewHolder, position: Int) {
        val item = values[position]
        holder.bind(item)

    }

    override fun getItemCount(): Int = values.size


    // class MyhotelRecyclerViewHolder
    class MyrestolViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        fun bind(hotel: restoModels) {
            itemView.findViewById<TextView>(R.id.nomResto).text = hotel.nom
            itemView.findViewById<ImageView>(R.id.imageResto).setImageResource(hotel.image)
        }

    }




}