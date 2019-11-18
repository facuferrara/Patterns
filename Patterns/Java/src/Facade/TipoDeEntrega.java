package src.Facade;

public abstract class TipoDeEntrega extends Producte{

    private Producte producte;

    public TipoDeEntrega(Producte producte) {
        this.producte = producte;
    }

    public abstract void tipoEntrega(TipoDeEntrega tipoPago);
}
