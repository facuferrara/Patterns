package src.composite;

import java.util.List;

public class CompositeInstitute implements ComponentUniversidad{

    private String nombre;
    private String Sede;
    private List<ComponentUniversidad> universidad;

    public CompositeInstitute(String nombre, String sede) {
        this.nombre = nombre;
        Sede = sede;
    }

//---------------------------------------------

    public void agregar(ComponentUniversidad materia){
        universidad.add(materia);
    }
    public void quitar(ComponentUniversidad materia) {
        universidad.remove(materia);
    }

    public double getSueldos() {
        return 0;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSede(String sede) {
        Sede = sede;
    }

    public void setUniversidad(List<ComponentUniversidad> universidad) {
        this.universidad = universidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSede() {
        return Sede;
    }

    public List<ComponentUniversidad> getUniversidad() {
        return universidad;
    }
}
