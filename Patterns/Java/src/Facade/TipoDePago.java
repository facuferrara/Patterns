package src.Facade;

public abstract class TipoDePago extends Producte{

    private Producte producte;

    public TipoDePago(Producte producte) {
        this.producte = producte;
    }

    public abstract void tipoDePago(TipoDePago tipoDePago);
}
