package com.example.mad_practical7_21012011131

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import android.widget.VideoView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class YoutubeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_youtube)

        val wvid: WebView= findViewById(R.id.web1)
        val wvidbtn: FloatingActionButton = findViewById(R.id.webbtn)

                wvidbtn.setOnClickListener {
            wvideobtn();
        }
//https://www.youtube.com/watch?v=jfKfPfyJRdk
        val yotubeid = "jfKfPfyJRdk"

        val myWebView = findViewById<WebView>(R.id.web1)

        val webSettings = myWebView.settings

        webSettings.javaScriptEnabled = true
        myWebView.settings.loadWithOverviewMode = true
        myWebView.settings.useWideViewPort = true
        myWebView.loadUrl("https://www.youtube.com/embed/$yotubeid")




    }

    fun wvideobtn()
    {
        val intent= Intent(this,MainActivity::class.java)
        startActivity(intent)
    }
}

