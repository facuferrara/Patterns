package src.Mediator;

import java.util.HashMap;

public class SalaChatMessenger implements Messenger{

    private HashMap<String, Usuario>participantes = new HashMap<String, Usuario>();


    public void registra(Usuario usuario){
        participantes.put(usuario.getName(),usuario);
    }

    public void registra(String de, String a, String msj) {

    }

    public void envia(String de, String a, String msj) {

        if(participantes.containsKey(de) && participantes.containsKey(a)){
            Usuario usuario = participantes.get(a);
            usuario.registra(de, msj);
        }
        else {
            System.out.println("El usuario no existe");
        }
    }

    public void enviarMensajeATodos(String de, String mensaje) {

    }

    public void eliminarUser(String usuario){
        participantes.remove(usuario);
    }
}
