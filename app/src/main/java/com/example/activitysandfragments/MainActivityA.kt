package com.example.activitysandfragments

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.activitysandfragments.databinding.ActivityMainABinding

class MainActivityA : AppCompatActivity() {

    private lateinit var binding: ActivityMainABinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityMainABinding.inflate(layoutInflater)
    enableEdgeToEdge()
    setContentView(binding.root)
    initListeners()
  }


  private fun initListeners(){
    binding.btnNext.setOnClickListener {
      startActivity(Intent(this, MainActivityB::class.java))
    }
  }

}