package com.example.camil.accidentespasto.datosApi;

import com.example.camil.accidentespasto.models.ReporteDeAccidentesEnPasto;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by camil on 11/10/2017.
 */

public interface DatosAbiertosColombia {

    @GET("wmew-indw.json")
    Call<ArrayList<ReporteDeAccidentesEnPasto>> obtenerListaReportes();
}
