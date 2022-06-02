package com.jabirdeveloper.tinderswipefragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.EditText
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.content.Intent


class regPhone: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reg_phone)

        var PhoneNumberBigText: TextView = findViewById(R.id.PhoneNumberBigText)
        var ContinueButton: Button = findViewById(R.id.ContinueButton)
        var PhoneNumberInput: EditText = findViewById(R.id.PhoneNumberInput)

        PhoneNumberInput.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable) {}
            override fun beforeTextChanged(s: CharSequence, start: Int,
                                           count: Int, after: Int) {
            }
            override fun onTextChanged(s: CharSequence, start: Int,
                                       before: Int, count: Int) {
                ContinueButton.isEnabled = s.length == 12
            }
        })

        ContinueButton.setOnClickListener {
            val intent = Intent(this@regPhone, regName::class.java)
            startActivity(intent)
        }

    }


}