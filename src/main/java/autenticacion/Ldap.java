/**
 * Universidad del Cauca - Division TIC 2014
 * 
 * Esta clase es confidencial y para uso de las aplicaciones de la Universidad del Cauca.
 * Prohibido su uso sin autorización explícita de personal autorizado de la Universidad del Cauca
 */
package autenticacion;



import javax.faces.context.FacesContext;
import javax.naming.*;
import javax.naming.directory.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.Hashtable;
import java.util.Properties;

/**
 * Clase para conexión con el directorio LDAP
 * TODO: Realizar conexión con el directorio activo utilizando las credenciales del usuario
 * @author Ivan Taimal
 * @author Gonzalo Acte
 * @author Carlos Cabrera
 * @author Victor Zapata
 *
 */
public class Ldap implements Serializable{
	
	/**
	 * Default serial version
	 */
	private static final long serialVersionUID = 1L;
	private static final String CONFIG_FILE_DIRECTORY = "autenticacion/";
	private static final String CONFIG_FILE_NAME = "configuration.properties";
	private Properties prop;
	
	private InitialDirContext ctx = null;
	private String userName;
	private String passWord;
	private String idcompleto;
	private String base = "dc=unicauca,dc=edu,dc=co";
	/**
	 * Variable resultado
	 * Múltiples valores para determinar qué error ocurrió en la autenticación.
	 * 0 = Inicial - No autenticado
	 * 1 = Autenticado
	 * 2 = Credenciales erróneas
	 * 3 = Error de servidor
	 */
	
	private int resultado;

	public  Ldap(){		
		this.userName="";
		this.passWord="";
		this.passWord="";
		this.resultado=0;
		this.idcompleto="";
		prop = new Properties();

		//Todo: Cambiar por credenciales de producción
        prop.setProperty("ServidorLDAP","ldap://10.20.6.135:389/");
		prop.setProperty("servidorLDAP","ldap://10.20.6.135:389/");
		String url = "cn=Tester,dc=unicauca,dc=edu,dc=co";
        prop.setProperty("usuarioLDAP",url);
        prop.setProperty("contraseniaLDAP","T3st3R_Un1");
//		prop = this.cargarArchivoPropiedades();
	} 
	
	public boolean hacebind(){
		boolean bound=true;
		DirContext srchContext = null;
		Hashtable<String, String> srchEnv = new Hashtable<String, String>(11);
		srchEnv.put(Context.INITIAL_CONTEXT_FACTORY,"com.sun.jndi.ldap.LdapCtxFactory");
		srchEnv.put(Context.PROVIDER_URL, prop.getProperty("servidorLDAP"));
		srchEnv.put(Context.SECURITY_AUTHENTICATION, "simple");
		srchEnv.put(Context.SECURITY_PRINCIPAL, prop.getProperty("usuarioLDAP"));
		srchEnv.put(Context.SECURITY_CREDENTIALS, prop.getProperty("contraseniaLDAP"));
		try {
			String[] returnAttribute = {"dn"};
			SearchControls srchControls = new SearchControls();
			srchControls.setReturningAttributes(returnAttribute);
			srchControls.setSearchScope(SearchControls.SUBTREE_SCOPE);
			String searchFilter = "(uid=" + this.userName + ")";			
			srchContext = new InitialDirContext(srchEnv);
			NamingEnumeration<?> srchResponse = srchContext.search(base, searchFilter, srchControls);
			// Probably want to test for nulls here
			if (srchResponse.hasMore()==false){
				srchContext.close();
				bound=false;
			} else {
				String distName = srchResponse.nextElement().toString();
				String [] valores = distName.split(":"); 
				//System.out.println("DN : " + valores[0]);
				this.idcompleto = valores[0]+","+base;
				srchContext.close();
			}
		} catch (NamingException namEx) {
			namEx.printStackTrace();
			this.idcompleto ="";
			bound=false;
		}
		return bound;
	}
	
