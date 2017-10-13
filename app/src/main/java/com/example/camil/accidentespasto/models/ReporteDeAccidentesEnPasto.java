package com.example.camil.accidentespasto.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by camil on 11/10/2017.
 */

public class ReporteDeAccidentesEnPasto {



    @SerializedName("accidente_con_gravedad_da_os")
    @Expose
    private String accidenteConGravedadDaOs;
    @SerializedName("accidente_con_gravedad_heridos")
    @Expose
    private String accidenteConGravedadHeridos;
    @SerializedName("accidente_con_gravedad_occisos")
    @Expose
    private String accidenteConGravedadOccisos;
    @SerializedName("case_de_vehiculo_camioneta")
    @Expose
    private String caseDeVehiculoCamioneta;
    @SerializedName("clase_de_accidente_atropello")
    @Expose
    private String claseDeAccidenteAtropello;
    @SerializedName("clase_de_accidente_choque")
    @Expose
    private String claseDeAccidenteChoque;
    @SerializedName("clase_de_vehiculo_automovil")
    @Expose
    private String claseDeVehiculoAutomovil;
    @SerializedName("clase_de_vehiculo_bus")
    @Expose
    private String claseDeVehiculoBus;
    @SerializedName("clase_de_vehiculo_buseta")
    @Expose
    private String claseDeVehiculoBuseta;
    @SerializedName("clase_de_vehiculo_camion")
    @Expose
    private String claseDeVehiculoCamion;
    @SerializedName("clase_de_vehiculo_campero")
    @Expose
    private String claseDeVehiculoCampero;
    @SerializedName("clase_de_vehiculo_motocicleta")
    @Expose
    private String claseDeVehiculoMotocicleta;
    @SerializedName("comuna1_mas_accidentadas")
    @Expose
    private String comuna1MasAccidentadas;
    @SerializedName("comuna2_mas_accidentadas")
    @Expose
    private String comuna2MasAccidentadas;
    @SerializedName("comuna4_mas_accidentadas")
    @Expose
    private String comuna4MasAccidentadas;
    @SerializedName("comuna5_mas_accidentadas")
    @Expose
    private String comuna5MasAccidentadas;
    @SerializedName("comuna7_mas_accidentadas")
    @Expose
    private String comuna7MasAccidentadas;
    @SerializedName("comuna8_mas_accidentadas")
    @Expose
    private String comuna8MasAccidentadas;
    @SerializedName("comuna9_mas_accidentadas")
    @Expose
    private String comuna9MasAccidentadas;
    @SerializedName("condicion_victima_acompa_ante")
    @Expose
    private String condicionVictimaAcompaAnte;
    @SerializedName("condicion_victima_pasajero")
    @Expose
    private String condicionVictimaPasajero;
    @SerializedName("condicion_victima_peaton")
    @Expose
    private String condicionVictimaPeaton;
    @SerializedName("hora_mayor_accidentalidad_06_00_9_00")
    @Expose
    private String horaMayorAccidentalidad0600900;
    @SerializedName("hora_mayor_accidentalidad_12_00_15_00")
    @Expose
    private String horaMayorAccidentalidad12001500;
    @SerializedName("hora_mayor_accidentalidad_15_00_18_00")
    @Expose
    private String horaMayorAccidentalidad15001800;
    @SerializedName("hora_mayor_accidentalidad_18_00_21_00")
    @Expose
    private String horaMayorAccidentalidad18002100;
    @SerializedName("hora_mayor_accidentalidad_9_00_12_00")
    @Expose
    private String horaMayorAccidentalidad9001200;
    @SerializedName("mes")
    @Expose
    private String mes;
    @SerializedName("zona")
    @Expose
    private String zona;

    public String getAccidenteConGravedadDaOs() {
        return accidenteConGravedadDaOs;
    }

    public void setAccidenteConGravedadDaOs(String accidenteConGravedadDaOs) {
        this.accidenteConGravedadDaOs = accidenteConGravedadDaOs;
    }

    public String getAccidenteConGravedadHeridos() {
        return accidenteConGravedadHeridos;
    }

    public void setAccidenteConGravedadHeridos(String accidenteConGravedadHeridos) {
        this.accidenteConGravedadHeridos = accidenteConGravedadHeridos;
    }

    public String getAccidenteConGravedadOccisos() {
        return accidenteConGravedadOccisos;
    }

    public void setAccidenteConGravedadOccisos(String accidenteConGravedadOccisos) {
        this.accidenteConGravedadOccisos = accidenteConGravedadOccisos;
    }

    public String getCaseDeVehiculoCamioneta() {
        return caseDeVehiculoCamioneta;
    }

    public void setCaseDeVehiculoCamioneta(String caseDeVehiculoCamioneta) {
        this.caseDeVehiculoCamioneta = caseDeVehiculoCamioneta;
    }

    public String getClaseDeAccidenteAtropello() {
        return claseDeAccidenteAtropello;
    }

    public void setClaseDeAccidenteAtropello(String claseDeAccidenteAtropello) {
        this.claseDeAccidenteAtropello = claseDeAccidenteAtropello;
    }

    public String getClaseDeAccidenteChoque() {
        return claseDeAccidenteChoque;
    }

    public void setClaseDeAccidenteChoque(String claseDeAccidenteChoque) {
        this.claseDeAccidenteChoque = claseDeAccidenteChoque;
    }

    public String getClaseDeVehiculoAutomovil() {
        return claseDeVehiculoAutomovil;
    }

    public void setClaseDeVehiculoAutomovil(String claseDeVehiculoAutomovil) {
        this.claseDeVehiculoAutomovil = claseDeVehiculoAutomovil;
    }

