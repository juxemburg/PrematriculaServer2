
package prematriculaClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for materia complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="materia">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="activa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigomateria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="condiciones" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="correquisitos" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="creditos" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="electiva" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="escorrequisitode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fechaEdicionMicrocurriculo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="horassemana" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="laboratorio" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="materia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="microcurriculoDisponible" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="oidelectiva" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="oidmateria" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="oidmateriaPensum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="oidprograma" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="semestre" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "materia", propOrder = {
    "activa",
    "codigomateria",
    "condiciones",
    "correquisitos",
    "creditos",
    "electiva",
    "escorrequisitode",
    "estado",
    "fechaEdicionMicrocurriculo",
    "horassemana",
    "laboratorio",
    "materia",
    "microcurriculoDisponible",
    "oidelectiva",
    "oidmateria",
    "oidmateriaPensum",
    "oidprograma",
    "semestre"
})
public class Materia {

    protected String activa;
    protected String codigomateria;
    protected int condiciones;
    protected int correquisitos;
    protected int creditos;
    protected String electiva;
    protected int escorrequisitode;
    protected int estado;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaEdicionMicrocurriculo;
    protected int horassemana;
    protected boolean laboratorio;
    protected String materia;
    protected boolean microcurriculoDisponible;
    protected int oidelectiva;
    protected int oidmateria;
    protected int oidmateriaPensum;
    protected int oidprograma;
    protected int semestre;

    /**
     * Gets the value of the activa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActiva() {
        return activa;
    }

    /**
     * Sets the value of the activa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActiva(String value) {
        this.activa = value;
    }

    /**
     * Gets the value of the codigomateria property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigomateria() {
        return codigomateria;
    }

    /**
     * Sets the value of the codigomateria property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigomateria(String value) {
        this.codigomateria = value;
    }

    /**
     * Gets the value of the condiciones property.
     * 
     */
    public int getCondiciones() {
        return condiciones;
    }

    /**
     * Sets the value of the condiciones property.
     * 
     */
    public void setCondiciones(int value) {
        this.condiciones = value;
    }

    /**
     * Gets the value of the correquisitos property.
     * 
     */
    public int getCorrequisitos() {
        return correquisitos;
    }

    /**
     * Sets the value of the correquisitos property.
     * 
     */
    public void setCorrequisitos(int value) {
        this.correquisitos = value;
    }

    /**
     * Gets the value of the creditos property.
     * 
     */
    public int getCreditos() {
        return creditos;
    }

    /**
     * Sets the value of the creditos property.
     * 
     */
    public void setCreditos(int value) {
        this.creditos = value;
    }

    /**
     * Gets the value of the electiva property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElectiva() {
        return electiva;
    }

    /**
     * Sets the value of the electiva property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElectiva(String value) {
        this.electiva = value;
    }

    /**
     * Gets the value of the escorrequisitode property.
     * 
     */
    public int getEscorrequisitode() {
        return escorrequisitode;
    }

    /**
     * Sets the value of the escorrequisitode property.
     * 
     */
    public void setEscorrequisitode(int value) {
        this.escorrequisitode = value;
    }

    /**
     * Gets the value of the estado property.
     * 
     */
    public int getEstado() {
        return estado;
    }

    /**
     * Sets the value of the estado property.
     * 
     */
    public void setEstado(int value) {
        this.estado = value;
    }

    /**
     * Gets the value of the fechaEdicionMicrocurriculo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaEdicionMicrocurriculo() {
        return fechaEdicionMicrocurriculo;
    }

    /**
     * Sets the value of the fechaEdicionMicrocurriculo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaEdicionMicrocurriculo(XMLGregorianCalendar value) {
        this.fechaEdicionMicrocurriculo = value;
    }

    /**
     * Gets the value of the horassemana property.
     * 
     */
    public int getHorassemana() {
        return horassemana;
    }

    /**
     * Sets the value of the horassemana property.
     * 
     */
    public void setHorassemana(int value) {
        this.horassemana = value;
    }

    /**
     * Gets the value of the laboratorio property.
     * 
     */
    public boolean isLaboratorio() {
        return laboratorio;
    }

    /**
     * Sets the value of the laboratorio property.
     * 
     */
    public void setLaboratorio(boolean value) {
        this.laboratorio = value;
    }

    /**
     * Gets the value of the materia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMateria() {
        return materia;
    }

    /**
     * Sets the value of the materia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMateria(String value) {
        this.materia = value;
    }

    /**
     * Gets the value of the microcurriculoDisponible property.
     * 
     */
    public boolean isMicrocurriculoDisponible() {
        return microcurriculoDisponible;
    }

    /**
     * Sets the value of the microcurriculoDisponible property.
     * 
     */
    public void setMicrocurriculoDisponible(boolean value) {
        this.microcurriculoDisponible = value;
    }

    /**
     * Gets the value of the oidelectiva property.
     * 
     */
    public int getOidelectiva() {
        return oidelectiva;
    }

    /**
     * Sets the value of the oidelectiva property.
     * 
     */
    public void setOidelectiva(int value) {
        this.oidelectiva = value;
    }

    /**
     * Gets the value of the oidmateria property.
     * 
     */
    public int getOidmateria() {
        return oidmateria;
    }

    /**
     * Sets the value of the oidmateria property.
     * 
     */
    public void setOidmateria(int value) {
        this.oidmateria = value;
    }

    /**
     * Gets the value of the oidmateriaPensum property.
     * 
     */
    public int getOidmateriaPensum() {
        return oidmateriaPensum;
    }

    /**
     * Sets the value of the oidmateriaPensum property.
     * 
     */
    public void setOidmateriaPensum(int value) {
        this.oidmateriaPensum = value;
    }

    /**
     * Gets the value of the oidprograma property.
     * 
     */
    public int getOidprograma() {
        return oidprograma;
    }

    /**
     * Sets the value of the oidprograma property.
     * 
     */
    public void setOidprograma(int value) {
        this.oidprograma = value;
    }

    /**
     * Gets the value of the semestre property.
     * 
     */
    public int getSemestre() {
        return semestre;
    }

    /**
     * Sets the value of the semestre property.
     * 
     */
    public void setSemestre(int value) {
        this.semestre = value;
    }

}
