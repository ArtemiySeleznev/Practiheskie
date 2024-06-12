package com.example.penkov7

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    private var counter: Int = 0
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btn = findViewById<Button>(R.id.button)
        var textView = findViewById<TextView>(R.id.textView)
        btn.setOnClickListener{
            textView.text = "Привет, дружище"
        }
        var buttonCounter = findViewById<Button>(R.id.button_counter)
        buttonCounter.setOnClickListener{
            textView.text = "Я нажал кнопку ${++counter} раз"
        }
    }
}