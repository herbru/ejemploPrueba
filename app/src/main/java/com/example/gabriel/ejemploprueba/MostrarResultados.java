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

        Bundle datosRecibidos = this.getIntent().getExtras();
        int CantProcesamientos = datosRecibidos.getInt("contProcesamientos");
        int CantMismoContenido = datosRecibidos.getInt("contMismoContenido");
        int CantCheckbox = datosRecibidos.getInt("contCheckbox");
        int CaracTextoMasLargo = datosRecibidos.getInt("caracTextoMasLargo");

        lblCantProcesamientos.setText(Integer.toString(CantProcesamientos));
        lblCantMismoContenido.setText(Integer.toString(CantMismoContenido));
        lblCantCheckbox.setText(Integer.toString(CantCheckbox));
        lblCaracTextoMasLargo.setText(Integer.toString(CaracTextoMasLargo));

    }
}
