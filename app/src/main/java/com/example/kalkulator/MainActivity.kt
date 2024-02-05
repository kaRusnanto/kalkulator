package com.example.kalkulator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextPertama: EditText = findViewById(R.id.etValue1);
        val editTextKedua: EditText = findViewById(R.id.etValue2);
        val btnKalkulasi: Button = findViewById(R.id.btnKalkulasi);
        val tvValue: TextView = findViewById(R.id.tvValue);
        val tvHasil: TextView = findViewById(R.id.tvHasil)

        btnKalkulasi.setOnClickListener {
            val randomValue = String.format("%.2f", 1.00 + Random.nextDouble() * (100.00 - 1.00));
            val person1 = editTextPertama.text.toString();
            val person2 = editTextKedua.text.toString();

            val resultMessage = if (randomValue.toDouble() > 75) {
                "Pasangan $person1 dengan $person2 Hasil: $randomValue Sangat Cocok!"
            } else if (randomValue.toDouble() > 50) {
                "Pasangan $person1 dengan $person2 Hasil: $randomValue Cocok!"
            } else {
                "Pasangan $person1 dengan $person2 Hasil: $randomValue Kurang Cocok!"
            }
            Toast.makeText(this, resultMessage, Toast.LENGTH_SHORT).show()
            tvHasil.text = resultMessage
            tvValue.text = "$randomValue%"
        }

    }
}