	public void haceaut(){		
		Hashtable<String, String> authEnv = new Hashtable<String, String>(11);
		authEnv.put(Context.INITIAL_CONTEXT_FACTORY,"com.sun.jndi.ldap.LdapCtxFactory");
		authEnv.put(Context.PROVIDER_URL, prop.getProperty("servidorLDAP"));
		authEnv.put(Context.SECURITY_PRINCIPAL, this.idcompleto);
		authEnv.put(Context.SECURITY_CREDENTIALS, this.passWord);
		
//		HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
		
		try {
			@SuppressWarnings("unused")
			DirContext authContext = new InitialDirContext(authEnv); 
			resultado=1; //Autenticación correcta
			System.out.println("Autenticación correcta. Usuario: "+userName+" IP: ");
		} catch (AuthenticationException authEx) {
			System.out.println("Autenticación errada - Credenciales erroneas (2). Usuario: "+userName+" IP: ");
			resultado=2; //Credenciales erróneas
		} catch (NamingException namEx) {
			System.err.println("Autenticación errada - Error en el servidor LDAP (3). Usuario: "+userName+" IP: ");
			resultado=3; //Otra excepción - Error de servidor - Error en el LDAP
			namEx.printStackTrace();
		}
	}
	
	public void depura(String cadena) // codigo para unificar salidas
	{
		System.out.println(cadena);
	}
	public void ejecuta()
	{
		String target = "";		
		Properties env = System.getProperties();		
		env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
		env.put(Context.PROVIDER_URL, "ldap://juno.unicauca.edu.co:389/ou=Contratistas,ou=Usuarios,dc=unicauca,dc=edu,dc=co");
		env.put(Context.SECURITY_PRINCIPAL, prop.getProperty("usuarioLDAP"));
		env.put(Context.SECURITY_CREDENTIALS, prop.getProperty("contraseniaLDAP"));		
		try
		{
			ctx = new InitialDirContext(env);
			depura ("El DN es: " + ctx.getNameInNamespace());
			muestraLista(target, ctx.list(target));
			ctx.close();
		}
		catch (Exception e)
		{
			depura("Excepcion EN BUCLE PRINCIPAL");
			e.printStackTrace();
		}
		
		
	}
//	para el DN que se pone en PROVIDER_URL, recorre todos los elementos
	void muestraLista(String msg, NamingEnumeration<?> nl)
	{
		//System.out.println("Sacamos lista de elementos para: " + msg);		
		if (nl == null)
		{
			//System.out.println("No hay Elementos en la lista");
		}
		else
		{
			try
			{
				// recorrer la enumeracion
				while (nl.hasMore())
				{
					Object objeto = nl.next();
					NameClassPair parNombre = null;					
					depura("Detalle del Objeto" + objeto.getClass().getName());					
					// nos aseguramos que es objeto del tipo adecuado
					if (objeto instanceof NameClassPair)
					{
						// depura ("Es un javax.naming.NameClassPair");
						parNombre = (NameClassPair) objeto;
					}
					else
					{
						depura("No es un nombre");
						return;
					}					
					// Cojer el nombre
					String nombre = parNombre.getName();
					depura("El nombre recogido es " + nombre);
					listaAtributos(ctx,nombre);
				}
			}
			catch (NamingException e){e.printStackTrace();}
		}
	}
	
	void listaAtributos (DirContext localContext, String cadena)
	{
		try
		{
			// se puede mejorar pasandole un array con el nombre de los atributos a recoger
			Attributes attr = localContext.getAttributes(cadena);			
			// recuperamos una enumeracion con todos los atributos
			NamingEnumeration<?> nl = attr.getAll();			
			if (nl == null)
			{
				depura("lista de atributos nula");
				return;
			}
			while (nl.hasMore())
			{
				Object objeto = nl.next(); // recorremos todos los tributos				
				if (objeto instanceof Attribute)
				{
					// cojemos un atributo especifico
					Attribute internalAttr = (Attribute)objeto;
					depura("\tAtributo = " + internalAttr);
				}
			}
		}
		catch (NamingException e){	e.printStackTrace();}
	}
	
