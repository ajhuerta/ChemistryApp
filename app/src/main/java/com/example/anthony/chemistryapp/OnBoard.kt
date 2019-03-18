package com.example.anthony.chemistryapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_on_board.*


class OnBoard : AppCompatActivity(){


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_board)



        val signUpButton = findViewById<Button>(R.id.signUp)
        val emailEnter: EditText = findViewById<EditText>(R.id.email)
        val passwordEnter: EditText = findViewById<EditText>(R.id.password)
        val SignInL: TextView = findViewById<TextView>(R.id.signIn)
        val conPass : TextView = findViewById(R.id.confirmPass)



        signUpButton.setOnClickListener{
            val email = emailEnter.text.toString().trim()
            val password = passwordEnter.text.toString()
            val confirmPassword = confirmPass.text.toString()

            if(email.isEmpty() || password.isEmpty() || !password.equals(confirmPassword)){
                showMessage("Please verify all fields")
            }/*else{
                createUserAccount(email,password)
            }*/
        }

    }

    /*private fun createUserAccount(email: String, password: String) {
        val mAuth:FirebaseAuth
        mAuth = FirebaseAuth.getInstance()

        mAuth.createUserWithEmailAndPassword(email,password)
                .addOnCompleteListener(this, OnCompleteListener<AuthResult>())
    }*/

    private fun showMessage(message:CharSequence) {

        Toast.makeText(applicationContext,message,Toast.LENGTH_LONG).show()
    }


}


