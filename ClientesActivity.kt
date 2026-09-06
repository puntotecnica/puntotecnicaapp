package com.puntotecnica.app

import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class ClientesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.setPadding(24, 24, 24, 24)
        layout.setBackgroundColor(Color.WHITE)

        val titulo = TextView(this)
        titulo.text = "CLIENTES"
        titulo.textSize = 26f
        titulo.setTextColor(Color.rgb(13, 110, 170))
        titulo.gravity = Gravity.CENTER
        titulo.setPadding(0, 10, 0, 25)

        layout.addView(titulo)

        val nombre = EditText(this)
        nombre.hint = "Nombre y apellido"
        layout.addView(nombre)

        val telefono = EditText(this)
        telefono.hint = "Teléfono / WhatsApp"
        telefono.inputType = 2
        layout.addView(telefono)

        val direccion = EditText(this)
        direccion.hint = "Dirección"
        layout.addView(direccion)

        val localidad = EditText(this)
        localidad.hint = "Localidad"
        layout.addView(localidad)

        val guardar = Button(this)
        guardar.text = "GUARDAR CLIENTE"
        layout.addView(guardar)

        val lista = TextView(this)
        lista.text = "\nClientes registrados:"
        lista.textSize = 18f
        lista.setPadding(0, 25, 0, 10)

        layout.addView(lista)

        guardar.setOnClickListener {

            if (nombre.text.toString().trim().isEmpty()) {
                Toast.makeText(
                    this,
                    "Ingresá el nombre del cliente",
                    Toast.LENGTH_SHORT
                ).show()
                return@setOnClickListener
            }

            lista.append(
                "\n\n" +
                "Cliente: ${nombre.text}\n" +
                "WhatsApp: ${telefono.text}\n" +
                "Dirección: ${direccion.text}\n" +
                "Localidad: ${localidad.text}"
            )

            nombre.text.clear()
            telefono.text.clear()
            direccion.text.clear()
            localidad.text.clear()

            Toast.makeText(
                this,
                "Cliente guardado",
                Toast.LENGTH_SHORT
            ).show()
        }

        setContentView(layout)
    }
}
