package com.example.anthony.chemistryapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.view.*
import java.security.Key
import java.util.*
import java.lang.Object
import kotlin.collections.HashMap

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val background = object : Thread(){
            override fun run(){
                try{
                    Thread.sleep(3000)
                    val intent = Intent(baseContext,Stoichiometry::class.java)
                    startActivity(intent)
                }catch(e:Exception){
                    e.printStackTrace()
                }
            }
        }
        background.start()

    }
}
