package com.app.radiobutton

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.RadioButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    
    lateinit var LinearLayout: LinearLayout
    lateinit var green: RadioButton
    lateinit var yellow: RadioButton
    lateinit var red: RadioButton
    lateinit var colorChange: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        LinearLayout = findViewById(R.id.LinearLayout)
        green = findViewById(R.id.greenButton)
        yellow = findViewById(R.id.yellowButton)
        red = findViewById(R.id.redButton)
        colorChange = findViewById(R.id.colorChangeButton)

        colorChange.setOnClickListener {
            if (green.isChecked) {
                LinearLayout.setBackgroundColor(Color.GREEN)
            } else if (yellow.isChecked) {
                LinearLayout.setBackgroundColor(Color.YELLOW)
            }else if (red.isChecked) {
                LinearLayout.setBackgroundColor(Color.RED)
            }
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.LinearLayout)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}