package com.example.myapplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.ballz).setOnClickListener{
            findViewById<Button>(R.id.ballz).text = "ballz"
        }

        findViewById<Button>(R.id.button2).setOnClickListener {
            findViewById<Button>(R.id.button2).setBackgroundColor(Color.BLACK)
        }
    }
}