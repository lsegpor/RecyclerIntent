package com.lsegura.bol1ej2.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class Contacto (
    val nombre: String,
    val email: String,
    val telefono: String,
    val urlImagen: String
): Parcelable