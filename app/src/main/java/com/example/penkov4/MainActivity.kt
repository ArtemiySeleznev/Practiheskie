package com.example.penkov4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import  android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var textView2:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView2 = findViewById(R.id.textView2)
        var imageButton : ImageButton = findViewById(R.id.imageButton)
        var editText: EditText = findViewById(R.id.editTextText)
        imageButton.setOnClickListener{
            if(editText.text.isEmpty()){
                textView2.text = "Привет, друг!";
            }else {

                textView2.text = "Привет, " + editText.text
            }
        }
    }
}