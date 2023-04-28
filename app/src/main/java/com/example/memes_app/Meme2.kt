package com.example.memes_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Meme2 : AppCompatActivity() {
    lateinit var btnNext2: Button
    lateinit var btnBack1: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme2)
        btnNext2 = findViewById(R.id.btnNext2)
        btnBack1 = findViewById(R.id.btnBack1)
        btnNext2.setOnClickListener {
            val intent = Intent(this, Meme3::class.java)
            startActivity(intent)
        }
        btnBack1.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}