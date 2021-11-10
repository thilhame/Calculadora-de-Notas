package com.example.calculadoradenotas

import android.os.Bundle
import android.service.autofill.Validators.or
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //validar_dados()
        calculo()

    }

    private fun calculo() {
        val btCalcular = calcular
        val resultado = resultado

        btCalcular.setOnClickListener() {
            val nota1 = Integer.parseInt(nota1.text.toString())
            val nota2 = Integer.parseInt(nota2.text.toString())
            val faltas = Integer.parseInt(faltas.text.toString())
            val soma = (nota1 + nota2) / 2
            val media = soma


            if (media >= 6 && faltas <= 10) {
                resultado.setText("aluno foi Aprovado" + '\n' + "nota final:" + media + '\n' + "faltas:" + faltas)

            }
            else {
                resultado.setText("aluno foi reprovado" + '\n' + "nota final:" + media + '\n' + "faltas:" + faltas)

            }}
        }
    }


    }



