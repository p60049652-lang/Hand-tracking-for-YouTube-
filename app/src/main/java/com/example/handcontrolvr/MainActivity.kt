package com.example.handcontrolvr

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val text = TextView(this)
        text.text = "✋ Hand Control VR\n\nApp started!"
        text.textSize = 24f
        text.setPadding(30, 60, 30, 30)

        setContentView(text)
    }
}
