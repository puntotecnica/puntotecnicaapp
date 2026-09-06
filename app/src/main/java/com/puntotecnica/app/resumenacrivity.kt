package com.puntotecnica.app

import android.graphics.Color
import android.os.Bundle
import android.view.Gravity
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class ResumenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.setPadding(24, 30, 24, 24)
        layout.setBackgroundColor(Color.WHITE)

        val titulo = TextView(this)
        titulo.text = "RESUMEN"
        titulo.textSize = 30f
        titulo.setTextColor(Color.rgb(13, 110, 170))
        titulo.gravity = Gravity.CENTER
        titulo.setTypeface(null, android.graphics.Typeface.BOLD)

        layout.addView(titulo)

        agregarDato(layout, "👤 Clientes registrados", "0")
        agregarDato(layout, "🔧 Trabajos pendientes", "0")
        agregarDato(layout, "🔧 Trabajos terminados", "0")
        agregarDato(layout, "📅 Visitas programadas", "0")
        agregarDato(layout, "📦 Productos con stock bajo", "0")
        agregarDato(layout, "💰 Presupuestos pendientes", "0")

        val volver = Button(this)
        volver.text = "VOLVER AL INICIO"

        volver.setOnClickListener {
            finish()
        }

        layout.addView(
            volver,
            LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                60
            ).apply {
                setMargins(0, 30, 0, 0)
            }
        )

        setContentView(layout)
    }

    private fun agregarDato(
        layout: LinearLayout,
        nombre: String,
        valor: String
    ) {
        val fila = TextView(this)

        fila.text = "$nombre: $valor"
        fila.textSize = 18f
        fila.setPadding(10, 15, 10, 15)

        layout.addView(fila)
    }
}
