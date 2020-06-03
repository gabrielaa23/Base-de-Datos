package com.bibliosearch.libros;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class InputDB extends AppCompatActivity {
    TextView Nombre;
    TextView Codigo;
    TextView Categoria;
    TextView Contenido;

    List<Libros> listadLibros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_d_b);
        Nombre = findViewById(R.id.Nombre);
        Codigo = findViewById(R.id.Codigo);
        Categoria = findViewById(R.id.Categoria);
        Contenido = findViewById(R.id.Contenido);

    }



}
