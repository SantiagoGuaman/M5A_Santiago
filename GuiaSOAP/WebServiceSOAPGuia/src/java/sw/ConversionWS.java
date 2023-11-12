package sw;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Usuario
 */
@WebService(serviceName = "ConversionWS")
public class ConversionWS {

    /**
     * Euro a Dólar Operation
     *
     * @param euro
     * @return Euro en Dólar result
     */
    @WebMethod(operationName = "euroDolar")
    public Double euroDolar(@WebParam(name = "euro") Double euro) {
        return euro * 1.15;
    }

    /**
     * login Operation
     *
     * @param user
     * @param password
     * @return Login Success or Fail - result
     */
    @WebMethod(operationName = "login")
    public Boolean login(@WebParam(name = "user") String user, @WebParam(name = "password") String password) {
        return (user.equals("Admin") && password.equals("Admin123"));
    }

    /**
     * Suma Operation
     *
     * @param value_1
     * @param value_2
     * @return Suma result
     */
    @WebMethod(operationName = "suma")
    public Double suma(@WebParam(name = "value_1") Double value_1, @WebParam(name = "value_2") Double value_2) {
        return value_1 + value_2;
    }

    /**
     * Resta Operation
     *
     * @param value_1
     * @param value_2
     * @return Resta result
     */
    @WebMethod(operationName = "resta")
    public Double resta(@WebParam(name = "value_1") Double value_1, @WebParam(name = "value_2") Double value_2) {
        return value_1 - value_2;
    }

    /**
     * Multiplicación Operation
     *
     * @param value_1
     * @param value_2
     * @return Multiplicación result
     */
    @WebMethod(operationName = "multiplicacion")
    public Double multiplicacion(@WebParam(name = "value_1") Double value_1, @WebParam(name = "value_2") Double value_2) {
        return value_1 * value_2;
    }

    /**
     * División Operation
     *
     * @param value_1
     * @param value_2
     * @return División result
     */
    @WebMethod(operationName = "division")
    public String division(@WebParam(name = "value_1") Double value_1, @WebParam(name = "value_2") Double value_2) {
        try {
            return "División: " + value_1 / value_2;
        } catch (ArithmeticException e) {
            return "Error - No se puede dividir para cero";
        }
    }

    /**
     * Factorial Operation
     *
     * @param valor
     * @return Factorial result
     */
    @WebMethod(operationName = "factorial")
    public String factorial(@WebParam(name = "valor") Double valor) {
        double factorial = 1;
        for (int i = 1; i <= valor; i++) {
            factorial = factorial * i;
        }
        return "El factorial de " + valor + " es: " + factorial;
    }

    /**
     * Distancia Operation
     *
     * @param velocidad
     * @param tiempo
     * @return Distancia result
     */
    @WebMethod(operationName = "calcularDistancia")
    public String calcularDistancia(@WebParam(name = "velocidad") Double velocidad, @WebParam(name = "tiempo") Double tiempo) {
        try {
            return "La distancia es: " + velocidad / tiempo + " m";
        } catch (ArithmeticException e) {
            return "Error - No se puede dividir para cero";
        }
    }

    /**
     * Volumen de pirámide Operation
     *
     * @param base 
     * @param altura 
     * @return Volumen result
     */
    @WebMethod(operationName = "volumenPiramide")
    public String volumenPiramide(@WebParam(name = "base") Double base, @WebParam(name = "altura") Double altura) {
        
        System.out.println(base + altura);
        
        Double volumen = (base * altura) / 3;
        
        return "El volumen de la pirámide es: " + volumen;
    }

}
