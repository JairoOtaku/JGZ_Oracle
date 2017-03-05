package Clases;

// @author Jairo_Otaku
public class Telefono {

    private int[] telefonos = new int[2];

    public Telefono(int[] telefonos) {
        this.telefonos = telefonos;
    }

    public int[] getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(int[] telefonos) {
        this.telefonos = telefonos;
    }
}
