package com.willy.kataloglaptop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton btnDell,btnAsus,btnLenovo;
    public static final String SERIES_GALERI_KEY = "SERIES_GALERI";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inisialisasiView();

    }

    private void inisialisasiView() {
        btnDell = findViewById(R.id.btn_buka_type_dell);
        btnAsus = findViewById(R.id.btn_buka_type_asus);
        btnLenovo= findViewById(R.id.btn_buka_type_lenovo);
        btnDell.setOnClickListener(view -> bukaGaleri("Dell"));
        btnAsus.setOnClickListener(view -> bukaGaleri("Asus"));
        btnLenovo.setOnClickListener(view -> bukaGaleri("Lenovo"));
    }

    private void bukaGaleri(String merkLaptop) {
        Log.d("MAIN","Buka activity Acer");
        Intent intent = new Intent(this,GaleriAktivity.class);
        intent.putExtra(SERIES_GALERI_KEY, merkLaptop);
        startActivity(intent);
    }
}