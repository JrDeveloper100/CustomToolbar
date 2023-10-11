package com.example.customtoolbar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val customToolbar = findViewById<Button>(R.id.customToolbar)
        val customToolbar2 = findViewById<Button>(R.id.customToolbar2)
        val customToolbar3 = findViewById<Button>(R.id.customToolbar3)
        val customToolbar4 = findViewById<Button>(R.id.customToolbar4)
        customToolbar.setOnClickListener {
            val intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }
        customToolbar2.setOnClickListener {
            val intent = Intent(this,MainActivity3::class.java)
            startActivity(intent)
        }
        customToolbar3.setOnClickListener {
            val intent = Intent(this,MainActivity4::class.java)
            startActivity(intent)
        }
        customToolbar4.setOnClickListener {
            val intent = Intent(this,MainActivity5::class.java)
            startActivity(intent)
        }
    }
}