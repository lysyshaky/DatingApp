package com.example.datingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class SwapActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_swap)

        val like = findViewById<ImageView>(R.id.likebtn);


        like.setOnClickListener {
            val intent = Intent(this, ProfileSwapActivity::class.java)
            startActivity(intent)
        }

    }
}