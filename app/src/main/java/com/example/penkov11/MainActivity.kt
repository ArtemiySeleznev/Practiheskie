package com.example.penkov11

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View.OnCreateContextMenuListener
import android.widget.TextView
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

        val textView : TextView = findViewById(R.id.textView)
        when(item.itemId){
            R.id.action1 -> {
                textView.text = "Вы выбрали пункт 1"
                return true
            }
            R.id.action2 -> {
                textView.text = "Вы выбрали пункт 2"
                return true
            }
            R.id.action3 -> {
                textView.text = "Вы выбрали пункт 3"
                return true
            }
        }
        return  super.onOptionsItemSelected(item)
    }

}