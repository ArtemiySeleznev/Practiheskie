package com.example.sam11

import android.graphics.Color
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean{

        val inflater = menuInflater
        inflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)

    }

    override fun onOptionsItemSelected(item: MenuItem):Boolean{

        when(item.itemId){
            android.R.id.home -> finish()
            R.id.action1 -> {
                val blue: Int = getColor(R.color.blue)

                Toast.makeText(this, "Поздравляю, это функция №1",Toast.LENGTH_SHORT).show()
            }
            R.id.action2 -> {
                Toast.makeText(this, "Поздравляю, это функция №2",Toast.LENGTH_SHORT).show()
            }
            R.id.action3 -> {
                Toast.makeText(this, "Поздравляю, это функция №3",Toast.LENGTH_SHORT).show()
            }
        }
        return true
    }
}