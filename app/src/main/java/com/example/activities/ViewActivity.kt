package com.example.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class ViewActivity : AppCompatActivity() {

    lateinit var picture: Picture
    lateinit var imageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view)

        init()
    }

    private fun init() {
        picture = intent.getParcelableExtra("picture")!!
        imageView = findViewById(R.id.view)

        imageView.setImageResource(picture.source)
    }
}