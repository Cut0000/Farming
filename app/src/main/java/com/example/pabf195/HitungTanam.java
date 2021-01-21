package com.example.pabf195;
import android.os.Bundle;
import android.view.View;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class HitungTanam extends AppCompatActivity implements View.OnClickListener {
    private EditText edtBil1;
    private EditText edtBil2;
    private Button btnDivision;
    private TextView tvResult;
    private String bil1;
    private String bil2;
    private Button btnClear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung);


            edtBil1 = findViewById(R.id.edt_bil1);
            edtBil2 = findViewById(R.id.edt_bil2);
            btnDivision = findViewById(R.id.btn_division);
            btnClear = findViewById(R.id.btn_clear);
            tvResult = findViewById(R.id.tv_result);
            btnDivision.setOnClickListener(this);
            btnClear.setOnClickListener(this);
        }

        private boolean validation() {
            bil1 = edtBil1.getText().toString().trim();
            bil2 = edtBil2.getText().toString().trim();
            boolean isEmptyField = false;
            if (TextUtils.isEmpty(bil1)) {
                isEmptyField = true;
                edtBil1.setError("bilangan pertama tidak boleh kosong");
            }
            if (TextUtils.isEmpty(bil2)) {
                isEmptyField = true;
                edtBil2.setError("bilangan kedua tidak boleh kosong");
            }
            return isEmptyField;
        }

        private void clearField() {
            edtBil1.setText("");
            edtBil2.setText("");
            edtBil1.requestFocus();
            tvResult.setText(R.string.result);
        }

        private void division() {
            double bilangan1 = Double.parseDouble(bil1);
            double bilangan2 = Double.parseDouble(bil2);
            double hasil = bilangan1 / bilangan2;
            tvResult.setText(String.valueOf(hasil));
        }


        @Override
        public void onClick(View v) {
            boolean isEmptyField = validation();
            switch (v.getId()) {
                case R.id.btn_division:
                    if (!isEmptyField) {
                        division();
                    }
                    break;
                case R.id.btn_clear:
                    clearField();
                    break;

            }
        }
    }
