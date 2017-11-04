package com.aliance.services;


import autenticacion.Autentica;
import prematriculaClient.PrematriculasControl;
import prematriculaClient.PrematriculasControlService;

/**
 * Servicio SINGLETON que adapta los
 * servicios web proporcionados por simca
 * (más información consulte en los manuales)
 */
public class WebService {
    private static WebService instance;

    private PrematriculasControl _service;
    private Autentica _autenticador;

    /**
     * Constructor de la clase
     * retorna WebServiceException
     * cuando no se puede realizar la conexión con
     * los servicios remotos de simca.
     */
    private WebService() {
        _service = new PrematriculasControlService().getPrematriculasControlPort();
        _autenticador = new Autentica();
    }

    public static WebService Instanciar() {
        if(instance == null)
            instance = new WebService();
        return instance;
    }

    public PrematriculasControl GetService() {
        return _service;
    }
    public Autentica GetAutenticador() { return _autenticador;}


}
