package com.example.financeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class defterdegeri extends AppCompatActivity {

    ImageView next;
    ImageView mainpage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_defterdegeri);
        next
                = (ImageView) findViewById(R.id.next);
        mainpage
                = (ImageView) findViewById(R.id.mainpage);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                next(); }
        });

        mainpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity();
            }
        });
    }

    public void next() {
        Intent intent = new Intent(this, sektorel.class);
        startActivity(intent);
    }


    public void MainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);


    }
}