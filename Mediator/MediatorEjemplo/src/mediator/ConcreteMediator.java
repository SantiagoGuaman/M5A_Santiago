package mediator;

import java.util.ArrayList;
import java.util.List;
import model.Usuario;

/**
 *
 * @author Usuario
 */
public class ConcreteMediator implements Mediator {

    private final List<Usuario> usuarios;

    public ConcreteMediator() {
        this.usuarios = new ArrayList<>();
    }

    @Override
    public void addUser(Usuario user) {
        this.usuarios.add(user);
    }

    @Override
    public void sendMessage(String message, Usuario user) {
        for (Usuario u : usuarios) {
            if (u != user) {
                u.receive(message);
            }
        }
    }
}
