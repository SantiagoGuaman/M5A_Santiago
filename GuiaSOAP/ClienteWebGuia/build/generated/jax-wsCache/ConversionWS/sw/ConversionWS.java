
package sw;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ConversionWS", targetNamespace = "http://sw/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ConversionWS {


    /**
     * 
     * @param altura
     * @param base
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "volumenPiramide", targetNamespace = "http://sw/", className = "sw.VolumenPiramide")
    @ResponseWrapper(localName = "volumenPiramideResponse", targetNamespace = "http://sw/", className = "sw.VolumenPiramideResponse")
    @Action(input = "http://sw/ConversionWS/volumenPiramideRequest", output = "http://sw/ConversionWS/volumenPiramideResponse")
    public String volumenPiramide(
        @WebParam(name = "base", targetNamespace = "")
        Double base,
        @WebParam(name = "altura", targetNamespace = "")
        Double altura);

    /**
     * 
     * @param password
     * @param user
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "login", targetNamespace = "http://sw/", className = "sw.Login")
    @ResponseWrapper(localName = "loginResponse", targetNamespace = "http://sw/", className = "sw.LoginResponse")
    @Action(input = "http://sw/ConversionWS/loginRequest", output = "http://sw/ConversionWS/loginResponse")
    public Boolean login(
        @WebParam(name = "user", targetNamespace = "")
        String user,
        @WebParam(name = "password", targetNamespace = "")
        String password);

    /**
     * 
     * @param euro
     * @return
     *     returns java.lang.Double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "euroDolar", targetNamespace = "http://sw/", className = "sw.EuroDolar")
    @ResponseWrapper(localName = "euroDolarResponse", targetNamespace = "http://sw/", className = "sw.EuroDolarResponse")
    @Action(input = "http://sw/ConversionWS/euroDolarRequest", output = "http://sw/ConversionWS/euroDolarResponse")
    public Double euroDolar(
        @WebParam(name = "euro", targetNamespace = "")
        Double euro);

    /**
     * 
     * @param value2
     * @param value1
     * @return
     *     returns java.lang.Double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "suma", targetNamespace = "http://sw/", className = "sw.Suma")
    @ResponseWrapper(localName = "sumaResponse", targetNamespace = "http://sw/", className = "sw.SumaResponse")
    @Action(input = "http://sw/ConversionWS/sumaRequest", output = "http://sw/ConversionWS/sumaResponse")
    public Double suma(
        @WebParam(name = "value_1", targetNamespace = "")
        Double value1,
        @WebParam(name = "value_2", targetNamespace = "")
        Double value2);

    /**
     * 
     * @param value2
     * @param value1
     * @return
     *     returns java.lang.Double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "resta", targetNamespace = "http://sw/", className = "sw.Resta")
    @ResponseWrapper(localName = "restaResponse", targetNamespace = "http://sw/", className = "sw.RestaResponse")
    @Action(input = "http://sw/ConversionWS/restaRequest", output = "http://sw/ConversionWS/restaResponse")
    public Double resta(
        @WebParam(name = "value_1", targetNamespace = "")
        Double value1,
        @WebParam(name = "value_2", targetNamespace = "")
        Double value2);

    /**
     * 
     * @param value2
     * @param value1
     * @return
     *     returns java.lang.Double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "multiplicacion", targetNamespace = "http://sw/", className = "sw.Multiplicacion")
    @ResponseWrapper(localName = "multiplicacionResponse", targetNamespace = "http://sw/", className = "sw.MultiplicacionResponse")
    @Action(input = "http://sw/ConversionWS/multiplicacionRequest", output = "http://sw/ConversionWS/multiplicacionResponse")
    public Double multiplicacion(
        @WebParam(name = "value_1", targetNamespace = "")
        Double value1,
        @WebParam(name = "value_2", targetNamespace = "")
        Double value2);

    /**
     * 
     * @param value2
     * @param value1
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "division", targetNamespace = "http://sw/", className = "sw.Division")
    @ResponseWrapper(localName = "divisionResponse", targetNamespace = "http://sw/", className = "sw.DivisionResponse")
    @Action(input = "http://sw/ConversionWS/divisionRequest", output = "http://sw/ConversionWS/divisionResponse")
    public String division(
        @WebParam(name = "value_1", targetNamespace = "")
        Double value1,
        @WebParam(name = "value_2", targetNamespace = "")
        Double value2);

    /**
     * 
     * @param valor
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "factorial", targetNamespace = "http://sw/", className = "sw.Factorial")
    @ResponseWrapper(localName = "factorialResponse", targetNamespace = "http://sw/", className = "sw.FactorialResponse")
    @Action(input = "http://sw/ConversionWS/factorialRequest", output = "http://sw/ConversionWS/factorialResponse")
    public String factorial(
        @WebParam(name = "valor", targetNamespace = "")
        Double valor);

    /**
     * 
     * @param tiempo
     * @param velocidad
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "calcularDistancia", targetNamespace = "http://sw/", className = "sw.CalcularDistancia")
    @ResponseWrapper(localName = "calcularDistanciaResponse", targetNamespace = "http://sw/", className = "sw.CalcularDistanciaResponse")
    @Action(input = "http://sw/ConversionWS/calcularDistanciaRequest", output = "http://sw/ConversionWS/calcularDistanciaResponse")
    public String calcularDistancia(
        @WebParam(name = "velocidad", targetNamespace = "")
        Double velocidad,
        @WebParam(name = "tiempo", targetNamespace = "")
        Double tiempo);

}
