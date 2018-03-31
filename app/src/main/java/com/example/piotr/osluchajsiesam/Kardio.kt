package com.example.piotr.osluchajsiesam

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Kardio : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kardio)
    }

    fun toPrawidloweTonySerca(view: View) {
        val intent = Intent(applicationContext, PrawidloweTonySerca::class.java)
        startActivity(intent)

    }
    fun toJakOsluchiwac(view: View) {
        val intent = Intent(applicationContext, JakOsluchiwac::class.java)
        startActivity(intent)

    }
}