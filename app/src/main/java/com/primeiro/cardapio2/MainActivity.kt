package com.primeiro.cardapio2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_hamburguer.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var hamburguers = Hamburguer

        hamburguers.setOnClickListener {

            var intent = Intent(this,hamburguer::class.java)
            startActivity(intent)
        }
    }
}