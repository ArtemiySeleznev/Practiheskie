package com.example.sam9

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.random.Random


class MainActivity : AppCompatActivity() {
    private lateinit var userNumberEditText: EditText
    private lateinit var checkButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        userNumberEditText = findViewById(R.id.userNumberEditText)
        checkButton = findViewById(R.id.checkButton)

        checkButton.setOnClickListener {
            val userNumber = userNumberEditText.text.toString().toInt()
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("userNumber", userNumber)
            startActivity(intent)
        }

    }

}