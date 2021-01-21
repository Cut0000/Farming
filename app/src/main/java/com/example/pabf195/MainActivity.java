package com.example.pabf195;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "ini key untuk extra di intent";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void bukaInfo(View view) {
        Intent intent = new Intent(this, BukaInfo.class);
        startActivity(intent);
    }
    public void kisahInspiratif(View view) {
        Intent intent = new Intent(this, KisahInspiratif.class);
        startActivity(intent);
    }
    public void hitungTanam(View view) {
        Intent intent = new Intent(this, HitungTanam.class);
        startActivity(intent);
    }
    public void lihatPertanyaan(View view) {
        Intent intent = new Intent(this, PertanyaanSoal.class);
        startActivity(intent);
    }
}
