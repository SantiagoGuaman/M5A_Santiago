package main;

import mediator.ConcreteMediator;
import mediator.Mediator;
import model.Usuario;
import model.UsuarioImp;

/**
 *
 * @author Usuario
 */
public class Main {

    public static void main(String[] args) {

        Mediator mediator = new ConcreteMediator();

        Usuario user1 = new UsuarioImp(mediator, "Mario");
        Usuario user2 = new UsuarioImp(mediator, "Lisa");
        Usuario user3 = new UsuarioImp(mediator, "Sara");
        Usuario user4 = new UsuarioImp(mediator, "David");
        
        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);

        user1.send("Hola, ¿Cómo están?");
        user2.send("Hola a todos :D");
    }
}
