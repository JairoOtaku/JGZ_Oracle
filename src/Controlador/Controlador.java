package Controlador;

import Modelo.CargaDatos;
import Vistas.MainView;

// @author Jairo_Otaku
public class Controlador {

    MainView vista;
    CargaDatos carga;

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
            e.printStackTrace();
        }

        vista.setVisible(true);
    }
}
