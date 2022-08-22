package com.example.find_it

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ForgotPassword : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.forgot_password_activity)
        val textView = findViewById<TextView>(R.id.textView4)
        textView.setOnClickListener {
            Intent(this, SendMail::class.java).also {
                startActivity(it)
            }
        }
    }
}