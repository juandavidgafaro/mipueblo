package com.example.mipueblo;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {


    // Se va setear los atributos o variables
    MediaPlayer cancion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cancion = MediaPlayer.create(this, R.raw.audiio1);
        cancion.start();

        // temporizar la cancion:
        TimerTask inicioApp = new TimerTask() {
            @Override
            public void run() {

                //Intent intent = new Intent(MainActivity.this, Home.class);
                Intent intent = new Intent(MainActivity.this,Home.class);
                startActivity(intent);
            }
        };

        Timer tiempo = new Timer();
        tiempo.schedule(inicioApp, 15000);

    }
}