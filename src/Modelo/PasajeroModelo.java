package Modelo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import Clases.Pasajero;
import Clases.Telefono;
import Clases.Direccion;

// @author Jairo_Otaku
public class PasajeroModelo {

    Conexion db;
    Telefono telpho;
    Direccion direc;
    String PLSQL = "";

    //int codPasajero, String nif, String nombre, Direccion direccion, Telefono telefono
    public void insertPasajero(Pasajero pasajero) {
        Connection conn = db.getConexion();
        String[] telefonos = telpho.getTelefonos();

        try {
            if (telefonos.length <= 1) {
                PLSQL = "{call INSERT_PASAJERO(" + pasajero.getCodPasajero() + ",'" + pasajero.getNif()
                        + "','" + pasajero.getNombre() + "','" + direc.getCalle() + "'," + direc.getCodigoPostal()
                        + ",'" + direc.getPoblacion() + "','" + direc.getProvincia() + "','" + direc.getPais()
                        + "','" + telefonos[0] + "'," + null + ")}";
            } else {
                PLSQL = "{call INSERT_PASAJERO(" + pasajero.getCodPasajero() + ",'" + pasajero.getNif()
                        + "','" + pasajero.getNombre() + "','" + direc.getCalle() + "',"
                        + direc.getCodigoPostal() + ",'" + direc.getPoblacion() + "','"
                        + direc.getProvincia() + "','" + direc.getPais() + "','" + telefonos[0] + "','" + telefonos[1] + "')}";
            }
            CallableStatement storedProc = conn.prepareCall(PLSQL);
            storedProc.execute();
            storedProc.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updatePasajero(Pasajero pasajero) {

        Connection conn = db.getConexion();
        String[] telefonos = telpho.getTelefonos();
        try {
            PLSQL = "{call UPDATE_PASAJERO (" + pasajero.getCodPasajero() + ",'" + pasajero.getNif()
                    + "','" + pasajero.getNombre() + "','" + direc.getCalle() + "',"
                    + direc.getCodigoPostal() + ",'" + direc.getPoblacion() + "','"
                    + direc.getProvincia() + "','" + direc.getPais() + "','" + telefonos[0] + "','" + telefonos[1] + "')}";
            System.out.print(PLSQL);
            CallableStatement storedProc = conn.prepareCall(PLSQL);
            storedProc.execute();
            storedProc.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deletePasajero(int codPasajero) {

        Connection conn = db.getConexion();
        try {
            PLSQL = "{call DELETE_PASAJERO (" + codPasajero + ")}";
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
