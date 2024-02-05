package com.example.buttonrotation

import android.graphics.Insets.add
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val addButton: Button = findViewById(R.id.addButton)
        val textView: TextView = findViewById(R.id.textView)
        var result = 0

        addButton.setOnClickListener {
            var res = result++
            textView.text = res.toString()
        }

        }
    }
