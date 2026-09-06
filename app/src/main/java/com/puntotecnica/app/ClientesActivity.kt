package com.puntotecnica.app

import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class ClientesActivity : AppCompatActivity() {

    private val clientes = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val principal = LinearLayout(this)
        principal.orientation = LinearLayout.VERTICAL
        principal.setPadding(24, 24, 24, 24)
        principal.setBackgroundColor(Color.WHITE)

        val titulo = TextView(this)
        titulo.text = "CLIENTES"
        titulo.textSize = 28f
        titulo.setTextColor(Color.rgb(13, 110, 170))
        titulo.gravity = Gravity.CENTER
        titulo.setPadding(0, 10, 0, 20)
        principal.addView(titulo)

        val nombre = EditText(this)
        nombre.hint = "Nombre y apellido"
        principal.addView(nombre)

        val telefono = EditText(this)
        telefono.hint = "Teléfono / WhatsApp"
        telefono.inputType = 3
        principal.addView(telefono)

        val direccion = EditText(this)
        direccion.hint = "Dirección"
        principal.addView(direccion)

        val localidad = EditText(this)
        localidad.hint = "Localidad"
        principal.addView(localidad)

        val guardar = Button(this)
        guardar.text = "GUARDAR CLIENTE"
        principal.addView(guardar)

        val lista = LinearLayout(this)
        lista.orientation = LinearLayout.VERTICAL
        lista.setPadding(0, 20, 0, 0)

        principal.addView(lista)

        guardar.setOnClickListener {

            if (nombre.text.toString().trim().isEmpty()) {
                Toast.makeText(
                    this,
                    "Ingresá el nombre del cliente",
                    Toast.LENGTH_SHORT
                ).show()
                return@setOnClickListener
            }

            val cliente =
                nombre.text.toString() +
                " | " +
                telefono.text.toString() +
                " | " +
                direccion.text.toString() +
                " | " +
                localidad.text.toString()

            clientes.add(cliente)

            val clienteTexto = TextView(this)
            clienteTexto.text = cliente
            clienteTexto.textSize = 16f
            clienteTexto.setPadding(10, 15, 10, 15)

            lista.addView(clienteTexto)

            nombre.text.clear()
            telefono.text.clear()
            direccion.text.clear()
            localidad.text.clear()

            Toast.makeText(
                this,
                "Cliente guardado correctamente",
                Toast.LENGTH_SHORT
            ).show()
        }

        setContentView(principal)
    }
}
}
