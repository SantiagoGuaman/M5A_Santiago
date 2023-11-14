package mediator;

import model.Usuario;

/**
 *
 * @author Usuario
 */
public interface Mediator {
    
    void sendMessage(String message, Usuario user);
    
    void addUser(Usuario user);
}
