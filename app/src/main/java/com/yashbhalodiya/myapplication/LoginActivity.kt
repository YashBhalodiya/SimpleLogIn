package com.yashbhalodiya.myapplication

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    private lateinit var editEmail: EditText
    private lateinit var editPassword: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editEmail = findViewById(R.id.email_input)
        editPassword = findViewById(R.id.password_input)
    }

    fun loginLogic(view: View){
        val email = editEmail.text.toString()
        val password = editPassword.text.toString()
        Toast.makeText(this, "Email: $email \n Password: $password", Toast.LENGTH_SHORT).show()
    }

}