package com.example.pabf195;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class PertanyaanSoal extends AppCompatActivity {
    private EditText soalPertama;
    private EditText soalKedua;
    public static final String EXTRA_MESSAGE = "ini key untuk extra di intent";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal);
        soalPertama = findViewById(R.id.Jawaban1);
        soalKedua = findViewById(R.id.jawaban2);
    }

    public void lihatJawaban(View view) {
//        String message = soalPertama.getText().toString();
//        Intent intent = new Intent(this, JawabanSoal.class);
//        intent.putExtra(EXTRA_MESSAGE, message);
//        startActivity(intent);

        Intent intent = new Intent(PertanyaanSoal.this, JawabanSoal.class);
        intent.putExtra("data1", soalPertama.getText().toString());
        intent.putExtra("data2", soalKedua.getText().toString());
        startActivity(intent);



    }
}