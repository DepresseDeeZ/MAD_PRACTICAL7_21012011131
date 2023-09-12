package com.example.mad_practical7_21012011131

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.Environment
import android.widget.MediaController
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val videoView: VideoView = findViewById(R.id.video)

        //creating media controller
        val mediaController = MediaController(this)
        val uri:Uri = Uri.parse("android.resource://"+ packageName + "/"+ R.raw.thestoryoflight)

//        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)
        //Environment.getExternalStorageDirectory().path + "/media/1.mp4"
//        val uri = Uri.parse(Environment.getExternalStorageDirectory().path + R.raw.thestoryoflight);
        videoView.setMediaController(mediaController);
        videoView.setVideoURI(uri);
        videoView.requestFocus();
        videoView.start();




        val vid: VideoView = findViewById(R.id.video)
        val vidbtn: FloatingActionButton = findViewById(R.id.videobtn)

        vidbtn.setOnClickListener {
            videobtn();
        }






        }







    fun videobtn()
    {
        val intent= Intent(this,YoutubeActivity::class.java)
        startActivity(intent)
    }
    fun webbtn()
    {

    }



}




//    private  fun initVideoPlayer()
//    {
//        val mediaController = MediaController(this)
//        val uri: Uri.p
//    }