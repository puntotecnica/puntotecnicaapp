package com.puntotecnica.app

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.Gravity
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val principal = LinearLayout(this)
        principal.orientation = LinearLayout.VERTICAL
        principal.setPadding(24, 30, 24, 20)
        principal.setBackgroundColor(Color.WHITE)

        val titulo = TextView(this)
        titulo.text = "PUNTO TÉCNICA"
        titulo.textSize = 30f
        titulo.setTextColor(Color.rgb(13, 110, 170))
        titulo.gravity = Gravity.CENTER
        titulo.setTypeface(null, android.graphics.Typeface.BOLD)

        principal.addView(titulo)

        val subtitulo = TextView(this)
        subtitulo.text = "Sistema de Gestión"
        subtitulo.textSize = 18f
        subtitulo.gravity = Gravity.CENTER
        subtitulo.setTextColor(Color.DKGRAY)

        principal.addView(subtitulo)

        agregarBoton(principal, "👤  CLIENTES") {
            startActivity(Intent(this, ClientesActivity::class.java))
        }

        agregarBoton(principal, "🔧  TRABAJOS") {
            startActivity(Intent(this, TrabajosActivity::class.java))
        }

        agregarBoton(principal, "📅  AGENDA") {
            startActivity(Intent(this, AgendaActivity::class.java))
        }

        agregarBoton(principal, "📦  DEPÓSITO Y STOCK") {
            startActivity(Intent(this, StockActivity::class.java))
        }

        agregarBoton(principal, "💰  PRESUPUESTOS") {
            startActivity(Intent(this, PresupuestosActivity::class.java))
        }

        agregarBoton(principal, "📊  RESUMEN") {
            startActivity(Intent(this, ResumenActivity::class.java))
        }

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
        contacto.text = "WhatsApp: 11 3786-7021\npuntotecnica27@gmail.com"
        contacto.textSize = 14f
        contacto.gravity = Gravity.CENTER
        contacto.setTextColor(Color.GRAY)

        principal.addView(contacto)

        setContentView(principal)
    }

    private fun agregarBoton(
        layout: LinearLayout,
        texto: String,
        accion: () -> Unit
    ) {
        val boton = Button(this)
        boton.text = texto
        boton.textSize = 16f

        boton.setOnClickListener {
            accion()
        }

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
