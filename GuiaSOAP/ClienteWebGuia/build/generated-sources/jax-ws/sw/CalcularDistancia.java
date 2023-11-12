
package sw;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para calcularDistancia complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="calcularDistancia"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="velocidad" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="tiempo" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calcularDistancia", propOrder = {
    "velocidad",
    "tiempo"
})
public class CalcularDistancia {

    protected Double velocidad;
    protected Double tiempo;

    /**
     * Obtiene el valor de la propiedad velocidad.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVelocidad() {
        return velocidad;
    }

    /**
     * Define el valor de la propiedad velocidad.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVelocidad(Double value) {
        this.velocidad = value;
    }

    /**
     * Obtiene el valor de la propiedad tiempo.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTiempo() {
        return tiempo;
    }

    /**
     * Define el valor de la propiedad tiempo.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTiempo(Double value) {
        this.tiempo = value;
    }

}
