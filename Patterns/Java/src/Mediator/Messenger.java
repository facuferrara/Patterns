package src.Mediator;

public interface Messenger {

    void registra(Usuario usuario);
    void envia(String de, String a, String msj);

    void enviarMensajeATodos(String de, String mensaje);
    void eliminarUser(String usuario);
}
