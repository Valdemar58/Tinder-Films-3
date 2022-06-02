package com.jabirdeveloper.tinderswipefragment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import android.widget.TextView
import android.widget.Button
import android.widget.CheckBox
import android.widget.ToggleButton

class regSex : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reg_sex)

        var SexBigText: TextView = findViewById(R.id.SexBigText)
        var MaleButton: ToggleButton = findViewById(R.id.MaleButton)
        var FemaleButton: ToggleButton = findViewById(R.id.FemaleButton)
        var ContinueButton: Button = findViewById(R.id.ContinueButton)
        var SexWarning: CheckBox = findViewById(R.id.SexWarning)

        MaleButton.setOnClickListener {
            FemaleButton.isChecked  = false
            ContinueButton.isEnabled = MaleButton.isChecked
        }

        FemaleButton.setOnClickListener {
            MaleButton.isChecked = false
            ContinueButton.isEnabled = FemaleButton.isChecked
        }

        ContinueButton.setOnClickListener {
            val intent = Intent(this@regSex, regShowMe::class.java)
            startActivity(intent)
        }


    }
}