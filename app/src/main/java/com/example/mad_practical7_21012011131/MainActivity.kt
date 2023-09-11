package com.example.mad_practical7_21012011131

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.widget.VideoView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val vid:VideoView = findViewById(R.id.video)
        val vidbtn:FloatingActionButton = findViewById(R.id.videobtn)

        vidbtn.setOnClickListener {  }



    }
    fun vidbtn ()
    {

    }
    fun webtn()
    {

    }
}