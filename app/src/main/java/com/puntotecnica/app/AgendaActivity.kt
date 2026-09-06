package com.puntotecnica.app

import android.graphics.Color
import android.os.Bundle
import android.view.Gravity
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class AgendaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.setPadding(24, 24, 24, 24)
        layout.setBackgroundColor(Color.WHITE)

        val titulo = TextView(this)
        titulo.text = "AGENDA"
        titulo.textSize = 28f
        titulo.setTextColor(Color.rgb(13, 110, 170))
        titulo.gravity = Gravity.CENTER

        layout.addView(titulo)

        val fecha = EditText(this)
        fecha.hint = "Fecha"
        layout.addView(fecha)

        val hora = EditText(this)
        hora.hint = "Hora"
        layout.addView(hora)

        val cliente = EditText(this)
        cliente.hint = "Cliente"
        layout.addView(cliente)

        val trabajo = EditText(this)
        trabajo.hint = "Trabajo / visita"
        layout.addView(trabajo)

        val guardar = Button(this)
        guardar.text = "GUARDAR TURNO"
        layout.addView(guardar)

        guardar.setOnClickListener {
            Toast.makeText(
                this,
                "Turno guardado correctamente",
                Toast.LENGTH_SHORT
            ).show()
        }

        setContentView(layout)
    }
}
