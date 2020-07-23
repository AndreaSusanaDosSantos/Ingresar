package com.example.ingresar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import java.util.Scanner;

public class SegundaPantalla extends AppCompatActivity {
    private Button Convertir;
    private Button Reiniciar;
    private EditText Monto;
    private EditText Resultado;
    private RadioButton Dolar;
    private RadioButton Euro;
    private RadioButton Real;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_pantalla);
        Monto= (EditText)findViewById(R.id.editTextInMonto);
        Resultado= (EditText) findViewById(R.id.editTextResultado);
        Dolar= (RadioButton) findViewById(R.id.radioButtonDolar);
        Euro= (RadioButton) findViewById(R.id.radioButtonEuro);
        Real= (RadioButton) findViewById(R.id.radioButtonReal);
        Convertir= (Button) findViewById(R.id.buttonConvertir);
        Reiniciar=(Button) findViewById(R.id.buttonReiniciar);
        Reiniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        Convertir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Scanner scanner = new Scanner(System.in);
                int resultado;

                if (Monto == null)
                {
                    Toast.makeText(getApplicationContext(),"Debe ingresar un monto", Toast.LENGTH_LONG).show();
                }
                else{

                    if (Dolar.isChecked()){
                        float multiplicar;

                        float equivalenciaDolar= 7021/100;


                    }
                    if(Euro.isChecked()){
                        float equivalenciaEuro= 13/1000;


                    }
                    if (Real.isChecked()){
                        float equivalenciaReal= 78/1000;

                    }

                }


            }
        });

    }
}
