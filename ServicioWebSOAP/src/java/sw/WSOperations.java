/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package sw;

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
@WebService(serviceName = "WSOperations")
public class WSOperations {

    private final List<Cliente> listClients = new ArrayList<>();

    /**
     * Register Operation
     *
     * @param user
     * @param password
     * @param cash
     * @return valid register
     */
    @WebMethod(operationName = "Register")
    public Boolean registro(@WebParam(name = "user") String user,
            @WebParam(name = "password") String password, @WebParam(name = "cash") Double cash) {
        Cliente client = new Cliente();
        Boolean registro = false;
        if (!(user.trim().isEmpty()) && !(password.trim().isEmpty()) && (cash > 0)) {
            client.setUser(user);
            client.setPassword(password);
            client.setSaldo(cash);
            listClients.add(client);
            registro = true;
        }
        return registro;
    }

    /**
     * Charge Operation No return value - For Test Only
     */
    //@WebMethod(operationName = "cargarClientes")
    public void cargarClientes() {
        Cliente client1 = new Cliente("Marco", "Bank", 500.00);
        Cliente client2 = new Cliente("Steve", "One", 1500.00);
        Cliente client3 = new Cliente("Johnny", "OneBank", 300.00);

        listClients.add(client1);
        listClients.add(client2);
        listClients.add(client3);
    }

    /**
     * Login Operation
     *
     * @param user
     * @param password
     * @return
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
     * Payment Operation
     *
     * @param pago
     * @param total
     * @return
     */
    @WebMethod(operationName = "ProcesarPago")
    public Double ProcesarPago(@WebParam(name = "pago") Double pago, @WebParam(name = "total") Double total) {
        if (pago >= total) {
            return pago - total;
        } else {
            return -1.00;
        }
    }
}
