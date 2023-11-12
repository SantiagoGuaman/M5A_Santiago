
package sw;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para multiplicacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="multiplicacion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="value_1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="value_2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "multiplicacion", propOrder = {
    "value1",
    "value2"
})
public class Multiplicacion {

    @XmlElement(name = "value_1")
    protected Double value1;
    @XmlElement(name = "value_2")
    protected Double value2;

    /**
     * Obtiene el valor de la propiedad value1.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValue1() {
        return value1;
    }

    /**
     * Define el valor de la propiedad value1.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValue1(Double value) {
        this.value1 = value;
    }

    /**
     * Obtiene el valor de la propiedad value2.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValue2() {
        return value2;
    }

    /**
     * Define el valor de la propiedad value2.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValue2(Double value) {
        this.value2 = value;
    }

}
