package com.example.camil.accidentespasto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.camil.accidentespasto.datosApi.DatosAbiertosColombia;
import com.example.camil.accidentespasto.models.ReporteDeAccidentesEnPasto;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by camilo  on 11/10/17. jj
 */

public class MainActivity extends AppCompatActivity {



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menuopciones, menu);
        return true;
    }
    public void acercade(View view) {
        Intent i = new Intent(this, acercaDe.class );
        startActivity(i);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id==R.id.salir) {

            finish();

        }
        if (id==R.id.acerca) {


            Intent i = new Intent(this, acercaDe.class );
            startActivity(i);


        }

        return super.onOptionsItemSelected(item);
    }



    private RecyclerView recyclerView;
    private int offset;
    private boolean aptoParaCargar;
    private ListAccident listaAutosAdapter;

    // crear el objeto retrofit**************

    private Retrofit retrofit;
    public static final String TAG="Datos abiertos Colombia";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        listaAutosAdapter = new ListAccident(this);
        recyclerView.setAdapter(listaAutosAdapter);



/*
Cuando se obtiene la instancia del recycler se usa el método setHasFixedSize()
 para optimizar las operaciones con los ítems. Con esta característica le
 estamos diciendo al recycler que el adaptador no variará su tamaño en toda
  la ejecución del programa.
 */
        recyclerView.setHasFixedSize(true);
        final GridLayoutManager layoutManager = new GridLayoutManager(this, 1);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                if (dy > 0) {
                    int visibleItemCount = layoutManager.getChildCount();
                    int totalItemCount = layoutManager.getItemCount();
                    int pastVisibleItems = layoutManager.findFirstVisibleItemPosition();

                    if (aptoParaCargar) {
                        if ((visibleItemCount + pastVisibleItems) >= totalItemCount) {
                            Log.i(TAG, " Fin.");

                            aptoParaCargar = false;
                            offset += 20;
                            obtenerDatosReportesVehiculos();
                        }
                    }
                }
            }
        });




        retrofit = new Retrofit.Builder()
                .baseUrl("https://www.datos.gov.co/resource/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        aptoParaCargar = true;
        offset = 0;

        obtenerDatosReportesVehiculos();

    }



    private void obtenerDatosReportesVehiculos() {
        DatosAbiertosColombia service = retrofit.create(DatosAbiertosColombia.class);
        Call<ArrayList<ReporteDeAccidentesEnPasto>> reporteRespuestaCall = service.obtenerListaReportes();

        reporteRespuestaCall.enqueue(new Callback<ArrayList<ReporteDeAccidentesEnPasto>>() {
            @Override
            public void onResponse(Call<ArrayList<ReporteDeAccidentesEnPasto>> call, Response<ArrayList<ReporteDeAccidentesEnPasto>> response) {
                if(response.isSuccessful()){
                    ArrayList listado = response.body();
                    listaAutosAdapter.agregarAuto(listado);
                }
                else
                {
                    Log.e(TAG, "onResponse: "+response.errorBody());
                }
            }

            @Override
            public void onFailure(Call<ArrayList<ReporteDeAccidentesEnPasto>> call, Throwable t) {
                Log.e(TAG," onFailure: "+t.getMessage());
            }
        });
    }

}
