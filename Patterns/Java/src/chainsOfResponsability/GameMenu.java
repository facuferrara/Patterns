package src.chainsOfResponsability;

public interface GameMenu {
    void setSiguiente(GameMenu siguiente);
    GameMenu getSiguiente();

    void opcionGame(int opcion);
}
