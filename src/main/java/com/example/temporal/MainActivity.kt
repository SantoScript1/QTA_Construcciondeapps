package com.example.temporal

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val valorpropiedad = findViewById<TextInputEditText>(R.id.valorpropiedad)
        //val cuantonecesitas = findViewById<TextInputEditText>(R.id.cuantonecesitas)
        //val aqueplazo = findViewById<TextInputEditText>(R.id.aqueplazo)
        //val aquetaza = findViewById<TextInputEditText>(R.id.aquetaza)
        val calcular = findViewById<Button>(R.id.calcular)
        val total = findViewById<TextView>(R.id.total)

        calcular.setOnClickListener {
            total.text = ""

            if (valorpropiedad.text.toString().toInt() < 70000000) {
                valorpropiedad.error = "El valor minimo de la propiedad debe de ser $70.000.000"
                return@setOnClickListener
            }

            //var tae: Int = (aquetaza.text.toString().toInt() / 12) / 100

            total.text = valorpropiedad.text.toString()



        }

    }
}