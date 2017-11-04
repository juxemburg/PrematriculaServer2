
package prematriculaClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for nota complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="nota">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="anulado" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="codigoEstudiante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creditos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cualitativa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="definitiva" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="habilitacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="materia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="noPresento" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="nombreEstudiante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nota" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oidEstudiante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oidGrupo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oidMateria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="periodo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="posicion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="promedia" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="recibo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reconocimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requisitoGrado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="semestre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="soloLectura" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="tiponota" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nota", propOrder = {
    "anulado",
    "codigoEstudiante",
    "creditos",
    "cualitativa",
    "definitiva",
    "estado",
    "fecha",
    "habilitacion",
    "materia",
    "noPresento",
    "nombreEstudiante",
    "nota",
    "oidEstudiante",
    "oidGrupo",
    "oidMateria",
    "periodo",
    "posicion",
    "promedia",
    "recibo",
    "reconocimiento",
    "requisitoGrado",
    "semestre",
    "soloLectura",
    "tiponota",
    "usuario"
})
public class Nota {

    protected boolean anulado;
    protected String codigoEstudiante;
    protected String creditos;
    protected String cualitativa;
    protected String definitiva;
    protected int estado;
    protected String fecha;
    protected String habilitacion;
    protected String materia;
    protected boolean noPresento;
    protected String nombreEstudiante;
    protected String nota;
    protected String oidEstudiante;
    protected String oidGrupo;
    protected String oidMateria;
    protected String periodo;
    protected int posicion;
    protected boolean promedia;
    protected String recibo;
    protected String reconocimiento;
    protected String requisitoGrado;
    protected String semestre;
    protected boolean soloLectura;
    protected String tiponota;
    protected String usuario;

    /**
     * Gets the value of the anulado property.
     * 
     */
    public boolean isAnulado() {
        return anulado;
    }

    /**
     * Sets the value of the anulado property.
     * 
     */
    public void setAnulado(boolean value) {
        this.anulado = value;
    }

    /**
     * Gets the value of the codigoEstudiante property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoEstudiante() {
        return codigoEstudiante;
    }

    /**
     * Sets the value of the codigoEstudiante property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoEstudiante(String value) {
        this.codigoEstudiante = value;
    }

    /**
     * Gets the value of the creditos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditos() {
        return creditos;
    }

    /**
     * Sets the value of the creditos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditos(String value) {
        this.creditos = value;
    }

    /**
     * Gets the value of the cualitativa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCualitativa() {
        return cualitativa;
    }

    /**
     * Sets the value of the cualitativa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCualitativa(String value) {
        this.cualitativa = value;
    }

    /**
     * Gets the value of the definitiva property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefinitiva() {
        return definitiva;
    }

    /**
     * Sets the value of the definitiva property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefinitiva(String value) {
        this.definitiva = value;
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
     * Gets the value of the fecha property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Sets the value of the fecha property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecha(String value) {
        this.fecha = value;
    }

    /**
     * Gets the value of the habilitacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHabilitacion() {
        return habilitacion;
    }

    /**
     * Sets the value of the habilitacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHabilitacion(String value) {
        this.habilitacion = value;
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
     * Gets the value of the noPresento property.
     * 
     */
    public boolean isNoPresento() {
        return noPresento;
    }

    /**
     * Sets the value of the noPresento property.
     * 
     */
    public void setNoPresento(boolean value) {
        this.noPresento = value;
    }

    /**
     * Gets the value of the nombreEstudiante property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    /**
     * Sets the value of the nombreEstudiante property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreEstudiante(String value) {
        this.nombreEstudiante = value;
    }

    /**
     * Gets the value of the nota property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNota() {
        return nota;
    }

    /**
     * Sets the value of the nota property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNota(String value) {
        this.nota = value;
    }

    /**
     * Gets the value of the oidEstudiante property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOidEstudiante() {
        return oidEstudiante;
    }

    /**
     * Sets the value of the oidEstudiante property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOidEstudiante(String value) {
        this.oidEstudiante = value;
    }

    /**
     * Gets the value of the oidGrupo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOidGrupo() {
        return oidGrupo;
    }

    /**
     * Sets the value of the oidGrupo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOidGrupo(String value) {
        this.oidGrupo = value;
    }

    /**
     * Gets the value of the oidMateria property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOidMateria() {
        return oidMateria;
    }

    /**
     * Sets the value of the oidMateria property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOidMateria(String value) {
        this.oidMateria = value;
    }

    /**
     * Gets the value of the periodo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodo() {
        return periodo;
    }

    /**
     * Sets the value of the periodo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodo(String value) {
        this.periodo = value;
    }

    /**
     * Gets the value of the posicion property.
     * 
     */
    public int getPosicion() {
        return posicion;
    }

    /**
     * Sets the value of the posicion property.
     * 
     */
    public void setPosicion(int value) {
        this.posicion = value;
    }

    /**
     * Gets the value of the promedia property.
     * 
     */
    public boolean isPromedia() {
        return promedia;
    }

    /**
     * Sets the value of the promedia property.
     * 
     */
    public void setPromedia(boolean value) {
        this.promedia = value;
    }

    /**
     * Gets the value of the recibo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecibo() {
        return recibo;
    }

    /**
     * Sets the value of the recibo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecibo(String value) {
        this.recibo = value;
    }

    /**
     * Gets the value of the reconocimiento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReconocimiento() {
        return reconocimiento;
    }

    /**
     * Sets the value of the reconocimiento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReconocimiento(String value) {
        this.reconocimiento = value;
    }

    /**
     * Gets the value of the requisitoGrado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequisitoGrado() {
        return requisitoGrado;
    }

    /**
     * Sets the value of the requisitoGrado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequisitoGrado(String value) {
        this.requisitoGrado = value;
    }

    /**
     * Gets the value of the semestre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSemestre() {
        return semestre;
    }

    /**
     * Sets the value of the semestre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSemestre(String value) {
        this.semestre = value;
    }

    /**
     * Gets the value of the soloLectura property.
     * 
     */
    public boolean isSoloLectura() {
        return soloLectura;
    }

    /**
     * Sets the value of the soloLectura property.
     * 
     */
    public void setSoloLectura(boolean value) {
        this.soloLectura = value;
    }

    /**
     * Gets the value of the tiponota property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTiponota() {
        return tiponota;
    }

    /**
     * Sets the value of the tiponota property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTiponota(String value) {
        this.tiponota = value;
    }

    /**
     * Gets the value of the usuario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Sets the value of the usuario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuario(String value) {
        this.usuario = value;
    }

}
