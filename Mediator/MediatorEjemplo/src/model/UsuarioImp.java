package model;

import mediator.Mediator;

/**
 *
 * @author Usuario
 */
public class UsuarioImp extends Usuario {

    public UsuarioImp(Mediator mediator, String nombre) {
        super(mediator, nombre);
    }

    @Override
    public void send(String message) {
        System.out.println(this.nombre + " - Envia mensaje: " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println(this.nombre + " - Recibe mensaje: " + message);
    }
}
