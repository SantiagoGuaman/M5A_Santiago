package ws;

import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import model.Cliente;

/**
 *
 * @author Usuario
 */
@WebService(serviceName = "WSOperaciones")
public class WSOperaciones {

    private final List<Cliente> listClients = new ArrayList<>();

    /**
     * Charge Operation No return value - For Test Only
     */
    @WebMethod(operationName = "cargarClientes")
    public void cargarClientes() {
        Cliente client1 = new Cliente("Marco", "Bank", 500.00);
        Cliente client2 = new Cliente("Steve", "One", 1500.00);
        Cliente client3 = new Cliente("Johnny", "OneBank", 300.00);

        listClients.add(client1);
        listClients.add(client2);
        listClients.add(client3);
    }

    public void listEveryone() {
        for (Cliente listClient : listClients) {
            System.out.println(listClient.getUser() + " " + listClient.getSaldo() + " " + listClient.getPassword());
        }
    }

    /**
     * Register Operation
     *
     * @param cliente
     * @return valid register
     */
    @WebMethod(operationName = "register")
    public Cliente registro(@WebParam(name = "cliente") Cliente cliente) {
        Cliente client = cliente;
        if (!(cliente.getUser().trim().isEmpty())
                || !(cliente.getPassword().trim().isEmpty()) || (cliente.getSaldo() < 0.00)) {
            listClients.add(cliente);
            return client;
        } else {
            return client;
        }
    }

    /**
     * Login Operation
     *
     * @param user
     * @param password
     * @return Boolean - found user
     */
    @WebMethod(operationName = "login")
    public Boolean login(@WebParam(name = "user") String user, @WebParam(name = "password") String password) {
        Boolean found = listClients.stream().anyMatch(cliente
                -> cliente.getUser().equals(user)
                && cliente.getPassword().equals(password)
        );
        return found;
    }

    /**
     * Search Operation
     *
     * @param user
     * @return Cliente found - Search by user
     */
    @WebMethod(operationName = "foundCliente")
    public Cliente foundCliente(@WebParam(name = "user") String user) {
        Cliente cliente = new Cliente();
        for (Cliente foundCli : listClients) {
            if (foundCli.getUser().equals(user)) {
                cliente = foundCli;
            }
        }
        return cliente;
    }

    /**
     * Retiro Operation
     *
     * @param user
     * @param cash
     * @return Cliente Object
     */
    @WebMethod(operationName = "retiro")
    public Cliente retiro(@WebParam(name = "user") String user, @WebParam(name = "cash") Double cash) {
        Cliente cliente = foundCliente(user);
        try {
            if (cliente != null && cliente.getSaldo() >= cash) {
                cliente.setSaldo(cliente.getSaldo() - cash);
            }
            return foundCliente(user);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            return cliente;
        }
    }

    /**
     * Depósito Operation
     *
     * @param user
     * @param cash
     * @return cliente Object
     */
    @WebMethod(operationName = "deposito")
    public Cliente deposito(@WebParam(name = "user") String user, @WebParam(name = "cash") Double cash) {
        Cliente cliente = foundCliente(user);
        try {
            if (cliente != null && cash > 0.00) {
                cliente.setSaldo(cliente.getSaldo() + cash);
            }
            return foundCliente(user);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            return cliente;
        }
    }
}
