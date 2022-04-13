package com.example.project1

import android.os.Bundle
import android.text.Html
import androidx.appcompat.app.AppCompatActivity
import com.example.project1.databinding.ActivityFoodTruckDetailBinding

class FoodTruckDetail : AppCompatActivity() {
    private lateinit var binding: ActivityFoodTruckDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFoodTruckDetailBinding.inflate(layoutInflater)
        var view = binding.root
        setContentView(view)



        binding.nameViewFull.setText(intent.getStringExtra("Name"))
        binding.locationView.setText(intent.getStringExtra("Location"))
        binding.timeView.setText(intent.getStringExtra("Open"))
        binding.imageViewFull.setImageResource(
            when(intent.getIntExtra("Image", 0) ){
                0 -> R.drawable.authentic_street_taco
                1 -> R.drawable.buckhorn_grill
                2 -> R.drawable.shah_s_halal
                3 -> R.drawable.star_ginger
                4 -> R.drawable.bangin_bowls
                5 -> R.drawable.hefty_gyros
                else -> throw Exception("Wrong Image ID")
            }
        )
        val link = "<a style='text-decoration:underline' href='${intent.getStringExtra("Link")}'>Visit Website</a>"
        binding.linkView.setText(Html.fromHtml(link))
        binding.descriptionView.setText(intent.getStringExtra("Description"))
    }
}

