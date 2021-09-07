package com.example.activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    var index = 0
    lateinit var lsit: Array<Picture>
    lateinit var view: ImageView
    lateinit var btninfo: Button
    lateinit var btnback: Button
    lateinit var btnnext: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        views()
    }

    private fun views() {
        lsit = Picture.array

        view = findViewById(R.id.view)
        btnback = findViewById(R.id.back)
        btnnext = findViewById(R.id.next)
        btninfo = findViewById(R.id.btnGetInfo)

        btnnext.setOnClickListener {
            if ( index == (lsit.size-1) )
                index = 0
            else
                index++
            view.setImageResource(lsit.get(index).source)
        }
        btnback.setOnClickListener {
            if ( index == 0 )
                index = lsit.size-1
            else
                index--
            view.setImageResource(lsit.get(index).source)
        }

        btninfo.setOnClickListener {
            var inttent = Intent(this, TextPictureActivity::class.java).apply {
                putExtra("picture", lsit.get(index))
            }
            startActivity(inttent)
        }
    }
}