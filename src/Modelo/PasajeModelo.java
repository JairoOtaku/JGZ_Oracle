package Modelo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Clases.Pasaje;
import Clases.Pasajero;

// @author Jairo_Otaku
public class PasajeModelo {

    Conexion db;
    Pasajero pasajero;
    String PLSQL = "";

    public PasajeModelo(Conexion db) {
        this.db = db;
    }
    //String codPasaje, int numAsiento, String clase, float pvp, Pasajero pasajero

    public void insertPasaje(Pasaje pasaje) {
        Connection conn = db.getConexion();
        try {

            PLSQL = "{call INSERT_PASAJE(" + pasaje.getCodPasaje() + ",'" + pasaje.getNumAsiento()
                    + "','" + pasaje.getClase() + "','" + pasaje.getPvp() + "'," + pasajero + ")}";

            CallableStatement storedProc = conn.prepareCall(PLSQL);
            storedProc.execute();
            storedProc.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updatePasaje(Pasaje pasaje) {

        Connection conn = db.getConexion();

        try {
            PLSQL = "{call UPDATE_PASAJE (" + pasaje.getCodPasaje() + ",'" + pasaje.getNumAsiento()
                    + "','" + pasaje.getClase() + "','" + pasaje.getPvp() + "'," + pasajero + ")}";
            System.out.print(PLSQL);
            CallableStatement storedProc = conn.prepareCall(PLSQL);
            storedProc.execute();
            storedProc.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deletePasaje(int codPasaje) {

        Connection conn = db.getConexion();
        try {
            PLSQL = "{call DELETE_PASAJE (" + codPasaje + ")}";
            System.out.print(PLSQL);
            CallableStatement storedProc = conn.prepareCall(PLSQL);
            storedProc.execute();
            storedProc.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
