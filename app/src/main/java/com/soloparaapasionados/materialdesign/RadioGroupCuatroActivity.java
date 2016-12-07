package com.soloparaapasionados.materialdesign;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class RadioGroupCuatroActivity extends AppCompatActivity {
    private static String[] MARCAS = {
            "Mazda", "Mercedes Benz", "Audi", "Chevrolet"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_group_cuatro);

        RadioGroup opcionesMarca = (RadioGroup)findViewById(R.id.rg_opciones_marca);

        for(String marca : MARCAS) {
            RadioButton nuevoRadio = crearRadioButton(marca);
            opcionesMarca.addView(nuevoRadio);
        }

        RadioButton primerRadio = (RadioButton) opcionesMarca.getChildAt(0);
        primerRadio.setChecked(true);
    }

    private RadioButton crearRadioButton(String marca) {
        RadioButton nuevoRadio = new RadioButton(this);
        LinearLayout.LayoutParams params = new RadioGroup.LayoutParams(
                RadioGroup.LayoutParams.WRAP_CONTENT,
                RadioGroup.LayoutParams.WRAP_CONTENT);
        nuevoRadio.setLayoutParams(params);
        nuevoRadio.setText(marca);
        nuevoRadio.setTag(marca);
        return nuevoRadio;
    }
}
