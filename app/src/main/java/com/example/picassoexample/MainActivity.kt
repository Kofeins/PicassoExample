package com.example.picassoexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.*

import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val catView: ImageView = findViewById(R.id.cat)
        val catBtn: Button = findViewById(R.id.load)


        var fox: String



        catBtn.setOnClickListener{
            fox = (1..121).random().toString()
            Picasso.get().load("https://randomfox.ca/images/$fox.jpg").into(catView);
        }




    }
}