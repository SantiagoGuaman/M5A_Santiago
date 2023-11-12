package modelo;

import sw.ConversionWS;
import sw.ConversionWS_Service;

/**
 *
 * @author Usuario
 */
public class TestWS {

    public static void main(String[] args) {

        ConversionWS_Service servicio = new ConversionWS_Service();
        ConversionWS cliente = servicio.getConversionWSPort();

        System.out.println("Resultado 1: " + cliente.euroDolar(20.00));
        System.out.println("Resultado 2: " + cliente.euroDolar(10.00));

        if (cliente.login("Mario", "Admin123")) {
            System.out.println("Bienvenido...");
        } else {
            System.out.println("Datos incorrectos...");
        }

        if (cliente.login("Admin", "Admin123")) {
            System.out.println("Bienvenido...");
        } else {
            System.out.println("Datos incorrectos...");
        }
        System.out.println("La suma es: " + cliente.suma(10.00, 20.00));
        System.out.println("La resta es: " + cliente.resta(10.00, 5.00));
        System.out.println("La multiplicación es: " + cliente.multiplicacion(10.00, 5.00));
        System.out.println(cliente.division(20.00, 4.00));


        System.out.println(cliente.factorial(5.00));
        System.out.println(cliente.calcularDistancia(60.00, 70.00));
        System.out.println(cliente.volumenPiramide(50.00, 30.00));
    }
}
