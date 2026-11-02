
package com.uniremote.app

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val fondo = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setPadding(32, 40, 32, 40)
            setBackgroundColor(Color.rgb(16, 24, 39))
        }

        val titulo = TextView(this).apply {
            text = "UniRemote"
            textSize = 34f
            setTextColor(Color.WHITE)
            gravity = Gravity.CENTER
        }

        val subtitulo = TextView(this).apply {
            text = "UNIVERSAL SMART REMOTE"
            textSize = 14f
            setTextColor(Color.LTGRAY)
            gravity = Gravity.CENTER
        }

        val estado = TextView(this).apply {
            text = "Ningún televisor conectado"
            textSize = 17f
            setTextColor(Color.WHITE)
            gravity = Gravity.CENTER
            setPadding(20, 45, 20, 45)
        }

        val buscar = Button(this).apply {
            text = "BUSCAR TELEVISOR"
            setOnClickListener {
                Toast.makeText(
                    this@MainActivity,
                    "La búsqueda de dispositivos estará disponible próximamente",
                    Toast.LENGTH_LONG
                ).show()
            }
        }

        val encender = Button(this).apply {
            text = "ENCENDIDO"
            setOnClickListener {
                Toast.makeText(
                    this@MainActivity,
                    "Primero conecta un televisor",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }

        fondo.addView(titulo)
        fondo.addView(subtitulo)
        fondo.addView(estado)
        fondo.addView(buscar)
        fondo.addView(encender)

        setContentView(fondo)
    }
}
