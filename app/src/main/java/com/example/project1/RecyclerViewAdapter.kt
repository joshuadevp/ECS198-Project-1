package com.example.project1

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.project1.Model.FoodTruck

class RecyclerViewAdapter(private var trucks: List<FoodTruck>): RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

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

        holder.imageView.setImageResource(
            when (truck.image) {
            0 -> R.drawable.authentic_street_taco
            1 -> R.drawable.buckhorn_grill
            2 -> R.drawable.shah_s_halal
            3 -> R.drawable.star_ginger
            4 -> R.drawable.bangin_bowls
            5 -> R.drawable.hefty_gyros
            else -> throw Exception("Wrong Image ID")
        }

        )

        holder.itemView.setOnClickListener {
            var intent = Intent(holder.itemView.context, FoodTruckDetail::class.java)
            intent.putExtra("Image", truck.image)
            intent.putExtra("Name", truck.name)
            intent.putExtra("Location", truck.location)
            intent.putExtra("Open", truck.open)
            intent.putExtra("Description", truck.description)
            intent.putExtra("Link", truck.link)

            holder.itemView.context.startActivity(intent)
        }

        holder.nameView.text = truck.name
        holder.locationTimeView.text = "${truck.location} \u2022 ${truck.open}"
    }

    override fun getItemCount(): Int {
        return trucks.size
    }
}