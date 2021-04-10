package com.example.Curriculum

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.curriculum.R
import com.example.curriculum.databinding.ActivityMainBinding

class MainActivity : FragmentActivity() {

    private lateinit var binding: ActivityMainBinding
    private val number: String = "+393664095028"
    private lateinit var dialog: Dialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dialog = Dialog(this)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.callBtn.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + Uri.encode(number)))
            startActivity(intent)
        }

        binding.emailBtn.setOnClickListener {
            startActivity(Intent(this, EmailSender::class.java))
        }

        binding.infoBtn.setOnClickListener {
            dialog.setContentView(R.layout.dialog_layout)
            dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            dialog.show()
            val button = dialog.findViewById<Button>(R.id.thanks_btn)
            button.setOnClickListener { dialog.dismiss() }
        }

        binding.myPhoto.setOnClickListener {
            dialog.setContentView(R.layout.photo_layout)
            dialog.show()
        }

        val works: ArrayList<String> = ArrayList()
        works.add("Planet Kebab")
        works.add("Clean Service")
        works.add("Pronto Pizzeria")
        works.add("Eiscafè Venezia")
        works.add("Ristorante Lafonte")
        val instructions: ArrayList<String> = ArrayList()
        instructions.add("Android Developer Junior")
        instructions.add("Diploma Perito Informatico")
        val languages: ArrayList<String> = ArrayList()
        languages.add("Italiano")
        languages.add("Inglese")
        val digitalCompetence: ArrayList<String> = ArrayList()
        digitalCompetence.add("Competenze digitali")
        val personalCompetence: ArrayList<String> = ArrayList()
        personalCompetence.add("Competenze personali")
        val certifications: ArrayList<String> = ArrayList()
        certifications.add("IC3 Certification")
        certifications.add("MOS:Microsoft Office Specialist")
        certifications.add("Certificato ECDL")
        val hobbies: ArrayList<String> = ArrayList()
        hobbies.add("Hobby e Interessi")

        binding.recyclerView1.layoutManager =
            LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)
        binding.recyclerView1.adapter = PostsAdapter(works)
        binding.recyclerView2.layoutManager =
            LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)
        binding.recyclerView2.adapter = PostsAdapter(instructions)
        binding.recyclerView3.layoutManager =
            LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)
        binding.recyclerView3.adapter = PostsAdapter(languages)
        binding.recyclerView4.layoutManager =
            LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)
        binding.recyclerView4.adapter = PostsAdapter(digitalCompetence)
        binding.recyclerView5.layoutManager =
            LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)
        binding.recyclerView5.adapter = PostsAdapter(personalCompetence)
        binding.recyclerView6.layoutManager =
            LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)
        binding.recyclerView6.adapter = PostsAdapter(certifications)
        binding.recyclerView7.layoutManager =
            LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)
        binding.recyclerView7.adapter = PostsAdapter(hobbies)
    }

}