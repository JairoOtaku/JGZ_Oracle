package Clases;

// @author Jairo_Otaku
public class Direccion {

    private String calle;
    private int codigoPostal;
    private String poblacion;
    private String provincia;
    private String Pais;

    public Direccion() {
    }

    public Direccion(String calle, int codigoPostal, String poblacion, String provincia, String Pais) {
        this.calle = calle;
        this.codigoPostal = codigoPostal;
        this.poblacion = poblacion;
        this.provincia = provincia;
        this.Pais = Pais;
    }

    public String getCalle() {
        return calle;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public String getProvincia() {
        return provincia;
    }

    public String getPais() {
        return Pais;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

}
