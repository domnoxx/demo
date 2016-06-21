package com.example.david.demo;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.Toast;

public class Publicacion extends AppCompatActivity {

    private String nombre;
    private String materia;
    private String comentario;
    private String Calificacion;
    private String color;
    private String mostrar;
    private LinearLayout fondo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_publicacion);
        fondo=(LinearLayout) findViewById(R.id.fondo);

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
        setcolor(color);
        publicacion(nombre,materia,Calificacion,color,mostrar);

    }

    private void publicacion(String nombre, String materia, String calificacion, String color, String mostrar) {
        Toast.makeText(Publicacion.this, nombre.toString(),
                Toast.LENGTH_SHORT).show();
    }

    private void setcolor(String color) {
        if(color=="n")
        {
            fondo.setBackgroundColor(Color.BLUE);

        }else{
            fondo.setBackgroundColor(Color.BLACK);

        }
    }
}
