package com.example.penkov9

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.random.Random

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        showRandomNumber()

    }

    private fun showRandomNumber() {
        val randon = Random.nextInt(0,900)
        var randomInt = Random.nextInt(0,randon)
        val textViewrandom: TextView = findViewById(R.id.textView_random)
        val textViewlabel: TextView = findViewById(R.id.textView_label)

        textViewrandom.text = Integer.toString(randomInt)
        textViewlabel.text  = getString(R.string.random_heading, randon)
    }

}