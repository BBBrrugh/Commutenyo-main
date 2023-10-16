package com.commutenyo.app

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.commutenyo.app.databinding.ActivityLoginpageBinding
import com.google.firebase.auth.FirebaseAuth






class loginpage : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth
    private lateinit var binding: ActivityLoginpageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportActionBar?.hide()

        auth = FirebaseAuth.getInstance()
        binding = ActivityLoginpageBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val button_signup = findViewById<TextView>(R.id.signuphere)

        button_signup.setOnClickListener {
            val intent = Intent(this, signup_page::class.java)
            startActivity(intent)

        }

        binding.buttonlogin.setOnClickListener {




            val email = binding.loginuser.editableText.toString()
            val pass = binding.loginpass.editableText.toString()

            if (email.isNotEmpty() && pass.isNotEmpty()) {
                auth.signInWithEmailAndPassword(email, pass)
                    .addOnCompleteListener(this) {
                        if (it.isSuccessful){

                              //  val intent = Intent(this, LandingBottom::class.java)
                               // startActivity(intent)


                            } else {
                            Toast.makeText(
                                this,
                                "User or Password is incorrect",
                                Toast.LENGTH_SHORT
                            ).show()


                        }
                    }
            }
        }


    }


}








