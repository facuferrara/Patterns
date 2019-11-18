package src.chainsOfResponsability;

public class OpcionJugar implements GameMenu {
    private GameMenu siguiente;

    public void setSiguiente(GameMenu siguiente) {
        this.siguiente=siguiente;
    }

    public GameMenu getSiguiente() {
        return  this.siguiente;
    }

    public void opcionGame(int opcion) {
        if(opcion == 1) {
            System.out.println("Loading");
        }

    }
}
