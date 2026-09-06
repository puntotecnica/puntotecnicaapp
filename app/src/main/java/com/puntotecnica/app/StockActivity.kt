package com.puntotecnica.app

import android.graphics.Color
import android.os.Bundle
import android.view.Gravity
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class StockActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.setPadding(24, 24, 24, 24)
        layout.setBackgroundColor(Color.WHITE)

        val titulo = TextView(this)
        titulo.text = "DEPÓSITO Y STOCK"
        titulo.textSize = 26f
        titulo.setTextColor(Color.rgb(13, 110, 170))
        titulo.gravity = Gravity.CENTER
        titulo.setTypeface(null, android.graphics.Typeface.BOLD)

        layout.addView(titulo)

        val producto = EditText(this)
        producto.hint = "Material / repuesto"
        layout.addView(producto)

        val cantidad = EditText(this)
        cantidad.hint = "Cantidad actual"
        cantidad.inputType = 2
        layout.addView(cantidad)

        val minimo = EditText(this)
        minimo.hint = "Stock mínimo"
        minimo.inputType = 2
        layout.addView(minimo)

        val guardar = Button(this)
        guardar.text = "GUARDAR PRODUCTO"
        layout.addView(guardar)

        val lista = LinearLayout(this)
        lista.orientation = LinearLayout.VERTICAL
        lista.setPadding(0, 20, 0, 0)
        layout.addView(lista)

        guardar.setOnClickListener {

            if (producto.text.toString().trim().isEmpty()) {
                Toast.makeText(
                    this,
                    "Ingresá el material o repuesto",
                    Toast.LENGTH_SHORT
                ).show()
                return@setOnClickListener
            }

            val item = TextView(this)

            item.text =
                producto.text.toString() +
                " | Cantidad: " +
                cantidad.text.toString() +
                " | Mínimo: " +
                minimo.text.toString()

            item.textSize = 16f
            item.setPadding(10, 15, 10, 15)

            lista.addView(item)

            Toast.makeText(
                this,
                "Producto guardado",
                Toast.LENGTH_SHORT
            ).show()

            producto.text.clear()
            cantidad.text.clear()
            minimo.text.clear()
        }

        setContentView(layout)
    }
}
