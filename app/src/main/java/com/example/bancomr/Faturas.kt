package com.example.bancomr

import android.content.Intent
import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.bancomr.databinding.ActivityFaturasBinding

class Faturas : AppCompatActivity() {

    private lateinit var binding: ActivityFaturasBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFaturasBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar!!.hide()  // para esconder a barra de ação para determinada pagina

        val toolbar = binding.toolbarFaturas
        toolbar.title = "Faturas"
        toolbar.setTitleTextColor(getColor(R.color.white))
        toolbar.setTitleMargin(300, 0, 250, 0)
        toolbar.setBackgroundColor(getColor(R.color.light_blue))
        toolbar.setNavigationIcon(getDrawable(R.drawable.ic_voltar))
        toolbar.setNavigationOnClickListener {

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}