package com.example.memes_app

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Meme4 : AppCompatActivity() {
    lateinit var btnMeme4: Button
    lateinit var btnBack4:Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme4)
        btnMeme4 = findViewById(R.id.btnMeme4)
        btnBack4=findViewById(R.id.btnBack4)
        btnMeme4.setOnClickListener {
            val intent = Intent(this, Meme5::class.java)
            startActivity(intent)
        }
        btnBack4.setOnClickListener {
            val intent = Intent(this, Meme3::class.java)
            startActivity(intent)
        }
    }
}