package com.example.test1_projet.adapter

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.test1_projet.Models.HotelsModels
import com.example.test1_projet.R




/**
 * [RecyclerView.Adapter] that can display a [PlaceholderItem].
 * TODO: Replace the implementation with code for your data type.
 */
class MyhotelRecyclerViewAdapter(
    private val values: List<HotelsModels>
) : RecyclerView.Adapter<MyhotelRecyclerViewAdapter.MyhotelViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyhotelViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.fragment_hotel, parent, false)
        return MyhotelViewHolder(view)
    }


    override fun onBindViewHolder(holder: MyhotelViewHolder, position: Int) {
        val item = values[position]
        holder.bind(item)

    }

    override fun getItemCount(): Int = values.size


    // class MyhotelRecyclerViewHolder
    class MyhotelViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        fun bind(hotel: HotelsModels) {
            itemView.findViewById<TextView>(R.id.nomResto).text = hotel.nom
            itemView.findViewById<ImageView>(R.id.imageResto).setImageResource(hotel.image)
        }

}




}