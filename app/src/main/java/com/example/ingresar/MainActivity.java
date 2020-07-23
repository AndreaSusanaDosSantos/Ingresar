package com.example.ingresar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button Ingresar;
    private EditText Nombre;
    private EditText Contrasenia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Ingresar = (Button) findViewById(R.id.buttonIngresar);
        Ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Nombre= (EditText)  findViewById(R.id.editTextNombre);
                 Contrasenia= (EditText) findViewById(R.id.editTextPassword);

                   if (Nombre.equals("ites") && Contrasenia.equals(1234)) {

                        Toast.makeText(getApplicationContext(), "Acceso válido", Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(getApplicationContext(), "Acceso no permitido", Toast.LENGTH_LONG).show();
                    }
                }

        });

    }
}
