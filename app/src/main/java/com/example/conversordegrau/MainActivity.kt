package com.example.conversordegrau

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    private lateinit var editTextValor : EditText
    private lateinit var radioGroupGrau: RadioGroup
    private lateinit var textView: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextValor = findViewById(R.id.editTextValor)
        radioGroupGrau = findViewById(R.id.radioGroupGrau)
        textView = findViewById(R.id.textView)

        radioGroupGrau.setOnCheckedChangeListener{group, checkedId ->
            if (radioGroupGrau.checkedRadioButtonId==R.id.radioButtonFahrenheit){

                var valorCauculado=((editTextValor.text.toString().toDouble() * 1.8) + 32)

                textView.text=valorCauculado.toString() + " Graus Fahrenheit"

            }
            else
            {
                var valorCauculado=((editTextValor.text.toString().toDouble() - 32) / 1.8)

                textView.text=valorCauculado.toString() + " Graus Celcios"

            }

        }

    }




}
