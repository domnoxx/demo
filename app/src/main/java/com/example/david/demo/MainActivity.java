package com.example.david.demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private EditText txtNombre;
    private EditText txtMateria;
    private AutoCompleteTextView atxtComentario;
    private RatingBar calificacion;
    private ToggleButton color;
    private CheckBox ckbMostrar;
    private Button btnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtNombre = (EditText) findViewById(R.id.txtNombre);
        txtMateria= (EditText)findViewById(R.id.txtMateria);
        atxtComentario= (AutoCompleteTextView) findViewById(R.id.aTxtComentario);
        calificacion = (RatingBar) findViewById(R.id.ratingBar);
        ckbMostrar=(CheckBox) findViewById(R.id.ckbRating);
        color=(ToggleButton)findViewById(R.id.tgbColor);
    }


    public void publicar(View v) {
        Intent demo = new Intent(this, Publicacion.class);
        demo.putExtra("nombre", txtNombre.getText().toString());
        demo.putExtra("Materia", txtMateria.getText().toString());
        demo.putExtra("Comentario", atxtComentario.getText().toString());
        demo.putExtra("Calificacion",String.valueOf(calificacion.getRating()));
        demo.putExtra("Color",color.getText());
        demo.putExtra("mostrar", ckbMostrar.getText().toString());
        startActivity(demo);

    }



}
