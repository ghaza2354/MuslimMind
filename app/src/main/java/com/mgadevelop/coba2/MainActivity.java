package com.mgadevelop.coba2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.VideoView;

import com.mgadevelop.coba2.ui.WelcomeActivity;
import com.mgadevelop.coba2.ui.login.LoginActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int waktu_loading = 7000;
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent1=new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent1);
                finish();
            }
        }, waktu_loading);

        VideoView videoView = findViewById(R.id.intro);
        final ProgressBar loadingAnim = findViewById(R.id.anim_loading);


        String uriPath = "android.resource://com.mgadevelop.coba2/"+R.raw.intro;
        Uri uri = Uri.parse(uriPath);
        videoView.setVideoURI(uri);
        videoView.requestFocus();
        videoView.start();

       videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
           @Override
           public void onCompletion(MediaPlayer mediaPlayer) {
               loadingAnim.setVisibility(View.VISIBLE);
           }
       });
    }
}
