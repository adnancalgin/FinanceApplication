package com.example.financeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity    {

 ImageView uzunvade;
 ImageView kısavade;
 ImageView kitaplar;
 ImageView ratio;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        uzunvade
                = (ImageView) findViewById(R.id.uzunvade);

        kısavade
                =(ImageView) findViewById(R.id.kısavade);

        kitaplar
                =(ImageView) findViewById(R.id.kitaplar);

        ratio
                =(ImageView) findViewById(R.id.analyse);




        uzunvade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                longterm();
            }
        });

        kısavade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shortterm();
            }
        });

        kitaplar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                books();
            }
        });
        ratio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                analyse();
            }
        });

    }

    public void longterm() {
        Intent intent = new Intent(this, Longterm.class);
        startActivity(intent);

    }

    public void shortterm() {
        Intent intent = new Intent(this, Shortterm.class);
        startActivity(intent);

    }
    public void books() {
        Intent intent = new Intent(this, yatirimkitaplari.class);
        startActivity(intent);

    }

    public void analyse() {
        Intent intent = new Intent(this, analyse.class);
        startActivity(intent);

    }

}