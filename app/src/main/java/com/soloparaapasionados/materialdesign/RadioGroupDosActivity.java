package com.soloparaapasionados.materialdesign;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RadioGroupDosActivity extends AppCompatActivity {
    private RadioButton radioDeposito;
    private RadioGroup grupo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_group_dos);

        radioDeposito = (RadioButton) findViewById(R.id.radio_deposito);
        grupo = (RadioGroup) findViewById(R.id.opciones_pago);

        RadioGroup contenedor = (RadioGroup) findViewById(R.id.grupo_dias);
        RadioButton opcionI2 = (RadioButton) contenedor.getChildAt(2);
        opcionI2.setChecked(true);
        contenedor.check(opcionI2.getId());

    }

    public void comprobarModoPago(View view) {
        if (radioDeposito.isChecked()){
            final String text = "Comprobar ubicación del usuario";
            Toast.makeText(this, text, Toast.LENGTH_LONG).show();
        }
    }

    public void comprobarModoPagoDos(View view) {
        if (grupo.getCheckedRadioButtonId() == R.id.radio_deposito) {
            final String text = "Comprobar ubicación del usuario";
            Toast.makeText(this, text, Toast.LENGTH_LONG).show();
        }
    }
}
