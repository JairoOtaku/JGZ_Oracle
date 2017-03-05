package Clases;

// @author Jairo_Otaku
public class Personal {

    private int codigoPersonal;
    private String nombre;
    private String categoria;

    public Personal() {
    }

    public Personal(int codigoPersonal, String nombre, String categoria) {
        this.codigoPersonal = codigoPersonal;
        this.nombre = nombre;
        this.categoria = categoria;
    }

    public int getCodigoPersonal() {
        return codigoPersonal;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCodigoPersonal(int codigoPersonal) {
        this.codigoPersonal = codigoPersonal;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

}
