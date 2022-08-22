package com.example.find_it
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.w3c.dom.Text

class LoginActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_activity)
        val textView = findViewById<TextView>(R.id.textView4)
        val textview1 = findViewById<TextView>(R.id.textView2)
        textView.setOnClickListener {
            Intent(this, SignUpActivity::class.java).also {
                startActivity(it)
            }
        }
        textview1.setOnClickListener {
            Intent(this, SendMail::class.java).also {
                startActivity(it)
            }
        }
    }


}