package com.jabirdeveloper.tinderswipefragment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class regSchool : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reg_school)

        var SchoolBigText: TextView = findViewById(R.id.SchoolBigText)
        var ContinueButton: Button = findViewById(R.id.ContinueButton)
        var SchoolInput: EditText = findViewById(R.id.SchoolInput)

        SchoolInput.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable) {}
            override fun beforeTextChanged(s: CharSequence, start: Int,
                                           count: Int, after: Int) {
            }
            override fun onTextChanged(s: CharSequence, start: Int,
                                       before: Int, count: Int) {
                ContinueButton.isEnabled = s.isNotEmpty()
            }
        })

        ContinueButton.setOnClickListener {
            val intent = Intent(this@regSchool, regInterestedIn::class.java)
            startActivity(intent)
        }


    }
}