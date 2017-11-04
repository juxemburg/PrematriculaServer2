
package prematriculaClient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoIdentificacion.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tipoIdentificacion">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CEDULA"/>
 *     &lt;enumeration value="TARJETAIDENTIDAD"/>
 *     &lt;enumeration value="CEDULADEEXTRANJERIA"/>
 *     &lt;enumeration value="PASAPORTE"/>
 *     &lt;enumeration value="REGISTROCIVIL"/>
 *     &lt;enumeration value="NUMEROIDENTIFICACI�NPERSONAL"/>
 *     &lt;enumeration value="NUMEROUNICOIDENTIFICACIONPERSONAL"/>
 *     &lt;enumeration value="NUMEROPORSECRETARIADEEDUCACION"/>
 *     &lt;enumeration value="CERTIFICADOCABILDO"/>
 *     &lt;enumeration value="TARJETAPROFESIONAL"/>
 *     &lt;enumeration value="SERVICIONACIONALDEPRUEBAS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tipoIdentificacion")
@XmlEnum
public enum TipoIdentificacion {

    CEDULA,
    TARJETAIDENTIDAD,
    CEDULADEEXTRANJERIA,
    PASAPORTE,
    REGISTROCIVIL,
    NUMEROIDENTIFICACIÓNPERSONAL,
    NUMEROUNICOIDENTIFICACIONPERSONAL,
    NUMEROPORSECRETARIADEEDUCACION,
    CERTIFICADOCABILDO,
    TARJETAPROFESIONAL,
    SERVICIONACIONALDEPRUEBAS;

    public String value() {
        return name();
    }

    public static TipoIdentificacion fromValue(String v) {
        return valueOf(v);
    }

}
