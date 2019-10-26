package com.example.login

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.secondpage.*

class SecondPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.secondpage)

        button4.setOnClickListener() {
            val intent = Intent(this, ThirdPage::class.java)
            startActivity(intent)
        }

        button3.setOnClickListener() {
            Log.i("SecondPage", "Login with Facebook")
            Toast.makeText(this, "Login with Facebook", Toast.LENGTH_SHORT).show()
        }
    }
}