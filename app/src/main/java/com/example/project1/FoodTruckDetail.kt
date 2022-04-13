package com.example.project1

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.project1.databinding.ActivityFoodTruckDetailBinding
import java.lang.Exception

class FoodTruckDetail : AppCompatActivity() {
    private lateinit var binding: ActivityFoodTruckDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_truck_detail)

        findViewById<TextView>(R.id.FullScreenName).text = intent.getStringExtra("Name")
        findViewById<TextView>(R.id.FullScreenLocation).text = intent.getStringExtra("Loc")
        findViewById<TextView>(R.id.FullScreenTime).text = intent.getStringExtra("Time")
        findViewById<TextView>(R.id.FullScreenDesc).text = intent.getStringExtra("Description")
        findViewById<TextView>(R.id.FullScreenLink).setOnClickListener{
            val uri = Uri.parse(intent.getStringExtra("Link"))
            val intent = Intent(Intent.ACTION_VIEW,uri)
            startActivity(intent)
        }

        findViewById<ImageView>(R.id.FullScreenImage).setImageResource( when (intent.getIntExtra("ImgNum",0)) {
            0-> R.drawable.streettaco
            1-> R.drawable.buckgrill
            2-> R.drawable.shahhalal
            3-> R.drawable.starginger
            4-> R.drawable.banginbowls
            5-> R.drawable.heftygyro
            else -> throw Exception("Incorrect image number")
        })
    }
}