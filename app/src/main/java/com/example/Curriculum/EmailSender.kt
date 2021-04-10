package com.example.Curriculum

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.curriculum.databinding.ActivityEmailSenderBinding

class EmailSender : AppCompatActivity() {

    private lateinit var binding: ActivityEmailSenderBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEmailSenderBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        binding.sendBtn.setOnClickListener {
            val email = binding.email.text.toString().trim()
            val obj = binding.`object`.text.toString().trim()
            val message = binding.message.text.toString().trim()

            sendEmail(email, obj, message)
        }

    }

    private fun sendEmail(email: String, obj: String, message: String) {
        val mIntent = Intent(Intent.ACTION_SEND)
        mIntent.data = Uri.parse("mailto:")
        mIntent.type = "text/plain"
        mIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf(email))
        mIntent.putExtra(Intent.EXTRA_SUBJECT, obj)
        mIntent.putExtra(Intent.EXTRA_TEXT, message)

        try {
            startActivity(Intent.createChooser(mIntent, "Scegli l'app da utilizzare..."))
        } catch (e: Exception) {
            Toast.makeText(this, e.message, Toast.LENGTH_LONG).show()
        }
    }

}