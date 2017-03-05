package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

// @author Jairo_Otaku
public class CargaDatos {

    Conexion db;

    public CargaDatos(Conexion db) {
        this.db = db;
    }

    public DefaultTableModel tablaPasajero() {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conn = db.getConexion();
        String[] comlunas = {"CODPASAJERO", "NIF", "NOMBRE", "PAIS", "PROVINCIA", "CIUDAD", "TELEFONO 1", "TELEFONO 2"};
        DefaultTableModel tabla = new DefaultTableModel();
        int i = 0;
        try {
            String selectSQL = "SELECT COUNT(*) as c FROM TABLA_PASAJERO";

            ps = conn.prepareStatement(selectSQL);
            rs = ps.executeQuery(selectSQL);

            rs.next();

            int filas = rs.getInt("c");
            rs.close();
            ps.close();

            Object[][] datos = new String[filas][8];

            selectSQL = "SELECT CODPASAJERO ,NIF,NOMBRE,P.DIRECCION.PAIS AS PAIS,P.DIRECCION.PROVINCIA AS PROVINCIA,P.DIRECCION.POBLACION AS POBLACION,TELEFONO  FROM TABLA_PASAJERO P";
            ps = conn.prepareStatement(selectSQL);
            rs = ps.executeQuery(selectSQL);

            while (rs.next()) {
                datos[i][0] = rs.getString("CODPASAJERO");
                datos[i][1] = rs.getString("NIF");
                datos[i][2] = rs.getString("NOMBRE");
                datos[i][3] = rs.getString("PAIS");
                datos[i][4] = rs.getString("PROVINCIA");
                datos[i][5] = rs.getString("POBLACION");
                String[] tlf = (String[]) rs.getArray("TELEFONO").getArray();
                datos[i][6] = tlf[0];
                datos[i][7] = tlf[1];
                i++;
            }
            tabla.setDataVector(datos, comlunas);
            rs.close();
            ps.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tabla;
    }

    public DefaultTableModel tablaPersonal() {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conn = db.getConexion();
        String[] comlunas = {"CODPERSONAL", "NOMBRE", "PUESTO"};
        DefaultTableModel tabla = new DefaultTableModel();
        int i = 0;
        try {
            String selectSQL = "SELECT COUNT(*) as c FROM TABLA_PERSONAL";

            ps = conn.prepareStatement(selectSQL);
            rs = ps.executeQuery(selectSQL);

            rs.next();

            int filas = rs.getInt("c");
            rs.close();
            ps.close();

            Object[][] datos = new String[filas][3];

            selectSQL = "SELECT CODIGOPERSONAL ,NOMBRE,CATEGORIA  FROM TABLA_PERSONAL P";
            ps = conn.prepareStatement(selectSQL);
            rs = ps.executeQuery(selectSQL);

            while (rs.next()) {
                datos[i][0] = rs.getString("CODIGOPERSONAL");
                datos[i][1] = rs.getString("NOMBRE");
                datos[i][2] = rs.getString("CATEGORIA");

                i++;

            }
            tabla.setDataVector(datos, comlunas);
            rs.close();
            ps.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tabla;
    }

    public DefaultTableModel tablaVuelos() {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conn = db.getConexion();
        String[] comlunas = {"IDENTIFICADOR", "A_ORIGEN", "A_DESTINO", "TIPO", "FECHA"};
        DefaultTableModel tabla = new DefaultTableModel();
        int i = 0;
        try {
            String selectSQL = "SELECT COUNT(*) as c FROM TABLA_VUELO";

            ps = conn.prepareStatement(selectSQL);
            rs = ps.executeQuery(selectSQL);

            rs.next();

            int filas = rs.getInt("c");
            rs.close();
            ps.close();

            Object[][] datos = new String[filas][5];

            selectSQL = "SELECT IDENTIFICADOR,AEROPUERTO_ORIGEN as origen,AEROPUERTO_DESTINO as destino,TIPO_VUELO as tipo,FECHA_VUELO as fecha FROM TABLA_VUELO";
            ps = conn.prepareStatement(selectSQL);
            rs = ps.executeQuery(selectSQL);

            while (rs.next()) {
                datos[i][0] = rs.getString("IDENTIFICADOR");
                datos[i][1] = rs.getString("origen");
                datos[i][2] = rs.getString("destino");
                datos[i][3] = rs.getString("tipo");
                datos[i][4] = rs.getString("fecha");
                i++;

            }
            tabla.setDataVector(datos, comlunas);
            rs.close();
            ps.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tabla;
    }

    public DefaultTableModel tablaTripulacion() {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conn = db.getConexion();
        String[] comlunas = {"CODIGO", "PUESTO", "CODIGO PERSONAL", "NOMBRE PERSONAL"};
        DefaultTableModel tabla = new DefaultTableModel();
        int i = 0;
        try {
            String selectSQL = "SELECT COUNT(PV.COD) AS c  FROM TABLA_VUELO V, TABLE(V.TRIPULACION) PV";

            ps = conn.prepareStatement(selectSQL);
            rs = ps.executeQuery(selectSQL);

            rs.next();

            int filas = rs.getInt("c");
            rs.close();
            ps.close();

            Object[][] datos = new String[filas][4];

            selectSQL = "SELECT PV.COD AS COD,PV.PUESTO AS PUESTO,PV.PERSONAL.CODIGOPERSONAL AS CP,PV.PERSONAL.NOMBRE AS NOMBRE  FROM TABLA_VUELO V,TABLE(V.TRIPULACION) PV";
            ps = conn.prepareStatement(selectSQL);
            rs = ps.executeQuery(selectSQL);

            while (rs.next()) {
                datos[i][0] = rs.getString("COD");
                datos[i][1] = rs.getString("PUESTO");
                datos[i][2] = rs.getString("CP");
                datos[i][3] = rs.getString("NOMBRE");

                i++;

            }
            tabla.setDataVector(datos, comlunas);
            rs.close();
            ps.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tabla;
    }

    public DefaultTableModel tablaPasaje() {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conn = db.getConexion();
        String[] comlunas = {"CODPASAJE", "N_ASIENTO", "CLASE", "PRECCIO", "NIF PASAJERO"};
        DefaultTableModel tabla = new DefaultTableModel();
        int i = 0;
        try {
            String selectSQL = "SELECT COUNT(PV.CODPASAJE) AS c  FROM TABLA_VUELO V, TABLE(V.PASAJE) PV";

            ps = conn.prepareStatement(selectSQL);
            rs = ps.executeQuery(selectSQL);

            rs.next();

            int filas = rs.getInt("c");
            rs.close();
            ps.close();

            Object[][] datos = new String[filas][5];

            selectSQL = "SELECT PV.CODPASAJE AS COD,PV.NUMASIENTO AS NASIENTO,PV.CLASE AS CLASE,PV.PVP AS PVP , PV.PASAJERO.NIF AS NIF  FROM TABLA_VUELO V,TABLE(V.PASAJE) PV";
            ps = conn.prepareStatement(selectSQL);
            rs = ps.executeQuery(selectSQL);

            while (rs.next()) {
                datos[i][0] = rs.getString("COD");
                datos[i][1] = rs.getString("NASIENTO");
                datos[i][2] = rs.getString("CLASE");
                datos[i][3] = rs.getString("PVP");
                datos[i][4] = rs.getString("NIF");

                i++;

            }
            tabla.setDataVector(datos, comlunas);
            rs.close();
            ps.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tabla;
    }
}
