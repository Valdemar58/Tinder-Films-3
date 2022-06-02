package com.jabirdeveloper.tinderswipefragment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.DatePicker
import android.widget.EditText
import android.widget.TextView

class regBirth : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reg_birth)

        var BirthBigText: TextView = findViewById(R.id.BirthBigText)
        var ContinueButton: Button = findViewById(R.id.ContinueButton)
        var BirthInput: DatePicker = findViewById(R.id.BirthInput)

        ContinueButton.setOnClickListener {
            val intent = Intent(this@regBirth, regSex::class.java)
            startActivity(intent)
        }


    }
}