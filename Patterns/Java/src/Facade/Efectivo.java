package src.Facade;

    public class Efectivo extends TipoDePago{

        private String efectivo;

        public Efectivo(Producte producte) {
            super(producte);
        }

        public void tipoDePago(TipoDePago tipoPago) {
            this.efectivo = "efectivo";
        }

        public String tipoDePago(Producte producto) {
            return this.tipoDePago(producto);
        }
    }

