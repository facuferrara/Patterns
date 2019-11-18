package src.chainsOfResponsability;

public abstract class ModoJuego {
    private int optionMode;
    private String personaje;

    public ModoJuego(String colorFondo, String personaje) {
        this.optionMode = 0;
        this.personaje = personaje;
    }

    public abstract int potencia();
    public abstract int velocidad();
    public abstract int corpulencia();

    public int getOptionMode() {
        return optionMode;
    }

    public String getPersonaje() {
        return personaje;
    }
}
