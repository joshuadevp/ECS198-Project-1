package com.example.project1

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import java.lang.Exception
import android.view.View.OnClickListener;
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.startActivity

class ListRecyclerViewAdapter(private val events: List<FoodTruck>): RecyclerView.Adapter<ListRecyclerViewAdapter.ViewHolder>(){



    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val nameText: TextView = itemView.findViewById(R.id.Name)
        val locText: TextView = itemView.findViewById(R.id.Location)
        val timeText: TextView = itemView.findViewById(R.id.Time)
        val imgView: ImageView = itemView.findViewById(R.id.RecyclerImage)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.food_truck_item,parent,false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val event = events[position]

        holder.apply {
            nameText.text = event.name
            locText.text = event.loc
            timeText.text = event.time
            imgView.setImageResource( when (event.imgNum) {
                0-> R.drawable.streettaco
                1-> R.drawable.buckgrill
                2-> R.drawable.shahhalal
                3-> R.drawable.starginger
                4-> R.drawable.banginbowls
                5-> R.drawable.heftygyro
                else -> throw Exception("Incorrect image number")
            })

            holder.itemView.setOnClickListener {
                val intent = Intent(it.context, FoodTruckDetail::class.java).apply{
                    putExtra("Name", event.name)
                    putExtra("Loc", event.loc)
                    putExtra("Time", event.time)
                    putExtra("ImgNum", event.imgNum)
                    putExtra("Description", event.desc)
                    putExtra("Link", event.link)
                }
                it.context.startActivity(intent)
            }
        }
    }

    override fun getItemCount(): Int {
        return events.size
    }
}