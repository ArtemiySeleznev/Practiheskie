package com.example.sam9

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.random.Random

class MainActivity2 : AppCompatActivity() {
    private lateinit var userGuessEditText: EditText
    private lateinit var guessButton: Button
    private var randomNumber: Int = 0
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        userGuessEditText = findViewById(R.id.userGuessEditText)
        guessButton = findViewById(R.id.guessButton)

        randomNumber = (1..10).random()

        guessButton.setOnClickListener {
            val userGuess = userGuessEditText.text.toString().toInt()
            if (userGuess == randomNumber) {
                Toast.makeText(this, "Вы угадали!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Попробуйте еще раз.", Toast.LENGTH_SHORT).show()
            }
        }
    }

}
