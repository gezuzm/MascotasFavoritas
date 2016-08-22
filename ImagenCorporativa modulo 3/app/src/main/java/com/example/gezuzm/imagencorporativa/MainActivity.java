package com.example.gezuzm.imagencorporativa;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Mascota> arrayMascotas;
    private RecyclerView listaMascotas;     // para usarse como recurso local
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //asignar la referencia del recurso al recurso local
        listaMascotas = (RecyclerView) findViewById(R.id.rvMascotas);
        // declara un linearloyout para un mejor acomodo del RecyclerView
        LinearLayoutManager llMascotas = new LinearLayoutManager(this);
        llMascotas.setOrientation(LinearLayout.VERTICAL); // requisito
        listaMascotas.setLayoutManager(llMascotas); // asignarlo al RecyclerView

        // de la clase mascotas
        InicializarListaMascotas();
        // iniciar el adaptador, es necesario para poder usar el RecyclerView
        inicializarAdaptador();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }


    private void InicializarListaMascotas() {
        // es nercesario tener una clase
        arrayMascotas = new ArrayList<Mascota>();

        arrayMascotas.add(new Mascota(R.drawable.el_escarador, "Escalador"));
        arrayMascotas.add(new Mascota(R.drawable.cochino_jabato, "Jabato"));
        arrayMascotas.add(new Mascota(R.drawable.feanor, "Feanor"));
        arrayMascotas.add(new Mascota(R.drawable.golden_dragoone, "Drago"));
        arrayMascotas.add(new Mascota(R.drawable.kuaku_, "Kuaku"));
        arrayMascotas.add(new Mascota(R.drawable.nomoon, "Nonito"));
        arrayMascotas.add(new Mascota(R.drawable.pekefux, "Pekefux"));
        arrayMascotas.add(new Mascota(R.drawable.tortuga, "Tortu"));
        arrayMascotas.add(new Mascota(R.drawable.miaumiua_atigrado, "Miaumiau"));
    }


    private void inicializarAdaptador() {
        MascotaAdaptador adaptador = new MascotaAdaptador(arrayMascotas, this);
        listaMascotas.setAdapter(adaptador);

    }

    // ir a la segunda actividad
    private void IrMascotasPreferidas() {
        Intent intent = new Intent(this, MascotasPreferidas.class);

        startActivity(intent);

    }


    // este metodo creara el menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_action_view, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

       if (item.getItemId() == R.id.mIrMascotasPreferidas)
        {
            Intent intent = new Intent(this,MascotasPreferidas.class );

            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }

    /*
    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.example.gezuzm.imagencorporativa/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.example.gezuzm.imagencorporativa/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    } */
}
