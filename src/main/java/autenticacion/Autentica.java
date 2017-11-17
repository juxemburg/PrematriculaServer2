/**
 * Ivan Taimal - Gonzalo Acte - Carlos Cabrera
 * Universidad del Cauca - Division TIC 2013
 * 
 * Esta clase es confidencial y para uso de las aplicaciones de la Universidad del Cauca.
 * Prohibido su uso sin autorización explícita de personal autorizado de la Universidad del Cauca
 */

package autenticacion;

import java.io.Serializable;


/**
 * Esta clase se encarga de realizar la autenticación de un usuario utilizando
 * el protocolo LDAP.
 * 
 * @author Ivan Taimal
 * @author Gonzalo acte
 */
public class Autentica implements Serializable {

    /**
     * Default serial version
     */
    private static final long serialVersionUID = 1L;

    /**
     * Este método se encarga de validar el usuario y la contrasenia utilizando
     * el protocolo LDAP.
     * 
     * @param login
     *            Usuario de Unicauca para autenticar
     * @param password
     *            Contrasenia de Unicauca asociada al usuario que se desea
     *            autenticar
     * @return True si la autenticación fué exitosa o False en caso contrario
     */
    public int getResultado(String login, String password) {

        int respuesta = 0;

        /** Se asegura que el login y password no sean nulos*/
        if (login != null && !login.equals("") && password != null
                && !password.equals("")) {

            // Instancia un objeto de tipo LDAP
            Ldap ldap = new Ldap();

            // Fija los argumentos
            ldap.setUserName(login);
            ldap.setPassWord(password);

            // Realiza la autenticación
            ldap.hacebind();

            // Fija el id
            ldap.setIdcompleto(ldap.getIdcompleto());

            ldap.haceaut();

            // Obtiene el resultado de la autenticación
            
            
            respuesta = ldap.getResultado();
        }
        return respuesta;
    }

}