package com.example.bancomr

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bancomr.databinding.ActivityTransferenciaBinding

class Transferencia : AppCompatActivity() {

    private lateinit var  binding: ActivityTransferenciaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTransferenciaBinding.inflate(layoutInflater)
        setContentView(binding.root)


        supportActionBar!!.hide()  // para esconder a barra de ação para determinada pagina

        val toolbar = binding.toolbarTranferencia
        toolbar.title = "Transferência"
        toolbar.setTitleTextColor(getColor(R.color.white))
        toolbar.setTitleMargin(250, 0, 250, 0)
        toolbar.setBackgroundColor(getColor(R.color.light_blue))
        toolbar.setNavigationIcon(getDrawable(R.drawable.ic_voltar))
        toolbar.setNavigationOnClickListener {

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }


    }
}