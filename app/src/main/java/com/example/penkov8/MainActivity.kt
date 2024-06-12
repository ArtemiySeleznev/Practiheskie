package com.example.penkov8

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rButton: Button = findViewById(R.id.red_button)
        val gButton: Button = findViewById(R.id.green_button)
        val yButton: Button = findViewById(R.id.yellow_button)

        val textView: TextView = findViewById(R.id.textView)
        val rLayot: ConstraintLayout = findViewById(R.id.root_layout)

        rButton.setOnClickListener{
            textView.setText(resources.getText(R.string.blue))
            rLayot.setBackgroundColor(resources.getColor(R.color.blueColor, null))
        }
        gButton.setOnClickListener{
            textView.setText(resources.getText(R.string.purple))
            rLayot.setBackgroundColor(resources.getColor(R.color.purpuleColor, null))
        }
        yButton.setOnClickListener{
            textView.setText(resources.getText(R.string.orange))
            rLayot.setBackgroundColor(resources.getColor(R.color.orangeColor, null))
        }
    }
}