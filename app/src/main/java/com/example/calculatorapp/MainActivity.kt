package com.example.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var display_results:TextView
    lateinit var first_edt:EditText
    lateinit var second_edt:EditText

    lateinit var btn_add:Button
    lateinit var btn_multiply:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        display_results = findViewById(R.id.txtdisplay)
        first_edt = findViewById(R.id.edtfirst)
        second_edt = findViewById(R.id.edtsecond)
        btn_add = findViewById(R.id.btnadd)
        btn_multiply = findViewById(R.id.btnmultiply)

        btn_add.setOnClickListener {

        }

        btn_multiply.setOnClickListener {

        }

    }
}