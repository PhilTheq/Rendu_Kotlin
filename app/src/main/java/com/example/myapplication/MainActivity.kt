package com.example.myapplication

import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import java.net.URL



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Créer un lien avec le boutton
        val btn_click_me = findViewById(R.id.button) as Button
        val textView = findViewById(R.id.textView3) as TextView
        var timesclick = ""



            // apl d'api via requête
        btn_click_me.setOnClickListener{
            //getJsonFromURL("https://api.chucknorris.io/jokes/random")
            timesclick = "blabla";
            textView.text = timesclick.toString();
            Toast.makeText(this@MainActivity,"click slp", Toast.LENGTH_SHORT).show()
        }
    }


    //fun getJsonFromURL(wantedURL: String) : String {
    //    return URL(wantedURL).readText()
    //}
}