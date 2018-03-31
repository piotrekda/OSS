package com.example.piotr.osluchajsiesam

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_jak_osluchiwac.*

class JakOsluchiwac : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jak_osluchiwac)

        textView.setText("Osłuchuj serce u spokojnie oddychającego pacjenta leżącego na plecach, w razie potrzeby polecając mu zatrzymanie oddechu w fazie wdechu lub wydechu. Szmery z prawego serca z reguły są głośniejsze w fazie wdechu.\n" +
                "Na poniższej rycinie znajdują się 4 główne pola osłuchiwania serca wraz z ich centralnymi punktami:\n" +
                "– pole osłuchiwania zastawki mitralnej [M] (lewe międzyżebrze przyśrodkowo od linii środkowo-obojczykowej)\n" +
                "– pole osłuchiwania zastawki trójdzielnej [T] (IV–V prawe międzyżebrze przy mostku)\n" +
                "– pole osłuchiwania zastawki pnia płucnego [PP]  (II lewe międzyżebrze przy mostku)\n" +
                "– pole osłuchiwania zastawki aorty [Ao] (II prawe międzyżebrze przy mostku)\n" +
                "– oraz punkt Erba (przyczep 3 lewego żebra do mostka ) - miejsce na klatce piersiowej, w którym I i II ton ma jednakowe natężenie.\n")


    }
}
