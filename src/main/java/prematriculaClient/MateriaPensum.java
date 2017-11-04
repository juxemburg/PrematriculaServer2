
package prematriculaClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for materiaPensum complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="materiaPensum">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigomateria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creditos" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="materia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="materiasCorrequisito" type="{http://control.prematriculas.unicauca.edu.co/}materia" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="materiasPrerrequisito" type="{http://control.prematriculas.unicauca.edu.co/}materia" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="microcurriculoDisponible" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="oidmateria" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="requisitogrado" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
@XmlType(name = "materiaPensum", propOrder = {
    "codigomateria",
    "creditos",
    "materia",
    "materiasCorrequisito",
    "materiasPrerrequisito",
    "microcurriculoDisponible",
    "oidmateria",
    "requisitogrado",
    "semestre"
})
public class MateriaPensum {

    protected String codigomateria;
    protected int creditos;
    protected String materia;
    @XmlElement(nillable = true)
    protected List<Materia> materiasCorrequisito;
    @XmlElement(nillable = true)
    protected List<Materia> materiasPrerrequisito;
    protected boolean microcurriculoDisponible;
    protected int oidmateria;
    protected boolean requisitogrado;
    protected int semestre;

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
     * Gets the value of the materiasCorrequisito property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the materiasCorrequisito property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMateriasCorrequisito().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Materia }
     * 
     * 
     */
    public List<Materia> getMateriasCorrequisito() {
        if (materiasCorrequisito == null) {
            materiasCorrequisito = new ArrayList<Materia>();
        }
        return this.materiasCorrequisito;
    }

    /**
     * Gets the value of the materiasPrerrequisito property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the materiasPrerrequisito property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMateriasPrerrequisito().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Materia }
     * 
     * 
     */
    public List<Materia> getMateriasPrerrequisito() {
        if (materiasPrerrequisito == null) {
            materiasPrerrequisito = new ArrayList<Materia>();
        }
        return this.materiasPrerrequisito;
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
     * Gets the value of the requisitogrado property.
     * 
     */
    public boolean isRequisitogrado() {
        return requisitogrado;
    }

    /**
     * Sets the value of the requisitogrado property.
     * 
     */
    public void setRequisitogrado(boolean value) {
        this.requisitogrado = value;
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
