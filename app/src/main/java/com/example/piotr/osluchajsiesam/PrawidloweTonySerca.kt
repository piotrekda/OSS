package com.example.piotr.osluchajsiesam

import android.media.MediaPlayer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_prawidlowe_tony_serca.*

class PrawidloweTonySerca : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prawidlowe_tony_serca)


        textView1.setText("W prawidłowej pracy serca możemy wyróżnić dwa fizjologiczne tony, występujące u wszytkich ludzi:\n" +
                "– I ton – przypada na początkowy okres skurczu komór, trwa około 140 ms. Widmo akustyczne tworzone jest poprzez zamykające się zastawki mitralną i trójdzielną. Najgłośniej słyszalny jest na koniuszku serca.\n" +
                "– II ton – przypada na początkowy okres rozkurczu, trwa około 110 ms. Widmo akustyczne tworzone jest poprzez zamykające się zastawki aortalną (A2) i tętnicy płucnej (P2). Fizjologicznie rozdwaja się na wdechu (A2 prze P2). Najgłośniej słyczalny jest u podstawy serca.\n")

    }

        fun play1(view: View) {
            val mp = MediaPlayer.create(this, R.raw.prawidlowetonyserca)
            mp.start()
        }




}
