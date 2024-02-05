package com.example.buttonrotation

import android.graphics.Insets.add
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var textView: TextView?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val addButton: Button = findViewById(R.id.addButton)
        textView= findViewById(R.id.textView)
        addButton.setOnClickListener {
        var result = 0
        var res = result++
           textView?.text = res.toString()
        val savedData =  MyApplication.getApp().getSavedData()
        textView?.setText(savedData)

        }
        }
    override fun onPause() {
        super.onPause()
        MyApplication.getApp().saveData(textView?.text.toString())
    }

    }
