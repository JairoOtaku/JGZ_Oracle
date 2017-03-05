package Clases;

// @author Jairo_Otaku
public class Pasajero {

    private int codPasajero;
    private String nif;
    private String nombre;
    private Direccion direccion;
    private Telefono telefono;
    //private int[] telefono = new int[2];

    public Pasajero() {
    }

    public Pasajero(int codPasajero, String nif, String nombre, Direccion direccion, Telefono telefono) {
        this.codPasajero = codPasajero;
        this.nif = nif;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public void setCodPasajero(int codPasajero) {
        this.codPasajero = codPasajero;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(Telefono telefono) {
        this.telefono = telefono;
    }

    public int getCodPasajero() {
        return codPasajero;
    }

    public String getNif() {
        return nif;
    }

    public String getNombre() {
        return nombre;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public Telefono getTelefono() {
        return telefono;
    }

}
