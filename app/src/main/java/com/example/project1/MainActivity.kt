package com.example.project1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    val trucks = listOf(
        FoodTruck(
            0,
            "Authentic Street Taco",
            0,
            "Silo Patio",
            "11am - 4pm",
            "A unique blend of street taco with high-quality ingredients to give you the highest quality Mexican food.",
            "https://www.authen ticstreettaco.com/"
        ),
        FoodTruck(
            1,
            "Buckhorn Grill",
            1,
            "Silo Patio",
            "10am - 2pm",
            "The idea of the Buckhorn Grill was born out of the success of the product at the Chef’s Market in Napa, California. Thousands of Tri-Tip sandwiches were sold at the market on Friday nights. The first Buckhorn Grill opened in the Metreon located in San Francisco, California in 1999. Each Buckhorn Grill is uniquely designed and provides a friendly, family atmosphere with Really Good Food, Real Fast.",
            "https://buckhorngril l.com/"
        ),
        FoodTruck(
            2,
            "Shah's Halal",
            2,
            "Silo Patio",
            "12am - 4pm",
            "Owned and operated by Tory Mashriqi, Shah’s Halal Foods serves strictly Halal certified meats and features a menu of several Mediterranean inspired items including rice, salad, homemade sauces, lamb, chicken and falafel. Made fresh, they are cooked over a large flat griddle.",
            "https://shahshalalfo od.myfreesites.net/"
        ),
        FoodTruck(
            3,
            "Star Ginger",
            3,
            "Silo Patio",
            "1pm - 4pm",
            "Fresh Asian flavors for campus, corporate, government, healthcare and leisure",
            "https://www.stargin ger.com/"
        ),
        FoodTruck(
            4,
            "Bangin Bowls",
            4,
            "Tercero DC",
            "2pm - 6pm",
            "We are a Latin fusion food truck buffet, inspired by South American and Caribbean food, to bring to our beloved city Sacramento something different, healthy, with many flavors and with fresh grilled meats.",
            "https://www.labang inbowls.com/"
        ),
        FoodTruck(
            5,
            "Hefty Gyros",
            5,
            "Storer Hall",
            "1pm - 4pm",
            "Hefty Gyros is a family owned and operated food truck that serves delicious and great quality food. As a family owned business, we put our heart and soul with passion to serve the most authentic and delicious Mediterranean food.",
            "https://heftygyros.com/"
        )
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.MainRecyclerView)

        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)

    }
}