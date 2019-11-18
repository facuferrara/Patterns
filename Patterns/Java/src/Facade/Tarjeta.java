package src.Facade;

public class Tarjeta extends TipoDePago {

        private String efectivo;

        public Tarjeta(Producte producte) {
            super(producte);
        }

        public void tipoDePago(TipoDePago tipoPago) {
            this.efectivo = "credito u debito";
        }

        public String tipoDePago(Producte producto) {
            return this.tipoDePago(producto);
        }
    }

