package Modelo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import Clases.Vuelo;

// @author Jairo_Otaku
public class VueloModelo {

    Conexion db;
    String PLSQL = "";

    public VueloModelo(Conexion db) {
        this.db = db;
    }
    //String identificador, String aeropuerto_orgien, String aeropuerto_destino, String tipo_vuelo, String fecha_vuelo, ArrayList<Tripulacion> tripulacion, ArrayList<Pasaje> pasaje

    public void insertVuelo(Vuelo vuelo) {
        Connection conn = db.getConexion();
        try {
            //       PLSQL = "{call INSERT_VUELO (" + vuelo.getCodigoPersonal() + ",'" + vuelo.getNombre() + "','" + vuelo.getCategoria() + ")}";
            CallableStatement storedProc = conn.prepareCall(PLSQL);
            storedProc.execute();
            storedProc.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateVuelo(Vuelo vuelo) {

        Connection conn = db.getConexion();

        try {
            //         PLSQL = "{call UPDATE_VUELO (" + vuelo.getCodigoPersonal() + ",'" + vuelo.getNombre() + "','" + vuelo.getCategoria() + ")}";
            System.out.print(PLSQL);
            CallableStatement storedProc = conn.prepareCall(PLSQL);
            storedProc.execute();
            storedProc.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteVuelo(int codigoPersonal) {

        Connection conn = db.getConexion();
        try {
            PLSQL = "{call DELETE_VUELO (" + codigoPersonal + ")}";
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
