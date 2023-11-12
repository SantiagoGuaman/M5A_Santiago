
package sw;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the sw package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CalcularDistancia_QNAME = new QName("http://sw/", "calcularDistancia");
    private final static QName _CalcularDistanciaResponse_QNAME = new QName("http://sw/", "calcularDistanciaResponse");
    private final static QName _Division_QNAME = new QName("http://sw/", "division");
    private final static QName _DivisionResponse_QNAME = new QName("http://sw/", "divisionResponse");
    private final static QName _EuroDolar_QNAME = new QName("http://sw/", "euroDolar");
    private final static QName _EuroDolarResponse_QNAME = new QName("http://sw/", "euroDolarResponse");
    private final static QName _Factorial_QNAME = new QName("http://sw/", "factorial");
    private final static QName _FactorialResponse_QNAME = new QName("http://sw/", "factorialResponse");
    private final static QName _Login_QNAME = new QName("http://sw/", "login");
    private final static QName _LoginResponse_QNAME = new QName("http://sw/", "loginResponse");
    private final static QName _Multiplicacion_QNAME = new QName("http://sw/", "multiplicacion");
    private final static QName _MultiplicacionResponse_QNAME = new QName("http://sw/", "multiplicacionResponse");
    private final static QName _Resta_QNAME = new QName("http://sw/", "resta");
    private final static QName _RestaResponse_QNAME = new QName("http://sw/", "restaResponse");
    private final static QName _Suma_QNAME = new QName("http://sw/", "suma");
    private final static QName _SumaResponse_QNAME = new QName("http://sw/", "sumaResponse");
    private final static QName _VolumenPiramide_QNAME = new QName("http://sw/", "volumenPiramide");
    private final static QName _VolumenPiramideResponse_QNAME = new QName("http://sw/", "volumenPiramideResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: sw
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CalcularDistancia }
     * 
     */
    public CalcularDistancia createCalcularDistancia() {
        return new CalcularDistancia();
    }

    /**
     * Create an instance of {@link CalcularDistanciaResponse }
     * 
     */
    public CalcularDistanciaResponse createCalcularDistanciaResponse() {
        return new CalcularDistanciaResponse();
    }

    /**
     * Create an instance of {@link Division }
     * 
     */
    public Division createDivision() {
        return new Division();
    }

    /**
     * Create an instance of {@link DivisionResponse }
     * 
     */
    public DivisionResponse createDivisionResponse() {
        return new DivisionResponse();
    }

    /**
     * Create an instance of {@link EuroDolar }
     * 
     */
    public EuroDolar createEuroDolar() {
        return new EuroDolar();
    }

    /**
     * Create an instance of {@link EuroDolarResponse }
     * 
     */
    public EuroDolarResponse createEuroDolarResponse() {
        return new EuroDolarResponse();
    }

    /**
     * Create an instance of {@link Factorial }
     * 
     */
    public Factorial createFactorial() {
        return new Factorial();
    }

    /**
     * Create an instance of {@link FactorialResponse }
     * 
     */
    public FactorialResponse createFactorialResponse() {
        return new FactorialResponse();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link Multiplicacion }
     * 
     */
    public Multiplicacion createMultiplicacion() {
        return new Multiplicacion();
    }

    /**
     * Create an instance of {@link MultiplicacionResponse }
     * 
     */
    public MultiplicacionResponse createMultiplicacionResponse() {
        return new MultiplicacionResponse();
    }

    /**
     * Create an instance of {@link Resta }
     * 
     */
    public Resta createResta() {
        return new Resta();
    }

    /**
     * Create an instance of {@link RestaResponse }
     * 
     */
    public RestaResponse createRestaResponse() {
        return new RestaResponse();
    }

    /**
     * Create an instance of {@link Suma }
     * 
     */
    public Suma createSuma() {
        return new Suma();
    }

    /**
     * Create an instance of {@link SumaResponse }
     * 
     */
    public SumaResponse createSumaResponse() {
        return new SumaResponse();
    }

    /**
     * Create an instance of {@link VolumenPiramide }
     * 
     */
    public VolumenPiramide createVolumenPiramide() {
        return new VolumenPiramide();
    }

    /**
     * Create an instance of {@link VolumenPiramideResponse }
     * 
     */
    public VolumenPiramideResponse createVolumenPiramideResponse() {
        return new VolumenPiramideResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcularDistancia }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CalcularDistancia }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "calcularDistancia")
    public JAXBElement<CalcularDistancia> createCalcularDistancia(CalcularDistancia value) {
        return new JAXBElement<CalcularDistancia>(_CalcularDistancia_QNAME, CalcularDistancia.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcularDistanciaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CalcularDistanciaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "calcularDistanciaResponse")
    public JAXBElement<CalcularDistanciaResponse> createCalcularDistanciaResponse(CalcularDistanciaResponse value) {
        return new JAXBElement<CalcularDistanciaResponse>(_CalcularDistanciaResponse_QNAME, CalcularDistanciaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Division }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Division }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "division")
    public JAXBElement<Division> createDivision(Division value) {
        return new JAXBElement<Division>(_Division_QNAME, Division.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DivisionResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DivisionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "divisionResponse")
    public JAXBElement<DivisionResponse> createDivisionResponse(DivisionResponse value) {
        return new JAXBElement<DivisionResponse>(_DivisionResponse_QNAME, DivisionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EuroDolar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EuroDolar }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "euroDolar")
    public JAXBElement<EuroDolar> createEuroDolar(EuroDolar value) {
        return new JAXBElement<EuroDolar>(_EuroDolar_QNAME, EuroDolar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EuroDolarResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EuroDolarResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "euroDolarResponse")
    public JAXBElement<EuroDolarResponse> createEuroDolarResponse(EuroDolarResponse value) {
        return new JAXBElement<EuroDolarResponse>(_EuroDolarResponse_QNAME, EuroDolarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Factorial }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Factorial }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "factorial")
    public JAXBElement<Factorial> createFactorial(Factorial value) {
        return new JAXBElement<Factorial>(_Factorial_QNAME, Factorial.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FactorialResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FactorialResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "factorialResponse")
    public JAXBElement<FactorialResponse> createFactorialResponse(FactorialResponse value) {
        return new JAXBElement<FactorialResponse>(_FactorialResponse_QNAME, FactorialResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Login }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "loginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Multiplicacion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Multiplicacion }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "multiplicacion")
    public JAXBElement<Multiplicacion> createMultiplicacion(Multiplicacion value) {
        return new JAXBElement<Multiplicacion>(_Multiplicacion_QNAME, Multiplicacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiplicacionResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MultiplicacionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "multiplicacionResponse")
    public JAXBElement<MultiplicacionResponse> createMultiplicacionResponse(MultiplicacionResponse value) {
        return new JAXBElement<MultiplicacionResponse>(_MultiplicacionResponse_QNAME, MultiplicacionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Resta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Resta }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "resta")
    public JAXBElement<Resta> createResta(Resta value) {
        return new JAXBElement<Resta>(_Resta_QNAME, Resta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RestaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RestaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "restaResponse")
    public JAXBElement<RestaResponse> createRestaResponse(RestaResponse value) {
        return new JAXBElement<RestaResponse>(_RestaResponse_QNAME, RestaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Suma }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Suma }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "suma")
    public JAXBElement<Suma> createSuma(Suma value) {
        return new JAXBElement<Suma>(_Suma_QNAME, Suma.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SumaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SumaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "sumaResponse")
    public JAXBElement<SumaResponse> createSumaResponse(SumaResponse value) {
        return new JAXBElement<SumaResponse>(_SumaResponse_QNAME, SumaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VolumenPiramide }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VolumenPiramide }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "volumenPiramide")
    public JAXBElement<VolumenPiramide> createVolumenPiramide(VolumenPiramide value) {
        return new JAXBElement<VolumenPiramide>(_VolumenPiramide_QNAME, VolumenPiramide.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VolumenPiramideResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VolumenPiramideResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://sw/", name = "volumenPiramideResponse")
    public JAXBElement<VolumenPiramideResponse> createVolumenPiramideResponse(VolumenPiramideResponse value) {
        return new JAXBElement<VolumenPiramideResponse>(_VolumenPiramideResponse_QNAME, VolumenPiramideResponse.class, null, value);
    }

}
