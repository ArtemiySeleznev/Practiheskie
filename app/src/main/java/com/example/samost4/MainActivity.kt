package com.example.samost4

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageView: ImageView = findViewById(R.id.imageView)
        val textView: TextView = findViewById(R.id.textView)
        val textView2: TextView = findViewById(R.id.textView2)
        val button: Button = findViewById(R.id.button)



        button.setOnClickListener{
            if ( textView.text.isEmpty()){
                textView2.hint = "Какое у вас настроение? "
            }else{
                textView2.hint = "Какое у вас настроение? " + textView.text
            }

            var mood = textView2.text.toString()
            when (mood) {
                "happy" -> imageView.setImageResource(R.drawable.joy)
                "sad" -> imageView.setImageResource(R.drawable.sad)
                "normal" -> imageView.setImageResource(R.drawable.ok)
            }
        }
    }
}