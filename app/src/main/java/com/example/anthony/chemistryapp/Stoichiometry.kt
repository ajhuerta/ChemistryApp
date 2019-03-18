package com.example.anthony.chemistryapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Stoichiometry : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stoichiometry)

        val move:Button = findViewById(R.id.calc)

        move.setOnClickListener {
            val intent = Intent(baseContext, SplashScreen::class.java)
            startActivity(intent)
        }
    }
}
