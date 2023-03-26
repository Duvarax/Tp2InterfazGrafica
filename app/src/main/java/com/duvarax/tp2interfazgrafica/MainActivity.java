package com.duvarax.tp2interfazgrafica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.duvarax.tp2interfazgrafica.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Inmueble> lista = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cargarDatos();
        generarListView();
    }
    public void cargarDatos(){
        lista.add(new Inmueble(R.drawable.casa1, "San Luis", 8900.0));
        lista.add(new Inmueble(R.drawable.casa2, "Mendoza", 2900.0));
        lista.add(new Inmueble(R.drawable.casa3, "Cordoba", 7500.0));
    }

    public void generarListView(){

        ArrayAdapter<Inmueble> adapter = new ListaAdapter(this, R.layout.item, lista, getLayoutInflater());
        ListView lv = findViewById(R.id.lvLista);
        lv.setAdapter(adapter);
    }
}