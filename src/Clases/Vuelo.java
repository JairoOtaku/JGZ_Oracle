package Clases;

import java.util.ArrayList;

// @author Jairo_Otaku
public class Vuelo {

    private String identificador;
    private String aeropuerto_orgien;
    private String aeropuerto_destino;
    private String tipo_vuelo;
    private String fecha_vuelo;
    private ArrayList<Tripulacion> tripulacion;
    private ArrayList<Pasaje> pasaje;

    public Vuelo() {
    }

    public Vuelo(String identificador, String aeropuerto_orgien, String aeropuerto_destino, String tipo_vuelo, String fecha_vuelo, ArrayList<Tripulacion> tripulacion, ArrayList<Pasaje> pasaje) {
        this.identificador = identificador;
        this.aeropuerto_orgien = aeropuerto_orgien;
        this.aeropuerto_destino = aeropuerto_destino;
        this.tipo_vuelo = tipo_vuelo;
        this.fecha_vuelo = fecha_vuelo;
        this.tripulacion = tripulacion;
        this.pasaje = pasaje;
    }

    public String getIdentificador() {
        return identificador;
    }

    public String getAeropuerto_orgien() {
        return aeropuerto_orgien;
    }

    public String getAeropuerto_destino() {
        return aeropuerto_destino;
    }

    public String getTipo_vuelo() {
        return tipo_vuelo;
    }

    public String getFecha_vuelo() {
        return fecha_vuelo;
    }

    public ArrayList<Tripulacion> getTripulacion() {
        return tripulacion;
    }

    public ArrayList<Pasaje> getPasaje() {
        return pasaje;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public void setAeropuerto_orgien(String aeropuerto_orgien) {
        this.aeropuerto_orgien = aeropuerto_orgien;
    }

    public void setAeropuerto_destino(String aeropuerto_destino) {
        this.aeropuerto_destino = aeropuerto_destino;
    }

    public void setTipo_vuelo(String tipo_vuelo) {
        this.tipo_vuelo = tipo_vuelo;
    }

    public void setFecha_vuelo(String fecha_vuelo) {
        this.fecha_vuelo = fecha_vuelo;
    }

    public void setTripulacion(ArrayList<Tripulacion> tripulacion) {
        this.tripulacion = tripulacion;
    }

    public void setPasaje(ArrayList<Pasaje> pasaje) {
        this.pasaje = pasaje;
    }

}
