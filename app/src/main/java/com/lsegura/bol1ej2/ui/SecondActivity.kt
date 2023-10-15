package com.lsegura.bol1ej2.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.lsegura.bol1ej2.databinding.ActivitySecondBinding
import com.lsegura.bol1ej2.model.Contacto
import java.lang.IllegalStateException

class SecondActivity : AppCompatActivity() {

    companion object {
        const val CONTACTO = "contacto"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivitySecondBinding.inflate(layoutInflater).apply {
            setContentView(root)
            val contacto = intent.getParcelableExtra<Contacto>(CONTACTO)?:throw IllegalStateException()
            textView.text = contacto.nombre
            Glide.with(imagen).load(contacto.urlImagen).into(imagen)
        }
    }
}