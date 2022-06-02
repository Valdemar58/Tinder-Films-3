package com.jabirdeveloper.tinderswipefragment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*


class regPhoto : AppCompatActivity() {

    private lateinit var PhotoImageView: ImageView
    private lateinit var ContinueButton: Button

    companion object {
        val IMAGE_REQUEST_CODE = 1_000;
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reg_photo)

        var PhotoBigText: TextView = findViewById(R.id.PhotoBigText)
        var PhotoButton: Button = findViewById(R.id.PhotoButton)
        PhotoImageView = findViewById(R.id.PhotoImageView)
        ContinueButton = findViewById(R.id.ContinueButton)


        PhotoButton.setOnClickListener {
            pickImageGallery()
        }

        ContinueButton.setOnClickListener {
            val intent = Intent(this@regPhoto, MainActivity::class.java)
            startActivity(intent)
        }
    }

    private fun pickImageGallery() {
        val intent = Intent(Intent.ACTION_PICK)
        intent.type = "image/*"
        startActivityForResult(intent, IMAGE_REQUEST_CODE)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == IMAGE_REQUEST_CODE && resultCode == RESULT_OK){
            PhotoImageView.setImageURI(data?.data)
            ContinueButton.isEnabled = true
        }
    }
}