package com.example.gabriel.ejemploprueba;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void procesar(View vista){
        int contProcesamientos = 0;
        int contCheckBox = 0;
        int contMismoContenido = 0;
        int CaracTextoMasLargo = 0;

        EditText txtUno = (EditText)findViewById(R.id.txtUno);
        EditText txtDos = (EditText)findViewById(R.id.txtDos);
        CheckBox check = (CheckBox)findViewById(R.id.checkbox);

        String textoUno =  txtUno.getText().toString();
        int largoTextoUno = txtUno.getText().length();

        String textoDos = txtDos.getText().toString();
        int largoTextoDos = txtDos.getText().length();

        if (txtUno.getText().length() == 0 || txtDos.getText().length() == 0){
            Toast.makeText(this, "No pueden haber campos vacios",Toast.LENGTH_SHORT).show();
        }
        else if (textoUno.compareTo("Fin")== 0 || textoDos.compareTo("Fin") == 0){
            Bundle bundle = new Bundle();
            bundle.putInt("contProcesamientos", contProcesamientos);
            bundle.putInt("contCheckbox", contCheckBox);
            bundle.putInt("contMismoContenido", contMismoContenido);
            bundle.putInt("caracTextoMasLargo", CaracTextoMasLargo);
            Intent miIntent = new Intent(this, MostrarResultados.class);
            miIntent.putExtras(bundle);
            startActivity(miIntent);
        }
        else{
           contProcesamientos++;
            if (check.isChecked()){
                contCheckBox++;
            }
            if (textoUno.compareTo(textoDos) == 0){
                contMismoContenido++;
            }
            if (largoTextoUno > CaracTextoMasLargo || largoTextoDos > CaracTextoMasLargo){
                if (largoTextoUno >= largoTextoDos){
                    CaracTextoMasLargo = largoTextoUno;
                }
                else{
                    CaracTextoMasLargo = largoTextoDos;
                }
            }
        }


    }
}
