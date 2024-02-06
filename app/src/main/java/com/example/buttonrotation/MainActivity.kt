package com.example.buttonrotation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var textView: TextView?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val addButton: Button = findViewById(R.id.addButton)
        textView= findViewById(R.id.textView)
        val savedData =  MyApplication.getApp().getSavedData()
        var result = 0
        if( savedData.isNotEmpty()){
            result = savedData.toInt()
        }
        textView?.text = result.toString()

        addButton.setOnClickListener {
        var res = result++
           textView?.text = res.toString()

        }
        }
    override fun onPause() {
      super.onPause()
     MyApplication.getApp().saveData(textView?.text.toString())
    }

    }
