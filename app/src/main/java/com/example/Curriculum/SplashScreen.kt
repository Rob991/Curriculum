package com.example.Curriculum

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import com.example.curriculum.R
import com.example.curriculum.databinding.ActivitySplashScreenBinding

@Suppress("DEPRECATION")
class SplashScreen : AppCompatActivity() {

    private lateinit var binding: ActivitySplashScreenBinding
    private val splashScreen = 5500

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()
        window.setFlags(FLAG_FULLSCREEN, FLAG_FULLSCREEN)
        val anim1 = AnimationUtils.loadAnimation(this, R.anim.sx_to_dx)
        val anim2 = AnimationUtils.loadAnimation(this, R.anim.appear)

        binding.run {

            imageView1.startAnimation(anim1)
            Handler().postDelayed({
                binding.imageView2.startAnimation(anim2)
                binding.imageView2.visibility = View.VISIBLE
            }, 2000)
            Handler().postDelayed({
                binding.lottieAnim.startAnimation(anim2)
                binding.lottieAnim.visibility = View.VISIBLE
                binding.lottieAnim.playAnimation()
            }, 3000)
        }

        Handler().postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, splashScreen.toLong())
    }

}