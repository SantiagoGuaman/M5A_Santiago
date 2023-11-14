package model;

import mediator.Mediator;

/**
 *
 * @author Usuario
 */
public abstract class Usuario {

    protected Mediator mediator;
    protected String nombre;

    public Usuario(Mediator mediator, String nombre) {
        this.mediator = mediator;
        this.nombre = nombre;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public abstract void send(String message);

    public abstract void receive(String message);
}
