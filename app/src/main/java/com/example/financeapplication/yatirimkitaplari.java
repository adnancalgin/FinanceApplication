package com.example.financeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class yatirimkitaplari extends AppCompatActivity {

    ImageView next;
    ImageView mainpage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yatirimkitaplari);
        next
                = (ImageView) findViewById(R.id.next);
        mainpage
                = (ImageView) findViewById(R.id.mainpage);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                yatırımkitap(); }
        });

        mainpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity();
            }
        });
    }

    public void yatırımkitap() {
        Intent intent = new Intent(this, kitap2.class);
        startActivity(intent);
    }


    public void MainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);


    }
}