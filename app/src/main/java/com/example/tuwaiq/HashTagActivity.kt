package com.example.tuwaiq

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.tuwaiq.databinding.ActivityMainBinding
import com.google.android.material.textfield.TextInputEditText

class HashTagActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_hash_tag)

        val backImage: ImageView = findViewById(R.id.back)
        val search: TextInputEditText = findViewById(R.id.search_edittext)
        backImage.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            this.startActivity(intent)
        }
        search.setText(R.string.hash)
    }
}