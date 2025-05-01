package com.example.zadanie

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var counter = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.counterText)
        val button = findViewById<Button>(R.id.counterButton)

        textView.text = counter.toString()

        button.setOnClickListener {
            counter++
            if (counter > 5) counter = 1
            textView.text = counter.toString()
        }
    }
}
