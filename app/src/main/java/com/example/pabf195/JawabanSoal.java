package com.example.pabf195;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class JawabanSoal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jawaban);

        TextView pertamaa = findViewById(R.id.pertama);
        TextView keduaa = findViewById(R.id.kedua);

//        Intent intent = getIntent();
//        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
//        pertamaa.setText("1. "+message);

        pertamaa.setText("1. "+getIntent().getStringExtra("data1"));
        keduaa.setText("2. "+getIntent().getStringExtra("data2"));



    }
}