package Controlador;

import Modelo.CargaTablas;
import Vistas.MainView;

// @author Jairo_Otaku
public class Controlador {

    MainView vista;
    CargaTablas carga;

    public Controlador(MainView vista) {
        this.vista = vista;
    }

    public void iniciar() {
        try {
            vista.tablaPasajeros.setModel(carga.tablaPasajero());
            vista.tablaPersonal.setModel(carga.tablaPersonal());
            vista.tablaVuelos.setModel(carga.tablaVuelos());
            vista.tablaTripulacion.setModel(carga.tablaTripulacion());
        } catch (Exception e) {
            System.out.println("Error en la carga de datos a las tablas");
            e.printStackTrace();
        }
        vista.setVisible(true);
    }
}
