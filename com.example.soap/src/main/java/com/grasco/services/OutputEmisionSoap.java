
package com.grasco.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para outputEmisionSoap complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="outputEmisionSoap"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fueprocesado" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="msjerror" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "outputEmisionSoap", propOrder = {
    "fueprocesado",
    "msjerror"
})
public class OutputEmisionSoap {

    protected boolean fueprocesado;
    protected String msjerror;

    /**
     * Obtiene el valor de la propiedad fueprocesado.
     * 
     */
    public boolean isFueprocesado() {
        return fueprocesado;
    }

    /**
     * Define el valor de la propiedad fueprocesado.
     * 
     */
    public void setFueprocesado(boolean value) {
        this.fueprocesado = value;
    }

    /**
     * Obtiene el valor de la propiedad msjerror.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsjerror() {
        return msjerror;
    }

    /**
     * Define el valor de la propiedad msjerror.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsjerror(String value) {
        this.msjerror = value;
    }

}
