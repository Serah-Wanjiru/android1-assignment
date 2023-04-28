package com.example.memes_app

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Meme5 : AppCompatActivity() {
    lateinit var btnBack5:Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme5)
        btnBack5=findViewById(R.id.btnBack5)
        btnBack5.setOnClickListener {
            val intent = Intent(this, Meme4::class.java)
            startActivity(intent)
        }
    }
}