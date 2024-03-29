package com.codetalenta.meja;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class KonfirmasiPembelianActivity extends AppCompatActivity {

    int totalItem = 0;
    int totalHarga = 0;
    String namaPemesan = "";

    ImageView btnMenu;
    TextView txtMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konfirmasi_pembelian);

        btnMenu = findViewById(R.id.btnMenu);
        txtMenu = findViewById(R.id.txtMenu);

        btnMenu.setImageResource(R.drawable.ic_arrow_back);
        txtMenu.setText("Pesanan Berhasil");

        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}