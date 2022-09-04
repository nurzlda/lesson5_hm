package com.example.lesson5_month3

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    private lateinit var  btnMinus: Button
    private lateinit var btnPlus: Button
    private lateinit var tvText: TextView


    @SuppressLint("CutPasteId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnMinus = findViewById(R.id.btn_minus)
        btnPlus = findViewById(R. id.btn_plus)
        tvText = findViewById(R.id.text)

        var counter = 0

        btnPlus.setOnClickListener {
            counter ++
            if (counter == 10){
                btnPlus.visibility = View.INVISIBLE
                btnMinus.visibility = View.VISIBLE
            }
            tvText.text = counter.toString()
        }

        

        btnMinus.setOnClickListener {
            counter --
            if (counter == 0){
                btnMinus.visibility = View.INVISIBLE
                btnPlus.visibility = View.VISIBLE
            }
            tvText.text = counter.toString()
        }
    }
}