package com.example.project1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.project1.databinding.ActivityFoodTruckDetailBinding

class FoodTruckDetail : AppCompatActivity() {
    private lateinit var binding: ActivityFoodTruckDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_truck_detail)

        val nameText: TextView = findViewById(R.id.FullScreenName)

        nameText.text = intent.getStringExtra("Name")
        intent.getStringExtra("Name")
        intent.getStringExtra("Name")
        intent.getStringExtra("Name")
        intent.getStringExtra("Name")
        intent.getStringExtra("Name")
    }
}