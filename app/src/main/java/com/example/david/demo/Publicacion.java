package com.example.david.demo;

import android.graphics.Color;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class Publicacion extends AppCompatActivity {

    private String nombre;
    private String materia;
    private String comentario;
    private String Calificacion;
    private String color;
    private String mostrar;
    private LinearLayout fondo;
    private TextView Pub;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_publicacion);
        fondo = (LinearLayout) findViewById(R.id.fondo);
        Pub = (TextView) findViewById(R.id.txtPublica);
        String nomb = getIntent().getStringExtra("nombre");
        String mat = getIntent().getStringExtra("Materia");
        String coment = getIntent().getStringExtra("Comentario");
        String Cal = getIntent().getStringExtra("Calificacion");
        String col = getIntent().getStringExtra("Color");
        String most = getIntent().getStringExtra("mostrar");
        nombre = nomb;
        materia = mat;
        comentario = coment;
        Calificacion = Cal;
        color = col;
        mostrar = most;
        setcolor(color);
        publicacion(nombre, materia, Calificacion, color, mostrar, Pub);


    }

    public void publicacion(String nombre, String materia, String calificacion, String color, String mostrar, TextView pub) {
        System.out.print(color);
        Pub.setText("Alumno: " + nombre + " de la materia" +   " obtuvo " + calificacion+" de calificacion");


    }

    public void setcolor(String color) {
        if (color == "A") {
            fondo.setBackgroundColor(Color.BLUE);

        } else {
            fondo.setBackgroundColor(Color.WHITE);

        }
    }


}
