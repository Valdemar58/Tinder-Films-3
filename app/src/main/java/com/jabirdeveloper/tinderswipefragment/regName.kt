package com.jabirdeveloper.tinderswipefragment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class regName : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reg_name)

        var NameBigText: TextView = findViewById(R.id.NameBigText)
        var ContinueButton: Button = findViewById(R.id.ContinueButton)
        var NameInput: EditText = findViewById(R.id.NameInput)

        NameInput.addTextChangedListener(object : TextWatcher {
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

            val intent = Intent(this@regName, regBirth::class.java)
            startActivity(intent)
        }

    }
}