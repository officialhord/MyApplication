package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_Click = findViewById<Button>(R.id.add_button)

        val displayText = findViewById<TextView>(R.id.num_onScreen)

        btn_Click.setOnClickListener{
          val screenVal = displayText.text.toString()
//
            val valueFromScreen = screenVal.toInt()

        val result = add1(valueFromScreen)
//
            displayText.setText(""+result)
        }
    }

    fun add1(currentValue: Int ): Int {
        return currentValue +1
    }

}