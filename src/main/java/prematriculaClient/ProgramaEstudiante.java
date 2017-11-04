
package prematriculaClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for programaEstudiante complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="programaEstudiante">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoestudiantil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idpensum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idprograma" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nombrepensum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreprograma" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "programaEstudiante", propOrder = {
    "codigoestudiantil",
    "estado",
    "idpensum",
    "idprograma",
    "nombrepensum",
    "nombreprograma",
    "tipo"
})
public class ProgramaEstudiante {

    protected String codigoestudiantil;
    protected String estado;
    protected int idpensum;
    protected int idprograma;
    protected String nombrepensum;
    protected String nombreprograma;
    protected String tipo;

    /**
     * Gets the value of the codigoestudiantil property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoestudiantil() {
        return codigoestudiantil;
    }

    /**
     * Sets the value of the codigoestudiantil property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoestudiantil(String value) {
        this.codigoestudiantil = value;
    }

    /**
     * Gets the value of the estado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Sets the value of the estado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstado(String value) {
        this.estado = value;
    }

    /**
     * Gets the value of the idpensum property.
     * 
     */
    public int getIdpensum() {
        return idpensum;
    }

    /**
     * Sets the value of the idpensum property.
     * 
     */
    public void setIdpensum(int value) {
        this.idpensum = value;
    }

    /**
     * Gets the value of the idprograma property.
     * 
     */
    public int getIdprograma() {
        return idprograma;
    }

    /**
     * Sets the value of the idprograma property.
     * 
     */
    public void setIdprograma(int value) {
        this.idprograma = value;
    }

    /**
     * Gets the value of the nombrepensum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombrepensum() {
        return nombrepensum;
    }

    /**
     * Sets the value of the nombrepensum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombrepensum(String value) {
        this.nombrepensum = value;
    }

    /**
     * Gets the value of the nombreprograma property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreprograma() {
        return nombreprograma;
    }

    /**
     * Sets the value of the nombreprograma property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreprograma(String value) {
        this.nombreprograma = value;
    }

    /**
     * Gets the value of the tipo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Sets the value of the tipo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipo(String value) {
        this.tipo = value;
    }

}
