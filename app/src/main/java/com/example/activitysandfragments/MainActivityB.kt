package com.example.activitysandfragments

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
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
    getExtras()
  }

  private fun getExtras(){
    if (intent.hasExtra("user")){
      val user = intent.getSerializableExtra("user") as User
    }
  }
  private fun toolbar_voltar() {
    binding.toolbarBack.setOnClickListener {
      //val intent = Intent(this, MainActivityA::class.java)
      //startActivity(intent)
      val user = User("Kauê Murakami", 29)
      val intent = Intent().apply {
        putExtra("user", user)
      }

      setResult(RESULT_OK, intent)
      finish()
    }
  }

  override fun onOptionsItemSelected(item: MenuItem): Boolean {
    val intent = Intent()
    intent.putExtra("user", User("Kaue Murakami", 29))
    setResult(RESULT_OK, intent)
    return super.onOptionsItemSelected(item)
  }

}