package com.example.anthony.chemistryapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.*

class SplashScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        var elemTable = Hashtable<String, Double>()

        elemTable.put("H",1.008)
        elemTable.put("He",4.00)
        elemTable.put("Li",6.94)
        elemTable.put("Be",9.01)
        elemTable.put("B", 10.81)
        elemTable.put("C",12.01)
        elemTable.put("N", 14.01)
        elemTable.put("O",16.00)
        elemTable.put("F", 19.00)
        elemTable.put("Ne",20.18)
        elemTable.put("Na", 22.99)
        elemTable.put("Mg", 24.30)
        elemTable.put("Al", 26.98)
        elemTable.put("Si", 28.09)
        elemTable.put("P", 30.97)
        elemTable.put("S", 32.06)
        elemTable.put("Cl", 35.45)
        elemTable.put("Ar", 39.95)
        elemTable.put("K", 39.30)
        elemTable.put("Ca", 40.08)
        elemTable.put("Sc", 44.96)
        elemTable.put("Ti", 47.87)
        elemTable.put("V", 50.94)
        elemTable.put("Cr", 52.00)
        elemTable.put("Mn", 54.96)
        elemTable.put("Fe", 55.85)
        elemTable.put("Co", 58.93)
        elemTable.put("Ni", 58.69)
        elemTable.put("Cu", 63.55)
        elemTable.put("Zn", 65.38)
        elemTable.put("Ga", 69.72)
        elemTable.put("Ge", 72.69)
        elemTable.put("As", 74.92)
        elemTable.put("Se",78.97)
        elemTable.put("Br",79.90)
        elemTable.put("Kr", 83.80)
        elemTable.put("Rb",85.47)
        elemTable.put("Sr",87.62)
        elemTable.put("Y",88.91)
        elemTable.put("Zr",91.22)
        elemTable.put("Nb", 92.91)
        elemTable.put("Mo", 95.95)
        elemTable.put("Te", 97.0)
        elemTable.put("Ru", 101.1)
        elemTable.put("Rh", 102.91)
        elemTable.put("Pd", 106.42)
        elemTable.put("Ag", 107.87)
        elemTable.put("Cd", 112.41)
        elemTable.put("In",104.82)
        elemTable.put("Sn",118.71)
        elemTable.put("Sb",112.76)
        elemTable.put("Te", 127.60)
        elemTable.put("I",126.90)
        elemTable.put("Xe",131.29)
        elemTable.put("Cs", 132.91)
        elemTable.put("Ba",137.33)
        elemTable.put("La", 138.91)
        elemTable.put("Hf", 178.49)
        elemTable.put("Ta", 180.95)
        elemTable.put("W", 183.84)
        elemTable.put("Re", 186.21)
        elemTable.put("Os",190.2)
        elemTable.put("Ir", 192.2)
        elemTable.put("Pt", 195.08)
        elemTable.put("Au", 196.97)
        elemTable.put("Hg", 200.59)
        elemTable.put("Tl", 204.38)
        elemTable.put("Pb", 207.2)
        elemTable.put("Bi", 208.98)
        elemTable.put("Po", 209.0)
        elemTable.put("At", 210.0)
        elemTable.put("Rn",222.0)
        elemTable.put("Fr",223.0)
        elemTable.put("Ra", 226.0)
        elemTable.put("Ac", 227.0)
        elemTable.put("Rf", 267.0)
        elemTable.put("Db", 270.0)
        elemTable.put("Sg", 271.0)
        elemTable.put("Bh",270.0)
        elemTable.put("Hs",277.0)
        elemTable.put("Mt", 276.0)
        elemTable.put("Ds", 281.0)
        elemTable.put("Rg", 282.0)
        elemTable.put("Cn", 285.0)
        elemTable.put("Uut", 285.0)
        elemTable.put("Fl", 289.0)
        elemTable.put("Uup", 288.0)
        elemTable.put("Lv", 293.0)
        elemTable.put("Uus", 294.0)
        elemTable.put("Uuo",294.0)
        elemTable.put("Ce", 140.12)
        elemTable.put("Pr", 140.91)
        elemTable.put("Nd", 144.24)
        elemTable.put("Pm", 145.0)
        elemTable.put("Sm", 150.4)
        elemTable.put("Eu", 151.97)
        elemTable.put("Gd", 157.25)
        elemTable.put("Tb", 158.93)
        elemTable.put("Dy", 162.5)
        elemTable.put("Ho", 164.93)
        elemTable.put("Er", 167.26)
        elemTable.put("Tm",168.93)
        elemTable.put("Yb", 173.05)
        elemTable.put("Lu", 174.97)
        elemTable.put("Th", 232.04)
        elemTable.put("Pa", 231.04)
        elemTable.put("U", 238.03)
        elemTable.put("Np", 237.0)
        elemTable.put("Pu", 244.0)
        elemTable.put("Am", 243.0)
        elemTable.put("Cm", 247.0)
        elemTable.put("Bk", 247.0)
        elemTable.put("Cf", 251.0)
        elemTable.put("Es", 252.0)
        elemTable.put("Fm", 257.0)
        elemTable.put("Md", 258.0)
        elemTable.put("No", 259.0)
        elemTable.put("Lr", 262.0)






        val calculateButton = findViewById<Button>(R.id.button2)
        val nameInput = findViewById<TextView>(R.id.nameInput)
        val gramInput = findViewById<TextView>(R.id.gramsInput)
        val mol = findViewById<TextView>(R.id.Mol)
        val equalibrium = findViewById<Button>(R.id.button3)

        calculateButton.setOnClickListener {
            try {
                val inputName = nameInput.text.toString()
                val amu = elemTable[inputName]!!.toDouble()
                val inputGrams = gramInput.text.toString()
                val test = inputGrams.toDouble()
                mol.text = (test/amu).toString() + " mol"
            }
            catch (e: Exception)
            {
                mol.text = "error"
            }

        }

        equalibrium.setOnClickListener{
            val intent = Intent(baseContext, Stoichiometry::class.java)
            startActivity(intent)
        }

    }



}
