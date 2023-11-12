
package sw;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para euroDolar complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="euroDolar"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="euro" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "euroDolar", propOrder = {
    "euro"
})
public class EuroDolar {

    protected Double euro;

    /**
     * Obtiene el valor de la propiedad euro.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEuro() {
        return euro;
    }

    /**
     * Define el valor de la propiedad euro.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEuro(Double value) {
        this.euro = value;
    }

}
