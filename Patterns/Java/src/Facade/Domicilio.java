package src.Facade;

public class Domicilio extends TipoDeEntrega{
    private String domicilio;

    public Domicilio(Producte producte) {
        super(producte);
    }

    public void tipoEntrega(TipoDeEntrega entrega) {
        this.domicilio= "Moron";
    }

    public String  tipoEntrega(Producte producte){
        return this.tipoEntrega(producte);
    }
}
