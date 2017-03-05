package Clases;

// @author Jairo_Otaku
public class Pasaje {

    private String codPasaje;
    private int numAsiento;
    private String clase;
    private float pvp;
    private Pasajero pasajero;

    public Pasaje() {
    }

    public Pasaje(String codPasaje, int numAsiento, String clase, float pvp, Pasajero pasajero) {
        this.codPasaje = codPasaje;
        this.numAsiento = numAsiento;
        this.clase = clase;
        this.pvp = pvp;
        this.pasajero = pasajero;
    }

    public String getCodPasaje() {
        return codPasaje;
    }

    public int getNumAsiento() {
        return numAsiento;
    }

    public String getClase() {
        return clase;
    }

    public float getPvp() {
        return pvp;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setCodPasaje(String codPasaje) {
        this.codPasaje = codPasaje;
    }

    public void setNumAsiento(int numAsiento) {
        this.numAsiento = numAsiento;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public void setPvp(float pvp) {
        this.pvp = pvp;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

}
