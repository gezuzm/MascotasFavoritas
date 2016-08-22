package com.example.gezuzm.imagencorporativa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MascotasPreferidas extends AppCompatActivity {

    ArrayList<Mascota> arrayMascotas;
    private RecyclerView listaMascotas;     // para usarse como recurso local


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mascotas_preferidas);

        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

        //asignar la referencia del recurso al recurso local
        listaMascotas = (RecyclerView)findViewById(R.id.rvMascotas);
        // declara un linearloyout para un mejor acomodo del RecyclerView
        LinearLayoutManager llMascotas = new LinearLayoutManager(this);
        llMascotas.setOrientation(LinearLayout.VERTICAL); // requisito
        listaMascotas.setLayoutManager(llMascotas); // asignarlo al RecyclerView

        // de la clase mascotas
        InicializarListaMascotas();
        // iniciar el adaptador, es necesario para poder usar el RecyclerView
        inicializarAdaptador();

    }

    private void InicializarListaMascotas()
    {
        // es nercesario tener una clase
        arrayMascotas = new ArrayList<Mascota>();

        arrayMascotas.add(new Mascota( R.drawable.kuaku_,"Kuaku"));
        arrayMascotas.add(new Mascota( R.drawable.nomoon,"Nonito"));
        arrayMascotas.add(new Mascota( R.drawable.pekefux,"Pekefux"));
        arrayMascotas.add(new Mascota( R.drawable.tortuga,"Tortu"));
        arrayMascotas.add(new Mascota( R.drawable.miaumiua_atigrado,"Miaumiau"));
    }


    private void inicializarAdaptador()
    {
        MascotaAdaptador adaptador = new MascotaAdaptador(arrayMascotas,this);
        listaMascotas.setAdapter(adaptador);

    }
}
