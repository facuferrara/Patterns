package src.chainsOfResponsability;

public class Jugador {
    private int opcionSelect;

    public void selectOption(int opcion){
        this.opcionSelect+=opcion;
    }
    public void modo(ModoJuego seleccioneModo){
        if (seleccioneModo.getOptionMode() == 1){
            System.out.println("Modo Historia");
        }
        else{
            System.out.println("Modo Batalla");
        }
    }

    public int getOpcionSelect() {
        return opcionSelect;
    }
}
