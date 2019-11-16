
package com.grasco.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para addEmision complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="addEmision"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="uuid"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="idtransaccion"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="cunidadnegocio"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="nit_proveedortecnologico"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="url_proveedortecnologico"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="usr_proveedortecnologico"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="psswd_proveedortecnologico"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="tt_operabilidad"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="tt_xslt"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addEmision", propOrder = {
    "uuid",
    "idtransaccion",
    "cunidadnegocio",
    "nitProveedortecnologico",
    "urlProveedortecnologico",
    "usrProveedortecnologico",
    "psswdProveedortecnologico",
    "ttOperabilidad",
    "ttXslt"
})
public class AddEmision {

    @XmlElement(required = true)
    protected String uuid;
    @XmlElement(required = true)
    protected String idtransaccion;
    @XmlElement(required = true)
    protected String cunidadnegocio;
    @XmlElement(name = "nit_proveedortecnologico", required = true)
    protected String nitProveedortecnologico;
    @XmlElement(name = "url_proveedortecnologico", required = true)
    protected String urlProveedortecnologico;
    @XmlElement(name = "usr_proveedortecnologico", required = true)
    protected String usrProveedortecnologico;
    @XmlElement(name = "psswd_proveedortecnologico", required = true)
    protected String psswdProveedortecnologico;
    @XmlElement(name = "tt_operabilidad", required = true)
    protected String ttOperabilidad;
    @XmlElement(name = "tt_xslt", required = true)
    protected String ttXslt;

    /**
     * Obtiene el valor de la propiedad uuid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * Define el valor de la propiedad uuid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUuid(String value) {
        this.uuid = value;
    }

    /**
     * Obtiene el valor de la propiedad idtransaccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdtransaccion() {
        return idtransaccion;
    }

    /**
     * Define el valor de la propiedad idtransaccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdtransaccion(String value) {
        this.idtransaccion = value;
    }

    /**
     * Obtiene el valor de la propiedad cunidadnegocio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCunidadnegocio() {
        return cunidadnegocio;
    }

    /**
     * Define el valor de la propiedad cunidadnegocio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCunidadnegocio(String value) {
        this.cunidadnegocio = value;
    }

    /**
     * Obtiene el valor de la propiedad nitProveedortecnologico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNitProveedortecnologico() {
        return nitProveedortecnologico;
    }

    /**
     * Define el valor de la propiedad nitProveedortecnologico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNitProveedortecnologico(String value) {
        this.nitProveedortecnologico = value;
    }

    /**
     * Obtiene el valor de la propiedad urlProveedortecnologico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlProveedortecnologico() {
        return urlProveedortecnologico;
    }

    /**
     * Define el valor de la propiedad urlProveedortecnologico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlProveedortecnologico(String value) {
        this.urlProveedortecnologico = value;
    }

    /**
     * Obtiene el valor de la propiedad usrProveedortecnologico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsrProveedortecnologico() {
        return usrProveedortecnologico;
    }

    /**
     * Define el valor de la propiedad usrProveedortecnologico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsrProveedortecnologico(String value) {
        this.usrProveedortecnologico = value;
    }

    /**
     * Obtiene el valor de la propiedad psswdProveedortecnologico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPsswdProveedortecnologico() {
        return psswdProveedortecnologico;
    }

    /**
     * Define el valor de la propiedad psswdProveedortecnologico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPsswdProveedortecnologico(String value) {
        this.psswdProveedortecnologico = value;
    }

    /**
     * Obtiene el valor de la propiedad ttOperabilidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTtOperabilidad() {
        return ttOperabilidad;
    }

    /**
     * Define el valor de la propiedad ttOperabilidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTtOperabilidad(String value) {
        this.ttOperabilidad = value;
    }

    /**
     * Obtiene el valor de la propiedad ttXslt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTtXslt() {
        return ttXslt;
    }

    /**
     * Define el valor de la propiedad ttXslt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTtXslt(String value) {
        this.ttXslt = value;
    }

}
