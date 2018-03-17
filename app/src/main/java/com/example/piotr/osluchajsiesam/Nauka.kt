package com.example.piotr.osluchajsiesam

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Nauka : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nauka)
    }

    fun toKardiologiczne (view: View){
        val intent = Intent(applicationContext,Kardio::class.java)
        startActivity(intent)

    }
    fun toPulmonologiczne (view: View) {
        val intent = Intent(applicationContext, Pulmono::class.java)
        startActivity(intent)
    }

}
