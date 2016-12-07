package com.soloparaapasionados.materialdesign;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class RadioGroupCincoActivity extends AppCompatActivity {
    private ControladorSQLite sqLiteOpenHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_group_cinco);

        RadioGroup opcionesMarca = (RadioGroup) findViewById(R.id.rg_respuestas);

        sqLiteOpenHelper = new ControladorSQLite(this);

        Cursor c = sqLiteOpenHelper.getRespuestas();

        while (c.moveToNext()) {
            String respuesta = c.getString(c.getColumnIndex(Contrato.ColumnasRespuesta.RESPUESTA));
            opcionesMarca.addView(crearRadioButton(respuesta));
        }
    }

    private RadioButton crearRadioButton(String respuesta) {
        RadioButton nuevoRadio = new RadioButton(this);
        LinearLayout.LayoutParams params = new RadioGroup.LayoutParams(
                RadioGroup.LayoutParams.WRAP_CONTENT,
                RadioGroup.LayoutParams.WRAP_CONTENT);
        nuevoRadio.setLayoutParams(params);
        nuevoRadio.setText(respuesta);
        nuevoRadio.setTag(respuesta);
        return nuevoRadio;
    }
}
