package com.example.redes.mypetsclues;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class Inicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
    }

    public void onSigButtonClick(View view) {
        Intent intent = new Intent(this, MainMenu.class);
        startActivity(intent);
}
}
