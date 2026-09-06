package com.puntotecnica.app

import android.graphics.Color
import android.os.Bundle
import android.view.Gravity
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class TrabajosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.setPadding(24, 24, 24, 24)
        layout.setBackgroundColor(Color.WHITE)

        val titulo = TextView(this)
        titulo.text = "TRABAJOS"
        titulo.textSize = 28f
        titulo.setTextColor(Color.rgb(13, 110, 170))
        titulo.gravity = Gravity.CENTER
        titulo.setTypeface(null, android.graphics.Typeface.BOLD)

        layout.addView(titulo)

        val cliente = EditText(this)
        cliente.hint = "Cliente"
        layout.addView(cliente)

        val tipo = EditText(this)
        tipo.hint = "Tipo de trabajo"
        layout.addView(tipo)

        val equipo = EditText(this)
        equipo.hint = "Equipo / modelo"
        layout.addView(equipo)

        val fecha = EditText(this)
        fecha.hint = "Fecha"
        layout.addView(fecha)

        val materiales = EditText(this)
        materiales.hint = "Materiales utilizados"
        layout.addView(materiales)

        val manoObra = EditText(this)
        manoObra.hint = "Mano de obra"
        layout.addView(manoObra)

        val importe = EditText(this)
        importe.hint = "Importe"
        importe.inputType = 2
        layout.addView(importe)

        val estado = Spinner(this)

        val estados = arrayOf(
            "Pendiente",
            "En curso",
            "Terminado"
        )

        estado.adapter = ArrayAdapter(
            this,
            android.R.layout.simple_spinner_dropdown_item,
            estados
        )

        layout.addView(estado)

        val guardar = Button(this)
        guardar.text = "GUARDAR TRABAJO"
        layout.addView(guardar)

        guardar.setOnClickListener {

            if (cliente.text.toString().trim().isEmpty()) {
                Toast.makeText(
                    this,
                    "Ingresá el cliente",
                    Toast.LENGTH_SHORT
                ).show()
                return@setOnClickListener
            }

            Toast.makeText(
                this,
                "Trabajo guardado correctamente",
                Toast.LENGTH_SHORT
            ).show()
        }

        setContentView(layout)
    }
}
