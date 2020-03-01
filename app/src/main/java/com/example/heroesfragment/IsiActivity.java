package com.example.heroesfragment;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class IsiActivity extends AppCompatActivity {
    private TextView tvIsi,tvNama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isi);

        tvIsi = findViewById(R.id.itemhero_tv_deskripsi);
        String isi = getIntent().getStringExtra("isi");

        tvIsi.setText(isi);

        tvNama = findViewById(R.id.itemhero_tv_nama);
        String nama = getIntent().getStringExtra("nama");

        tvNama.setText(nama);
    }
}
