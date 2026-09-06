package com.puntotecnica.app

import android.graphics.Color
import android.os.Bundle
import android.view.Gravity
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class PresupuestosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.setPadding(24, 24, 24, 24)
        layout.setBackgroundColor(Color.WHITE)

        val titulo = TextView(this)
        titulo.text = "PRESUPUESTOS"
        titulo.textSize = 28f
        titulo.setTextColor(Color.rgb(13, 110, 170))
        titulo.gravity = Gravity.CENTER
        titulo.setTypeface(null, android.graphics.Typeface.BOLD)
        layout.addView(titulo)

        val cliente = EditText(this)
        cliente.hint = "Cliente"
        layout.addView(cliente)

        val descripcion = EditText(this)
        descripcion.hint = "Descripción del trabajo"
        layout.addView(descripcion)

        val materiales = EditText(this)
        materiales.hint = "Materiales"
        layout.addView(materiales)

        val manoObra = EditText(this)
        manoObra.hint = "Mano de obra"
        manoObra.inputType = 2
        layout.addView(manoObra)

        val total = EditText(this)
        total.hint = "Total del presupuesto"
        total.inputType = 2
        layout.addView(total)

        val estado = Spinner(this)

        val estados = arrayOf(
            "Pendiente",
            "Enviado",
            "Aceptado",
            "Rechazado"
        )

        estado.adapter = ArrayAdapter(
            this,
            android.R.layout.simple_spinner_dropdown_item,
            estados
        )

        layout.addView(estado)

        val guardar = Button(this)
        guardar.text = "GUARDAR PRESUPUESTO"
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
                "Presupuesto guardado correctamente",
                Toast.LENGTH_SHORT
            ).show()
        }

        setContentView(layout)
    }
}
