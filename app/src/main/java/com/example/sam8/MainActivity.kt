package com.example.sam8

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Button15: Button = findViewById(R.id.button)
        val Button20: Button = findViewById(R.id.button2)
        val Button25: Button = findViewById(R.id.button3)
        val textView: TextView = findViewById(R.id.textView)
        Button15.setOnClickListener{
            textView.setText(resources.getText(R.string.raz15))
            textView.setTextSize(15F)
        }
        Button20.setOnClickListener{
            textView.setText(resources.getText(R.string.raz20))
            textView.setTextSize(20F)
        }
        Button25.setOnClickListener{
            textView.setText(resources.getText(R.string.raz25))
            textView.setTextSize(25F)
        }
    }
}