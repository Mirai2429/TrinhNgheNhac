package com.example.trinhnghenhac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Button ChonNhac, Play, Pause;
    MediaPlayer music, music2, music3, music4, music5, music6;
    TextView SoBai, TenBaiHat, ThoiLuong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ChonNhac = findViewById(R.id.btnChonNhac);
        Play = findViewById(R.id.btnPlay);
        Pause = findViewById(R.id.btnPause);
        SoBai = findViewById(R.id.SoBai);
        TenBaiHat = findViewById(R.id.tenbaihat);
        ThoiLuong = findViewById(R.id.thoiluong);

        music = MediaPlayer.create(this, R.raw.nhac);
        music2 = MediaPlayer.create(this, R.raw.nhac2);
        music3 = MediaPlayer.create(this, R.raw.nhac3);
        music4 = MediaPlayer.create(this, R.raw.nhac4);
        music5 = MediaPlayer.create(this, R.raw.nhac5);
        music6 = MediaPlayer.create(this, R.raw.nhac6);

        ChonNhac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chonnhac();
            }
        });

        Play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playsong();
            }
        });

        Pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pausesong();
            }
        });

    }

    public void playsong() {
        music.start();
    }

    public void pausesong() {
        music.pause();
    }

    public void chonnhac(){
        Intent intent = new Intent(MainActivity.this, ChonNhac.class);
        startActivity(intent);
    }

}