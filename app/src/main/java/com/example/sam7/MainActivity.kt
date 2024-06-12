package com.example.sam7

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var counter: Int = 0
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var textView = findViewById<TextView>(R.id.textView2)

        var image  = findViewById<ImageView>(R.id.imageView2)
        image.setOnClickListener{
            textView.text = "Я нажал кнопку ${++counter} раз"
        }
    }
}