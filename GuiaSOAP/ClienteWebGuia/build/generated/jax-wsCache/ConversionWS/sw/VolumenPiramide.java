
package sw;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para volumenPiramide complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="volumenPiramide"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="base" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="altura" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "volumenPiramide", propOrder = {
    "base",
    "altura"
})
public class VolumenPiramide {

    protected Double base;
    protected Double altura;

    /**
     * Obtiene el valor de la propiedad base.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBase() {
        return base;
    }

    /**
     * Define el valor de la propiedad base.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBase(Double value) {
        this.base = value;
    }

    /**
     * Obtiene el valor de la propiedad altura.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAltura() {
        return altura;
    }

    /**
     * Define el valor de la propiedad altura.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAltura(Double value) {
        this.altura = value;
    }

}
