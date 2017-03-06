package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// @author Jairo_Otaku
public class Conexion {

    private static final String DB_DRIVER = "oracle.jdbc.driver.OracleDriver";
    private static final String DB_CONNECTION = "jdbc:oracle:thin:@localhost:1521:xe";
    private static final String DB_USER = "SYS";
    private static final String DB_PASS = "jairo";

    public Connection getConexion() {
        Connection dbconnection = null;
        try {
            Class.forName(DB_DRIVER);
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            dbconnection = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASS);
            return dbconnection;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return dbconnection;
    }
}
