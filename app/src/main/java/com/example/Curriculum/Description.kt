package com.example.Curriculum

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.curriculum.databinding.ActivityDescriptionBinding

class Description : AppCompatActivity() {

    private lateinit var binding: ActivityDescriptionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDescriptionBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        binding.btnDescription.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

        val intent = intent
        val title = intent.getStringExtra("Title")
        val description = intent.getStringExtra("Description")
        val imageView = intent.getIntExtra("Image", 0)

        binding.titleDescription.text = title
        binding.textDescription.text = description
        binding.imageDescription.setBackgroundResource(imageView)
    }
}