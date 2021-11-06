package com.example.trinhnghenhac;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChonNhac extends AppCompatActivity {
    private Button Bai1, Bai2, Bai3, Bai4, Bai5, Bai6;
    private Button Chon;
    MediaPlayer music, music2, music3, music4, music5, music6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chon_nhac);
        Bai1 = findViewById(R.id.Bai1);
        Bai2 = findViewById(R.id.Bai2);
        Bai3 = findViewById(R.id.Bai3);
        Bai4 = findViewById(R.id.Bai4);
        Bai5 = findViewById(R.id.Bai5);
        Bai6 = findViewById(R.id.Bai6);

        music = MediaPlayer.create(this, R.raw.nhac);
        music2 = MediaPlayer.create(this, R.raw.nhac2);
        music3 = MediaPlayer.create(this, R.raw.nhac3);
        music4 = MediaPlayer.create(this, R.raw.nhac4);
        music5 = MediaPlayer.create(this, R.raw.nhac5);
        music6 = MediaPlayer.create(this, R.raw.nhac6);

        Chon = findViewById(R.id.Chon);
        Chon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ChonNhac.this, MainActivity.class);
                startActivity(intent);
            }
        });

        Bai1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ChonNhac.this, MainActivity.class);
                startActivity(intent);
                music.start();
            }
        });

        Bai2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ChonNhac.this, MainActivity.class);
                startActivity(intent);
                music2.start();
            }
        });

        Bai3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ChonNhac.this, MainActivity.class);
                startActivity(intent);
                music3.start();
            }
        });

        Bai4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ChonNhac.this, MainActivity.class);
                startActivity(intent);
                music4.start();
            }
        });

        Bai5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ChonNhac.this, MainActivity.class);
                startActivity(intent);
                music5.start();
            }
        });

        Bai6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ChonNhac.this, MainActivity.class);
                startActivity(intent);
                music6.start();
            }
        });
    }
}