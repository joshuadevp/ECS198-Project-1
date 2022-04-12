package com.example.project1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TruckListRecyclerViewAdapter(private var trucks: List<FoodTruck>): RecyclerView.Adapter<TruckListRecyclerViewAdapter.ViewHolder>() {

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageView)
        val nameView: TextView = itemView.findViewById(R.id.nameView)
        val locationTimeView: TextView = itemView.findViewById(R.id.locationTimeView)

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.food_truck_item, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val truck = trucks[position]

        holder.imageView.setImageResource( R.drawable.hefty_gyros
//            when (truck.image) {
//            0 -> R.drawable.authentic_street_taco
//            1 -> R.drawable.buckhorn_grill
//            2 -> R.drawable.shah_s_halal
//            3 -> R.drawable.star_ginger
//            4 -> R.drawable.bangin_bowls
//            5 -> R.drawable.hefty_gyros
//            else -> throw Exception("Wrong Image ID")
//        }

        )

        holder.nameView.text = truck.name
        holder.locationTimeView.text = "${truck.location} \u2022 ${truck.open}"
    }

    override fun getItemCount(): Int {
        return trucks.size
    }
}