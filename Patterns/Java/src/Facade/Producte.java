package src.Facade;

public class Producte {
    private String name;
    private float coste;
    Category category;
    private float shippingCost;

    public Producte() {
    }

    protected String condicionProducte(Condition condition){
        return condition.condiciones();
    }

    public void tipoEntrega(TipoDeEntrega entrega){
    }

    public void tipoDePago(TipoDePago tipoDePago){

    }

    public String getName() {
        return name;
    }

    public float getCoste() {
        return coste;
    }

    public Category getCategory() {
        return category;
    }

    public float getShippingCost() {
        return shippingCost;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + name + '\'' +
                ", precio=" + coste +
                ", categoria=" + category +
                ", costoDeEnvio=" + coste +
                '}';
    }


}
