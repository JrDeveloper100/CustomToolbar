package com.example.customtoolbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        val customToolbar = findViewById<CustomToolbar>(R.id.customToolbar)
        customToolbar.setDesign3()

    }
}