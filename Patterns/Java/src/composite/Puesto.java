package src.composite;


public enum Puesto {

    DOCENTE(25000), BEDEL(10000), NO_DOCENTE(5000);

    private final double sueldo;

    private Puesto(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

}
