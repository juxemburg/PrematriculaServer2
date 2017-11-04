
package prematriculaClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for materiaEquivalente complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="materiaEquivalente">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codequivalente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codmateriaprograma" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="equivalente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idequivalente" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idmateriaprograma" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="materiaprograma" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "materiaEquivalente", propOrder = {
    "codequivalente",
    "codmateriaprograma",
    "equivalente",
    "idequivalente",
    "idmateriaprograma",
    "materiaprograma"
})
public class MateriaEquivalente {

    protected String codequivalente;
    protected String codmateriaprograma;
    protected String equivalente;
    protected int idequivalente;
    protected int idmateriaprograma;
    protected String materiaprograma;

    /**
     * Gets the value of the codequivalente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodequivalente() {
        return codequivalente;
    }

    /**
     * Sets the value of the codequivalente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodequivalente(String value) {
        this.codequivalente = value;
    }

    /**
     * Gets the value of the codmateriaprograma property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodmateriaprograma() {
        return codmateriaprograma;
    }

    /**
     * Sets the value of the codmateriaprograma property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodmateriaprograma(String value) {
        this.codmateriaprograma = value;
    }

    /**
     * Gets the value of the equivalente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquivalente() {
        return equivalente;
    }

    /**
     * Sets the value of the equivalente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquivalente(String value) {
        this.equivalente = value;
    }

    /**
     * Gets the value of the idequivalente property.
     * 
     */
    public int getIdequivalente() {
        return idequivalente;
    }

    /**
     * Sets the value of the idequivalente property.
     * 
     */
    public void setIdequivalente(int value) {
        this.idequivalente = value;
    }

    /**
     * Gets the value of the idmateriaprograma property.
     * 
     */
    public int getIdmateriaprograma() {
        return idmateriaprograma;
    }

    /**
     * Sets the value of the idmateriaprograma property.
     * 
     */
    public void setIdmateriaprograma(int value) {
        this.idmateriaprograma = value;
    }

    /**
     * Gets the value of the materiaprograma property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMateriaprograma() {
        return materiaprograma;
    }

    /**
     * Sets the value of the materiaprograma property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMateriaprograma(String value) {
        this.materiaprograma = value;
    }

}
