package com.example.kalkulatorsederhana;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText etNilai1,  etNilai2;
    private TextView tvHasilHitung;
    private Button btnHitung;
    private RadioButton rbTambah, rbKurang, rbKali, rbBagi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNilai1 = findViewById(R.id.etNilai1);
        etNilai2 = findViewById(R. id.etNilai2);
        tvHasilHitung = findViewById(R.id.tvHasilHitung);
        btnHitung = findViewById(R.id.btnHitung);
        rbTambah = findViewById(R.id.rbTambah);
        rbKurang = findViewById(R.id.rbKurang);
        rbKali = findViewById(R.id.rbKali);
        rbBagi = findViewById(R.id.rbBagi);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(etNilai1.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Isikan nilai!", Toast.LENGTH_SHORT).show();
                } else if(etNilai2.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Isikan nilai!", Toast.LENGTH_SHORT).show();
                } else{
                    double Nilai1 = Double.valueOf(etNilai1.getText().toString());
                    double Nilai2 = Double.valueOf(etNilai2.getText().toString());
                    double Hasil;

                    if(rbTambah.isChecked()){
                        Hasil = Nilai1+Nilai2;
                        tvHasilHitung.setText(String.valueOf(Hasil));
                    } else if(rbKurang.isChecked()){
                        Hasil = Nilai1-Nilai2;
                        tvHasilHitung.setText(String.valueOf(Hasil));
                    } else if(rbKali.isChecked()){
                        Hasil = Nilai1*Nilai2;
                        tvHasilHitung.setText(String.valueOf(Hasil));
                    } else if(rbBagi.isChecked()){
                        Hasil = Nilai1/Nilai2;
                        tvHasilHitung.setText(String.valueOf(Hasil));
                    } else{
                        Toast.makeText(MainActivity.this, "Pilih operator aritmatika!", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });



    }
}