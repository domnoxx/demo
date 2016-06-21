package com.example.david.demo;

import android.content.Intent;
import android.graphics.Color;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.ToggleButton;

import static java.lang.System.*;

public class MainActivity extends AppCompatActivity {

    private EditText txtNombre;
    private EditText txtMateria;
    private AutoCompleteTextView atxtMateria;
    private RatingBar calificacion;
    private ToggleButton color;
    private CheckBox ckbMostrar;
    private Button btnEnviar;
    private LinearLayout fondo;
    private EditText txtComentario;
    private String sim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        txtNombre = (EditText) findViewById(R.id.txtNombre);
        atxtMateria= (AutoCompleteTextView) findViewById(R.id.atxtMateria);
         calificacion = (RatingBar) findViewById(R.id.ratingBar);
        ckbMostrar=(CheckBox) findViewById(R.id.ckbRating);
        fondo=(LinearLayout)findViewById(R.id.Pantalla);
        //color=(ToggleButton)findViewById(R.id.tgbColor);
        //setColor(color);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, MATERIAS);


        //atxtMateria = (AutoCompleteTextView) findViewById(R.id.atxtMateria);
        atxtMateria.setThreshold(3);
        atxtMateria.setAdapter(adapter);
    }




        //});
    //}
    private static final String[] MATERIAS = new String[] {
            "Seguridades de software", "Administrador de contenido", "Aplicaciones Moviles"
    };


    public void mostrar(View v){
        if(ckbMostrar.isChecked())
        {
            sim="si";
            System.out.println("si");
        }else{
            sim="no";
            System.out.println("no");
        }

    }
    public void publicar(View v) {
        Intent demo = new Intent(this, Publicacion.class);
        demo.putExtra("nombre", txtNombre.getText().toString());
        //out.print(atxtMateria.toString());
       // demo.putExtra("Materia",String.valueOf(atxtMateria.getText().toString()));
        demo.putExtra("Calificacion",String.valueOf(calificacion.getRating()));

        if(ckbMostrar.isChecked())
        {
            sim="si";
            demo.putExtra("Mostrar", sim);
        }else{
            sim="no";
            demo.putExtra("Mostrar", sim);
        }


       // demo.putExtra("mostrar", ckbMostrar.getText().toString());

        startActivity(demo);

    }




}
