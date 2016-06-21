package com.example.david.demo;

import android.graphics.Color;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class Publicacion extends AppCompatActivity {

    private String nombre;
    private String materia;
    private String Calificacion;
    private String mostrar;
    private LinearLayout fondo;
    private EditText Pub;
    private ToggleButton color;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_publicacion);
        fondo = (LinearLayout) findViewById(R.id.fondo);
        Pub = (EditText) findViewById(R.id.txtPublica);
        String nomb = getIntent().getStringExtra("nombre");
        String Cal = getIntent().getStringExtra("Calificacion");
        color = (ToggleButton) findViewById(R.id.tgbColor);
        String most = getIntent().getStringExtra("Mostrar");
        nombre = nomb;


        Calificacion = Cal;

        mostrar = most;
        System.out.println(mostrar);
        // setcolor(color);
        // publicacion(nombre, materia, Calificacion, color, mostrar, Pub);

                Pub.setText("Alumno: " + nombre + " Calificacion: " +Calificacion);

        this.color.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {

                    fondo.setBackgroundColor(Color.BLUE);
                } else {
                    // The toggle is disabled
                    fondo.setBackgroundColor(Color.WHITE);
                }
            }
        });

    }





}
