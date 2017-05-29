package com.example.gabriel.ejemploprueba;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.EditText;
import android.widget.TextView;

public class MostrarResultados extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mostrar_resultados);

        TextView lblCantProcesamientos = (TextView)findViewById(R.id.lblCantProcesamientos);
        TextView lblCantMismoContenido = (TextView)findViewById(R.id.lblCantMismoContenido);
        TextView lblCantCheckbox = (TextView)findViewById(R.id.lblCantCheckbox);
        TextView lblCaracTextoMasLargo = (TextView)findViewById(R.id.lblCaracTextoMasLargo);

        int CantProcesamientos = getIntent().getExtras().getInt("contProcesamientos");
        int CantMismoContenido = getIntent().getExtras().getInt("contMismoContenido");
        int CantCheckbox = getIntent().getExtras().getInt("contCheckbox");
        int CaracTextoMasLargo = getIntent().getExtras().getInt("caracTextomasLargo");

        lblCantProcesamientos.setText(CantProcesamientos);
        lblCantMismoContenido.setText(CantMismoContenido);
        lblCantCheckbox.setText(CantCheckbox);
        lblCaracTextoMasLargo.setText(CaracTextoMasLargo);

    }
}
