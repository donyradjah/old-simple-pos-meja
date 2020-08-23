package com.codetalenta.meja;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.codetalenta.meja.helper.Session;

public class HomeActivity extends AppCompatActivity {

    TextView nomorMeja;
    Session session;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        nomorMeja = findViewById(R.id.nomorMeja);
        session = new Session(this);

        nomorMeja.setText(session.getString("nomorMeja"));
    }

    public void openDaftarMenu(View view) {
        Intent daftarMenu = new Intent(getApplicationContext(), DaftarMenuActivity.class);
        startActivity(daftarMenu);
    }

    public void openDaftarTransksi(View view) {
        Intent daftarTransksi = new Intent(getApplicationContext(), DaftarTransaksiActivity.class);
        startActivity(daftarTransksi);
    }
}