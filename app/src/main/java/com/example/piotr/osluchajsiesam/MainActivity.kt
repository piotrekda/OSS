package com.example.piotr.osluchajsiesam

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat.startActivity
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun toNauka (view: View){
        val intent = Intent(applicationContext,Nauka::class.java)
        startActivity(intent)

    }


fun toTesty (view: View) {
    val intent = Intent(applicationContext, Testy::class.java)
    startActivity(intent)
}
}