package com.example.mipueblo;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class Home extends AppCompatActivity {

    // ZONA DE ATRIBUTOS

    Button botonHoteles;
    Button botonRestaurantes;
    Button botonSitiosTuristicos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        botonHoteles = findViewById(R.id.botonhoteles);
        botonRestaurantes = findViewById(R.id.botonrestaurantes);
        botonSitiosTuristicos = findViewById(R.id.botonturismo);

        // escuchando los eventos de click en el boton
        botonHoteles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Abrir nueva actividad
                Intent intent = new Intent(Home.this, Hoteles.class);
                startActivity(intent);

            }
        });

        botonRestaurantes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(Home.this, Restaurantes.class);
                startActivity(intent2);
            }
        });

        botonSitiosTuristicos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(Home.this, Sitios.class);
                startActivity(intent3);
            }
        });
    }

    // cargamos el menu de opciones
    public boolean onCreateOptionsMenu(Menu menu){

     getMenuInflater().inflate(R.menu.menu, menu);
     return true;
    }

    // Funcion para cargar el funcionamento del menu
    public boolean onOptionsItemSelected(MenuItem item){
        // observar el comportamiento del ususario en el menu
        int itemSeleccionado = item.getItemId();

        switch (itemSeleccionado){
            case (R.id.opcion1):
                Toast.makeText(this, "accionaste Español", Toast.LENGTH_SHORT).show();
                break;

            case (R.id.opcion2):
                Toast.makeText(this, "Accionaste Ingles", Toast.LENGTH_SHORT).show();
                break;

            case (R.id.opcion3):
                Toast.makeText(this, "Accionaste Italiano", Toast.LENGTH_SHORT).show();
                break;

            case (R.id.opcion4):
                Toast.makeText(this, "Accionaste Acerca de", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

}