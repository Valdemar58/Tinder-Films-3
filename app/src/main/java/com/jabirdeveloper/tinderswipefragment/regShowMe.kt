package com.jabirdeveloper.tinderswipefragment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import android.widget.ToggleButton

class regShowMe : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reg_show_me)


        var ShowMeBigText: TextView = findViewById(R.id.ShowMeBigText)
        var ShowMeMaleButton: ToggleButton = findViewById(R.id.ShowMeMaleButton)
        var ShowMeFemaleButton: ToggleButton = findViewById(R.id.ShowMeFemaleButton)
        var ShowMeAllButton: ToggleButton = findViewById(R.id.ShowMeAllButton)
        var ContinueButton: Button = findViewById(R.id.ContinueButton)

        ShowMeMaleButton.setOnClickListener {
            ShowMeFemaleButton.isChecked  = false
            ShowMeAllButton.isChecked  = false
            ContinueButton.isEnabled = ShowMeMaleButton.isChecked
        }

        ShowMeFemaleButton.setOnClickListener {
            ShowMeMaleButton.isChecked  = false
            ShowMeAllButton.isChecked  = false
            ContinueButton.isEnabled = ShowMeFemaleButton.isChecked
        }

        ShowMeAllButton.setOnClickListener {
            ShowMeMaleButton.isChecked  = false
            ShowMeFemaleButton.isChecked  = false
            ContinueButton.isEnabled = ShowMeAllButton.isChecked
        }

        ContinueButton.setOnClickListener {
            val intent = Intent(this@regShowMe, regSchool::class.java)
            startActivity(intent)
        }



    }
}