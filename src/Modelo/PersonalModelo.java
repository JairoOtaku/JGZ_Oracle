package Modelo;

// @author Jairo_Otaku
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Clases.Personal;

public class PersonalModelo {

    Conexion db;
    String PLSQL = "";

    public PersonalModelo(Conexion db) {
        this.db = db;
    }
    //int codigoPersonal, String nombre, String categoria

    public void insertPersonal(Personal personal) {
        Connection conn = db.getConexion();
        try {
            PLSQL = "{call INSERT_PERSONAL (" + personal.getCodigoPersonal() + ",'" + personal.getNombre() + "','" + personal.getCategoria() + ")}";
            CallableStatement storedProc = conn.prepareCall(PLSQL);
            storedProc.execute();
            storedProc.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updatePersonal(Personal personal) {

        Connection conn = db.getConexion();

        try {
            PLSQL = "{call UPDATE_PERSONAL (" + personal.getCodigoPersonal() + ",'" + personal.getNombre() + "','" + personal.getCategoria() + ")}";
            System.out.print(PLSQL);
            CallableStatement storedProc = conn.prepareCall(PLSQL);
            storedProc.execute();
            storedProc.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deletePersonal(int codigoPersonal) {

        Connection conn = db.getConexion();
        try {
            PLSQL = "{call DELETE_PERSONAL (" + codigoPersonal + ")}";
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
