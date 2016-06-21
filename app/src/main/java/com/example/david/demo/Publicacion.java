package com.example.david.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Publicacion extends AppCompatActivity {

    private String nombre;
    private String materia;
    private String comentario;
    private String Calificacion;
    private String color;
    private String mostrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_publicacion);


        String nomb = getIntent().getStringExtra("nombre");
        String mat = getIntent().getStringExtra("Materia");
        String coment = getIntent().getStringExtra("Comentario");
        String Cal = getIntent().getStringExtra("Calificacion");
        String col = getIntent().getStringExtra("Color");
        String most = getIntent().getStringExtra("mostrar");
        nombre=nomb;
        materia=mat;
        comentario=coment;
        Calificacion=Cal;
        color=col;
        mostrar=most;


    }
}
