package src.chainsOfResponsability;

public class OpcionSalir implements GameMenu{
    private GameMenu siguiente;

    public void setSiguiente(GameMenu siguiente) {
        this.siguiente=siguiente;
    }

    public GameMenu getSiguiente() {
        return  this.siguiente;
    }

    public void opcionGame(int opcion) {
        if(opcion == 3) {
            System.out.println("Exit");
        }

    }
}
