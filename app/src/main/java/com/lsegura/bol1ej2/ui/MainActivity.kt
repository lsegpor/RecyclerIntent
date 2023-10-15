package com.lsegura.bol1ej2.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lsegura.bol1ej2.databinding.ActivityMainBinding
import com.lsegura.bol1ej2.model.Contacto

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater).apply {
            setContentView(root)
            recyclerView.adapter = ContactosAdapter(contactos) { contacto ->
                val intent = Intent(this@MainActivity, SecondActivity::class.java)
                intent.putExtra(SecondActivity.CONTACTO, contacto)
                startActivity(intent)
            }
        }
    }

    val contactos = (1 .. 100).map {
        Contacto (
            "Nombre $it",
            "email $it@gmail.com",
            "954$it$it$it$it$it$it",
            "https://picsum.photos/200/300?random=$it"
        )
    }
}