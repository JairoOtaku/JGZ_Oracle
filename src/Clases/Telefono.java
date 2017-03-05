package Clases;

// @author Jairo_Otaku
public class Telefono {

    private String[] telefonos = new String[2];

    public Telefono(String[] telefonos) {
        this.telefonos = telefonos;
    }

    public String[] getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(String[] telefonos) {
        this.telefonos = telefonos;
    }
}
