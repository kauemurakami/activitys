package com.example.activitysandfragments

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.activitysandfragments.databinding.ActivityMainBBinding

class MainActivityB : AppCompatActivity() {
    private lateinit var binding: ActivityMainBBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityMainBBinding.inflate(layoutInflater)
    enableEdgeToEdge()
    setContentView(binding.root)
    toolbar_voltar()
  }

  private fun toolbar_voltar() {
    binding.toolbarBack.setOnClickListener {
      startActivity(Intent(this, MainActivityA::class.java))
    }
  }

}