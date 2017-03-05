package Clases;

// @author Jairo_Otaku
public class Tripulacion {

    private String puesto;
    private Personal personal;
    private int cod;

    public Tripulacion() {
    }

    public Tripulacion(String puesto, Personal personal, int cod) {
        this.puesto = puesto;
        this.personal = personal;
        this.cod = cod;
    }

    public String getPuesto() {
        return puesto;
    }

    public Personal getPersonal() {
        return personal;
    }

    public int getCod() {
        return cod;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

}