	public int getResultado() {return resultado;}
	public void setResultado(int resultado) {this.resultado = resultado;}
	public String getIdcompleto() {return idcompleto;}
	public void setIdcompleto(String idcompleto) {this.idcompleto = idcompleto;}
	public String getPassWord() {return passWord;}
	public void setPassWord(String passWord) {this.passWord = passWord;}
	public String getUserName() {return userName;}
	public void setUserName(String userName) {this.userName = userName;}

	
	/**
	 * Consulta los atributos para un elemento del directorio en donde el atributo uid sea el indicado por el parámetro login
	 * @param login nombre de usuario con el cual se realizará la búsqueda en el directorio.
	 * @return listado de atributos hallados. null si no existe el objeto en el directorio
	 */
	public Attributes buscarAtributos(String login){
		Hashtable<String, String> authEnv = new Hashtable<String, String>(11);

		authEnv.put(Context.INITIAL_CONTEXT_FACTORY,"com.sun.jndi.ldap.LdapCtxFactory");
		authEnv.put(Context.PROVIDER_URL, prop.getProperty("servidorLDAP"));
		authEnv.put(Context.SECURITY_PRINCIPAL, prop.getProperty("usuarioLDAP"));
		authEnv.put(Context.SECURITY_CREDENTIALS, prop.getProperty("contraseniaLDAP"));
		authEnv.put(Context.SECURITY_AUTHENTICATION, "simple");
		Attributes atributos=null;
		try {
			DirContext ctx = new InitialDirContext(authEnv);
			String filter = "(uid=" + login + ")";
			SearchControls constraints = new SearchControls();
			constraints.setSearchScope(SearchControls.SUBTREE_SCOPE);
			NamingEnumeration<SearchResult> results = ctx.search(base,filter,constraints);

			if (results.hasMore()){
				atributos = results.next().getAttributes();
			}
		} catch (NamingException e) {
			System.err.println("Naming Exception: ldap");
			e.printStackTrace();
		}catch (Exception ex){
			System.err.println("Error en la búsqueda: " + ex.getMessage());
			ex.printStackTrace();
		}
		return atributos;
	} 
	
	/**
	 * Determina si un nombre de usuario ya existe en el directorio ldap
	 * @param login nombre de usuario que será buscado en el ldap
	 * @return el valor del atributo docNumber encontrado para el login indicado
	 * @throws NullPointerException Si no se encuentran los atributos del usuario se lanza una excepción de puntero nulo  
	 * @throws Exception Se lanza una excepción de este tipo cuando no se encuentra el atributo docNumber dentro de los atributos del usuario
	 */
	public String buscarUsuario(String login) throws Exception {
		Attributes atributos=this.buscarAtributos(login);
		if(atributos==null) throw new NullPointerException("El nombre de usuario \""+login+"\" no existe en el directorio LDAP");
		String atributo = "docNumber";
		String valor= "";
		try {
			if (atributos.get(atributo) != null) {
				NamingEnumeration<?> ne = atributos.get(atributo).getAll();
				valor = ne.next().toString();
			}
			else throw new Exception("No se encontró el documento de identificación en los datos del usuario dentro del directorio LDAP");
		} catch (NamingException e) {
			e.printStackTrace();
		}
		return valor;
	}

	
	/**
	 * @return Objeto de tipo Properties con las propiedades de conexion a LDAP
	 */
	private Properties cargarArchivoPropiedades() {
		//System.out.println("---> Cargando archivo de propiedades!");
		Properties prop = new Properties();
		InputStream inputStream = Ldap.class.getClassLoader()
				.getResourceAsStream(CONFIG_FILE_DIRECTORY + CONFIG_FILE_NAME);
		if (inputStream != null) {
			try {
				prop.load(inputStream);
			} catch (IOException e) {
				System.out
						.println("-----> Problema cargando el archivo de propiedades de conexion a LDAP");
				System.out
						.println("-----> Es probable que el archivo no exista o no se haya configurado correctamente!");
				prop = null;
				e.printStackTrace();
			}
		} else {
			System.out.println("-----------------> "+ "Problema cargando el archivo!");
		}

		return prop;
	}
}