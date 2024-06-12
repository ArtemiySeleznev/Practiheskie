package com.example.sam12

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val twb = AnimationUtils.loadAnimation(this, R.anim.twb);
        val textview1 = findViewById(R.id.textview1) as TextView
        textview1.startAnimation(twb)

        val swb = AnimationUtils.loadAnimation(this, R.anim.swb);
        val imageView1 = findViewById(R.id.imageView1) as ImageView
        imageView1.startAnimation(swb)

        val bwn = AnimationUtils.loadAnimation(this, R.anim.bwn);
        val linearlayout1 = findViewById(R.id.linearlayout1) as LinearLayout
        linearlayout1.startAnimation(bwn)
    }
}