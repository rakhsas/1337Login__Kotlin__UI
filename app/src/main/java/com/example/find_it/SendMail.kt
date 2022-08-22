package com.example.find_it

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SendMail : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.enter_mail__activity)
        val textView = findViewById<TextView>(R.id.textView4)
        textView.setOnClickListener {
            Intent(this, LoginActivity::class.java).also {
                startActivity(it)
            }
        }
        val Button = findViewById<Button>(R.id.button)
        Button.setOnClickListener {
            Intent(this, ForgotPassword::class.java).also {
                startActivity(it)
            }
        }
    }
}