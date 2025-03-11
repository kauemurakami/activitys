package com.example.activitysandfragments

import android.app.Instrumentation.ActivityResult
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContract
import androidx.activity.result.contract.ActivityResultContracts
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
    Log.i("A", "oncreate")
    initListeners()
  }



  private fun initListeners(){

    binding.btnNext.setOnClickListener {
      val intent = Intent(this, MainActivityB::class.java)
      //intent.putExtra("user", User("Kauê Murakami", 29))
      //startActivity(intent)
      resultLauncher.launch(intent)
    }
  }

  private val resultLauncher = registerForActivityResult(
    ActivityResultContracts.StartActivityForResult()
  ) { result ->
    val resultCode = result.resultCode
    val data = result.data

    if (resultCode == RESULT_OK && data != null && data.hasExtra("user")) {
      val user = data.getSerializableExtra("user") as User
      Log.i("resultback", "resultLauncher: ${user.name}")
    }
  }

}
