package com.example.penkov13

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Build
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.PopupMenu
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

        val imageView: ImageView = findViewById(R.id.imageView)
        val textView: TextView = findViewById(R.id.textView)
        val button: Button = findViewById(R.id.button)
        // Меню для фото
        val popupMenu = androidx.appcompat.widget.PopupMenu( this, imageView)
        popupMenu.inflate(R.menu.popupmenu)
        popupMenu.setOnMenuItemClickListener {
            when (it.itemId) {
                R.id.menu1 -> {
                    textView.text = "Нажат пункт РорuрMenu 1"
                    true
                }
                R.id.menu2 -> {
                    textView.text = "Hажат пункт РорupMenu 2"
                    true
                }
                R.id.menu3 -> {
                    textView.text = "Hажат пункт РорupMenu 3"
                    true
                }
                else -> false
            }
        }
        imageView.setOnClickListener {
            popupMenu.show()
        }
        // Меню для кнопки
        val popupMenu2 = PopupMenu( this, button)
        popupMenu2.inflate(R.menu.popupmenu2)
        popupMenu2.setOnMenuItemClickListener {
            when (it.itemId) {
                R.id.red -> {
                    textView.background = ColorDrawable(Color.RED)
                    textView.text = "Вы выбрали красный цвет"
                }

                R.id.yellow -> {
                    textView.background = ColorDrawable(Color.YELLOW)
                    textView.text = "Вы выбрали желтый цвет"
                }

                R.id.green -> {
                    textView.background = ColorDrawable(Color.GREEN)
                    textView.text = "Вы выбрали зеленый цвет"
                }
            }
            false
        }
        if (Build.VERSION.SDK_INT >=Build.VERSION_CODES.Q) {
            popupMenu2.setForceShowIcon(true)
        }

        button.setOnClickListener {
            popupMenu2.show()
        }
        // Меню для текст
        val popupMenu3 = PopupMenu( this, textView)
        popupMenu3.inflate(R.menu.popupmenu3)
        popupMenu3.setOnMenuItemClickListener {
            when (it.itemId) {
                R.id.action1 -> {
                    textView.setTextSize(15F)
                    textView.text = "Текст сделан размером в 15"
                    true
                }
                R.id.action2 -> {
                    textView.setTextSize(20F)
                    textView.text = "Текст сделан размером в 20"
                    true
                }
                R.id.action3 -> {
                    textView.setTextSize(25F)
                    textView.text = "Текст сделан размером в 20"
                    true
                }
                else -> false
            }
        }
        textView.setOnClickListener {
            popupMenu3.show()
        }
    }
}