package com.example.activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class TextPictureActivity : AppCompatActivity() {

    lateinit var pic: Picture
    lateinit var text: TextView
    lateinit var view: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text_picture)

        init()
    }

    private fun init() {
        pic = intent.getParcelableExtra("picture")!!
        text = findViewById(R.id.txtView)
        view = findViewById(R.id.image)

        text.text = pic.value
        view.setImageResource(pic.source)
        view.setOnClickListener {
            startActivity(Intent(this, ViewActivity::class.java).apply {
                putExtra("picture", pic)
            })
        }
    }
}