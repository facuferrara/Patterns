package src.composite;

public class Profesor implements ComponentUniversidad{
    private String Name;
    private Puesto puesto;

    public Profesor(String name, Puesto puesto) {
        Name = name;
        this.puesto = puesto;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setPuesto(Puesto puesto) {
        this.puesto = puesto;
    }

    public String getName() {
        return Name;
    }

    public Puesto getPuesto() {
        return puesto;
    }

    //getts, setts  y constructor arriba


    public double getSueldos() {
        return puesto.getSueldo();
    }
}
