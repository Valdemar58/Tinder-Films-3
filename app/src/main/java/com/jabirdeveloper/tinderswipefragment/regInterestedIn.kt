package com.jabirdeveloper.tinderswipefragment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ScrollView
import android.widget.TextView

class regInterestedIn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reg_interested_in)

        var InterestedInBigText: TextView = findViewById(R.id.InterestedInBigText)
        var ContinueButton: Button = findViewById(R.id.ContinueButton)
        var InterestedInScroll: ScrollView = findViewById(R.id.InterestedInScroll)
        val genreName: String = getString(R.string.reg_interested_in_action)


        ContinueButton.setOnClickListener {
            val intent = Intent(this@regInterestedIn, regPhoto::class.java)
            startActivity(intent)
        }


    }
}