    public String getClaseDeVehiculoBus() {
        return claseDeVehiculoBus;
    }

    public void setClaseDeVehiculoBus(String claseDeVehiculoBus) {
        this.claseDeVehiculoBus = claseDeVehiculoBus;
    }

    public String getClaseDeVehiculoBuseta() {
        return claseDeVehiculoBuseta;
    }

    public void setClaseDeVehiculoBuseta(String claseDeVehiculoBuseta) {
        this.claseDeVehiculoBuseta = claseDeVehiculoBuseta;
    }

    public String getClaseDeVehiculoCamion() {
        return claseDeVehiculoCamion;
    }

    public void setClaseDeVehiculoCamion(String claseDeVehiculoCamion) {
        this.claseDeVehiculoCamion = claseDeVehiculoCamion;
    }

    public String getClaseDeVehiculoCampero() {
        return claseDeVehiculoCampero;
    }

    public void setClaseDeVehiculoCampero(String claseDeVehiculoCampero) {
        this.claseDeVehiculoCampero = claseDeVehiculoCampero;
    }

    public String getClaseDeVehiculoMotocicleta() {
        return claseDeVehiculoMotocicleta;
    }

    public void setClaseDeVehiculoMotocicleta(String claseDeVehiculoMotocicleta) {
        this.claseDeVehiculoMotocicleta = claseDeVehiculoMotocicleta;
    }

    public String getComuna1MasAccidentadas() {
        return comuna1MasAccidentadas;
    }

    public void setComuna1MasAccidentadas(String comuna1MasAccidentadas) {
        this.comuna1MasAccidentadas = comuna1MasAccidentadas;
    }

    public String getComuna2MasAccidentadas() {
        return comuna2MasAccidentadas;
    }

    public void setComuna2MasAccidentadas(String comuna2MasAccidentadas) {
        this.comuna2MasAccidentadas = comuna2MasAccidentadas;
    }

    public String getComuna4MasAccidentadas() {
        return comuna4MasAccidentadas;
    }

    public void setComuna4MasAccidentadas(String comuna4MasAccidentadas) {
        this.comuna4MasAccidentadas = comuna4MasAccidentadas;
    }

    public String getComuna5MasAccidentadas() {
        return comuna5MasAccidentadas;
    }

    public void setComuna5MasAccidentadas(String comuna5MasAccidentadas) {
        this.comuna5MasAccidentadas = comuna5MasAccidentadas;
    }

    public String getComuna7MasAccidentadas() {
        return comuna7MasAccidentadas;
    }

    public void setComuna7MasAccidentadas(String comuna7MasAccidentadas) {
        this.comuna7MasAccidentadas = comuna7MasAccidentadas;
    }

    public String getComuna8MasAccidentadas() {
        return comuna8MasAccidentadas;
    }

    public void setComuna8MasAccidentadas(String comuna8MasAccidentadas) {
        this.comuna8MasAccidentadas = comuna8MasAccidentadas;
    }

    public String getComuna9MasAccidentadas() {
        return comuna9MasAccidentadas;
    }

    public void setComuna9MasAccidentadas(String comuna9MasAccidentadas) {
        this.comuna9MasAccidentadas = comuna9MasAccidentadas;
    }

    public String getCondicionVictimaAcompaAnte() {
        return condicionVictimaAcompaAnte;
    }

    public void setCondicionVictimaAcompaAnte(String condicionVictimaAcompaAnte) {
        this.condicionVictimaAcompaAnte = condicionVictimaAcompaAnte;
    }

    public String getCondicionVictimaPasajero() {
        return condicionVictimaPasajero;
    }

    public void setCondicionVictimaPasajero(String condicionVictimaPasajero) {
        this.condicionVictimaPasajero = condicionVictimaPasajero;
    }

    public String getCondicionVictimaPeaton() {
        return condicionVictimaPeaton;
    }

    public void setCondicionVictimaPeaton(String condicionVictimaPeaton) {
        this.condicionVictimaPeaton = condicionVictimaPeaton;
    }

    public String getHoraMayorAccidentalidad0600900() {
        return horaMayorAccidentalidad0600900;
    }

    public void setHoraMayorAccidentalidad0600900(String horaMayorAccidentalidad0600900) {
        this.horaMayorAccidentalidad0600900 = horaMayorAccidentalidad0600900;
    }

    public String getHoraMayorAccidentalidad12001500() {
        return horaMayorAccidentalidad12001500;
    }

    public void setHoraMayorAccidentalidad12001500(String horaMayorAccidentalidad12001500) {
        this.horaMayorAccidentalidad12001500 = horaMayorAccidentalidad12001500;
    }

    public String getHoraMayorAccidentalidad15001800() {
        return horaMayorAccidentalidad15001800;
    }

    public void setHoraMayorAccidentalidad15001800(String horaMayorAccidentalidad15001800) {
        this.horaMayorAccidentalidad15001800 = horaMayorAccidentalidad15001800;
    }

    public String getHoraMayorAccidentalidad18002100() {
        return horaMayorAccidentalidad18002100;
    }

    public void setHoraMayorAccidentalidad18002100(String horaMayorAccidentalidad18002100) {
        this.horaMayorAccidentalidad18002100 = horaMayorAccidentalidad18002100;
    }

    public String getHoraMayorAccidentalidad9001200() {
        return horaMayorAccidentalidad9001200;
    }

    public void setHoraMayorAccidentalidad9001200(String horaMayorAccidentalidad9001200) {
        this.horaMayorAccidentalidad9001200 = horaMayorAccidentalidad9001200;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

}

