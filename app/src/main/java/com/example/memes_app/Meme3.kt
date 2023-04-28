package com.example.memes_app

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Meme3 : AppCompatActivity() {
    lateinit var btnButton3:   Button
    lateinit var btnBack3:Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme3)
        btnButton3 = findViewById(R.id.btnButton3)
        btnBack3=findViewById(R.id.btnBack3)
        btnButton3.setOnClickListener {
            val intent = Intent(this, Meme4::class.java)
            startActivity(intent)
        }
        btnBack3.setOnClickListener {
        val intent = Intent(this, Meme2::class.java)
        startActivity(intent)
        }
    }

}
