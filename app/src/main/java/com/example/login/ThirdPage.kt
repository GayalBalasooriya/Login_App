package com.example.login

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.thirdpage.*

class ThirdPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.thirdpage)

        button2.setOnClickListener() {
            val name: String = editText5.text.toString()
            Toast.makeText(this, "Welcome $name", Toast.LENGTH_SHORT).show()
        }
    }
}