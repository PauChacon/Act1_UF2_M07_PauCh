package com.example.projecte_m07

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Ajustes : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ajustes)

        val backButton = findViewById<Button>(R.id.buttonBack)
        backButton.setOnClickListener {
            finish()
        }
    }
}
