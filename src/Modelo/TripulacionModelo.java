package Modelo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Clases.Tripulacion;
// @author Jairo_Otaku

public class TripulacionModelo {

    Conexion db;
    String PLSQL = "";

    public TripulacionModelo(Conexion db) {
        this.db = db;
    }
    //String puesto, Personal personal, int cod

    public void insertTripulacion(Tripulacion tripulacion) {
        Connection conn = db.getConexion();
        try {
            PLSQL = "{call INSERT_TRIPULACION (" + tripulacion.getPuesto() + ",'" + tripulacion.getPersonal() + "','" + tripulacion.getCod() + ")}";
            CallableStatement storedProc = conn.prepareCall(PLSQL);
            storedProc.execute();
            storedProc.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateTripulacion(Tripulacion tripulacion) {

        Connection conn = db.getConexion();

        try {
            PLSQL = "{call UPDATE_TRIPULACION (" + tripulacion.getPuesto() + ",'" + tripulacion.getPersonal() + "','" + tripulacion.getCod() + ")}";
            System.out.print(PLSQL);
            CallableStatement storedProc = conn.prepareCall(PLSQL);
            storedProc.execute();
            storedProc.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteTripulacion(int cod) {

        Connection conn = db.getConexion();
        try {
            PLSQL = "{call DELETE_TRIPULACION (" + cod + ")}";
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
