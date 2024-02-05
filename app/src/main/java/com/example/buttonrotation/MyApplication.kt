package com.example.buttonrotation

import android.app.Application
import android.content.Context
import android.content.SharedPreferences

class MyApplication: Application() {

     private lateinit var sharedPrefs:SharedPreferences


    override fun onCreate() {
        super.onCreate()
        instance = this
        sharedPrefs = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)

    }

    fun saveData(title:String){
        sharedPrefs.edit().putString("MyKey", title).apply()
    }

    fun getSavedData(): String {
      return sharedPrefs.getString("MyKey","")?:""
    }



    companion object {
        private lateinit var instance: MyApplication
        fun getApp() = instance

    }
}