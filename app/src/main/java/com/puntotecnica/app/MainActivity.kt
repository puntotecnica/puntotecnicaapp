package com.puntotecnica.app

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.setPadding(30, 30, 30, 30)

        val titulo = TextView(this)
        titulo.text = "PUNTO TÉCNICA"
        titulo.textSize = 28f

        layout.addView(titulo)

        val subtitulo = TextView(this)
        subtitulo.text = "Gestión de Refrigeración, Climatización y Electricidad"
        subtitulo.textSize = 16f

        layout.addView(subtitulo)

        val clientes = Button(this)
        clientes.text = "👤 Clientes"
        layout.addView(clientes)

        val trabajos = Button(this)
        trabajos.text = "🔧 Trabajos"
        layout.addView(trabajos)

        val stock = Button(this)
        stock.text = "📦 Depósito y Stock"
        layout.addView(stock)

        val agenda = Button(this)
        agenda.text = "📅 Agenda"
        layout.addView(agenda)

        val presupuestos = Button(this)
        presupuestos.text = "💰 Presupuestos"
        layout.addView(presupuestos)

        val resumen = Button(this)
        resumen.text = "📊 Resumen"
        layout.addView(resumen)

        val contacto = TextView(this)
        contacto.text = "\nWhatsApp: 11 3786-7021\nEmail: puntotecnica27@gmail.com"
        contacto.textSize = 14f
        layout.addView(contacto)

        setContentView(layout)
    }
}
