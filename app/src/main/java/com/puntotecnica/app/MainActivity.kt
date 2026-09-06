package com.puntotecnica.app

import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val principal = LinearLayout(this)
        principal.orientation = LinearLayout.VERTICAL
        principal.setPadding(24, 24, 24, 24)
        principal.setBackgroundColor(Color.WHITE)

        val titulo = TextView(this)
        titulo.text = "PUNTO TÉCNICA"
        titulo.textSize = 30f
        titulo.setTextColor(Color.rgb(13, 110, 170))
        titulo.gravity = Gravity.CENTER
        titulo.setPadding(0, 20, 0, 5)

        principal.addView(titulo)

        val subtitulo = TextView(this)
        subtitulo.text = "Sistema de Gestión"
        subtitulo.textSize = 18f
        subtitulo.gravity = Gravity.CENTER
        subtitulo.setPadding(0, 0, 0, 25)

        principal.addView(subtitulo)

        agregarBoton(principal, "👤  CLIENTES")
        agregarBoton(principal, "🔧  TRABAJOS")
        agregarBoton(principal, "📅  AGENDA")
        agregarBoton(principal, "📦  DEPÓSITO Y STOCK")
        agregarBoton(principal, "💰  PRESUPUESTOS")
        agregarBoton(principal, "📊  RESUMEN")

        val espacio = Space(this)
        principal.addView(
            espacio,
            LinearLayout.LayoutParams(
                1,
                0,
                1f
            )
        )

        val contacto = TextView(this)
        contacto.text =
            "WhatsApp: 11 3786-7021\npuntotecnica27@gmail.com"
        contacto.textSize = 14f
        contacto.gravity = Gravity.CENTER
        contacto.setPadding(0, 15, 0, 10)

        principal.addView(contacto)

        setContentView(principal)
    }

    private fun agregarBoton(
        layout: LinearLayout,
        texto: String
    ) {
        val boton = Button(this)
        boton.text = texto
        boton.textSize = 16f

        layout.addView(
            boton,
            LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                60
            ).apply {
                setMargins(0, 6, 0, 6)
            }
        )
    }
}
