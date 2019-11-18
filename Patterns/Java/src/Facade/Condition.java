package src.Facade;

public abstract class Condition extends Producte{

    private Producte producte;

    public Condition(Producte producte) {
        this.producte = producte;
    }

public String condiciones(){
        return producte.condicionProducte(null);
    }
}
