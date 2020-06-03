package com.bibliosearch.libros;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText etBuscador;
    RecyclerView rvLista;
    Adaptador adaptador;

    List<Libros> listadLibros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        etBuscador = findViewById(R.id.etBuscador);
        etBuscador.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                filtrar(s.toString());
            }
        });

        rvLista = findViewById(R.id.rvLista);
        rvLista.setLayoutManager(new GridLayoutManager(this, 1));

        listadLibros = new ArrayList<>();

        listadLibros.add(0, new Libros("Ana", "12345", "ana@mail.com"));
        listadLibros.add(1, new Libros("Luis", "56789", "luis@mail.com"));
        listadLibros.add(2, new Libros("Sergio", "98765", "sergio@mail.com"));
        listadLibros.add(3, new Libros("Cesar", "54321", "cesar@mail.com"));
        listadLibros.add(4, new Libros("Laura", "82123", "laura@mail.com"));

        adaptador = new Adaptador(MainActivity.this, listadLibros);
        rvLista.setAdapter(adaptador);
    }

    public void filtrar(String texto) {
        ArrayList<Libros> filtrarLista = new ArrayList<>();

        for(Libros libro : listadLibros) {
            if(Libros.getNombre().toLowerCase().contains(texto.toLowerCase())) {
                filtrarLista.add(libro);
            }
        }

        adaptador.filtrar(filtrarLista);
    }
}
