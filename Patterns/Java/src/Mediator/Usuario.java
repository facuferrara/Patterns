package src.Mediator;

public class Usuario implements UsuarioChat {
    private String name;
    private Messenger messenger;

    public Usuario( Messenger messenger) {
        this.messenger = messenger;
    }

    public void registra(String de, String msj) {
        String s = " El usuario " + de + " te dice " + " msj ";
        System.out.println(name +  ": " + s );
    }

    public void envia(String a, String msj) {
        messenger.envia(name, a,  msj);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Messenger getMessenger() {
        return messenger;
    }
    public void cambiarSala(Messenger nuevaSala){
        this.messenger.eliminarUser(this.getName());
        this.messenger=nuevaSala;
        nuevaSala.registra(this);
    }
}
