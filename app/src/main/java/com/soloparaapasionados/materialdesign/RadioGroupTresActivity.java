package com.soloparaapasionados.materialdesign;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class RadioGroupTresActivity extends AppCompatActivity {
    private View contenedorParticular;
    private View contenedorCorporativo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_group_tres);

        contenedorParticular = findViewById(R.id.ll_contenedor_particular);
        contenedorCorporativo = findViewById(R.id.ll_contenedor_corporativo);

        RadioGroup opcionesCliente = (RadioGroup)findViewById(R.id.rg_tipo_cliente);
        opcionesCliente.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.rb_particular:
                        mostrarParticular(true);
                        break;
                    case R.id.rb_corporativo:
                        mostrarParticular(false);
                        break;
                }
            }
        });
    }

    public void onRadioButtonClicked(View view) {
        boolean marcado = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.rb_corporativo:
                if (marcado) {
                    mostrarParticular(false);
                }
                break;

            case R.id.rb_particular:
                if (marcado) {
                    mostrarParticular(true);
                }
                break;
        }
    }

    private void mostrarParticular(boolean b) {
        contenedorParticular.setVisibility(b ? View.VISIBLE : View.GONE);
        contenedorCorporativo.setVisibility(b ? View.GONE : View.VISIBLE);
    }
}
