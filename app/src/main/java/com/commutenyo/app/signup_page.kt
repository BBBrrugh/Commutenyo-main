package com.commutenyo.app

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.commutenyo.app.databinding.ActivitySignupPageBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference

class signup_page  : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth
    private lateinit var binding: ActivitySignupPageBinding
    private lateinit var database: DatabaseReference

    @SuppressLint("RestrictedApi")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()

        binding = ActivitySignupPageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        auth = FirebaseAuth.getInstance()


        val button_login = findViewById<TextView>(R.id.alreadyuser)

        button_login.setOnClickListener {
            val intent = Intent(this, loginpage::class.java)
            startActivity(intent)
        }

        binding.button.setOnClickListener {
            val username = binding.inputUsername.text.toString()
            val address = binding.inputAddress.text.toString()
            val contactno = binding.inputContact.text.toString()
            val email = binding.emailadd.text.toString()
            val pass = binding.pword.text.toString()
            val confirmPass = binding.confpword.editableText.toString()

            //fetch data from the signup page
           /* database = FirebaseDatabase.getInstance().getReference("User")
            val User = User(username,address,contactno,email,pass)
            database.child(username) */



            //condition to authenticate data
            if (email.isNotEmpty() && pass.isNotEmpty() && confirmPass.isNotEmpty() && username.isNotEmpty()
                && address.isNotEmpty() && contactno.isNotEmpty() ) {

                if (pass == confirmPass) {

                    auth.createUserWithEmailAndPassword(email, pass).addOnCompleteListener {
                        if (it.isSuccessful) {
                            val intent = Intent(this, loginpage::class.java)
                            startActivity(intent)

                            Toast.makeText(this, "User creation success", Toast.LENGTH_SHORT).show()
                        } else {
                            Toast.makeText(this, it.exception.toString(), Toast.LENGTH_SHORT).show()

                        }
                    }
                } else {
                    Toast.makeText(this, "Password is not matching", Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(this, "Empty Fields Are not Allowed !!", Toast.LENGTH_SHORT).show()

            }
        }
    }


}