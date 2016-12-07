package com.soloparaapasionados.materialdesign;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class RadioGroupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_group);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("RadioGroup");

    }

    public void muestraRadioGroupUno(View view) {
        Intent intent = new Intent(this,RadioGroupUnoActivity.class);
        startActivity(intent);
    }

    public void muestraRadioGroupDos(View view) {
        Intent intent = new Intent(this,RadioGroupDosActivity.class);
        startActivity(intent);
    }

    public void muestraRadioGroupTres(View view) {
        Intent intent = new Intent(this,RadioGroupTresActivity.class);
        startActivity(intent);
    }

    public void muestraRadioGroupCuatro(View view) {
        Intent intent = new Intent(this,RadioGroupCuatroActivity.class);
        startActivity(intent);
    }

    public void muestraRadioGroupCinco(View view) {
        Intent intent = new Intent(this,RadioGroupCincoActivity.class);
        startActivity(intent);
    }
}
