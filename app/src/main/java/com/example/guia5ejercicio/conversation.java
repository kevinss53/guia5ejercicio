package com.example.guia5ejercicio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import adaptador.adaptad;
import objeto.persona;

public class conversation extends AppCompatActivity {


    ListView lista;
    List<persona> listax = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_conversation);
        lista = findViewById(R.id.listaconversacion);

        //instancia de clase persona
        persona p = new persona();

        listax.add( new persona("Kevin Ocotan", "Este es mi informacion del laboratorio de moviles OP16I04001") );
        listax.add( new persona("Katty", "Ella es la luz de mi despertar") );
        listax.add( new persona("Marcus", "El chero de la familia") );

        lista.setAdapter(new adaptad(this, R.layout.plantilla,listax));


    }
}
