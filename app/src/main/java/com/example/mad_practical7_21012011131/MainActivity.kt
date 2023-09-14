package com.example.mad_practical7_21012011131

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val vid: VideoView = findViewById(R.id.video)
        val vidbtn: FloatingActionButton = findViewById(R.id.videobtn)
        vidbtn.setOnClickListener {
            videobtn();
            videow()
        }
    }
    fun videow()
    {
        val videoView: VideoView = findViewById(R.id.video)
        val mediaController = MediaController(this)
        val uri:Uri = Uri.parse("android.resource://"+ packageName + "/"+ R.raw.thestoryoflight)
        mediaController.setAnchorView(videoView)
        videoView.setMediaController(mediaController);
        videoView.setVideoURI(uri);
        videoView.requestFocus();
        videoView.start();

    }
    fun videobtn()
    {
        val intent= Intent(this,YoutubeActivity::class.java)
        startActivity(intent)
    }
}
