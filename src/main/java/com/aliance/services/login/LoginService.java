package com.aliance.services.login;

import autenticacion.Autentica;
import com.aliance.model.EstudianteModel;
import com.aliance.model.ProgramaModel;
import com.aliance.model.mapper.EstudianteMapper;
import com.aliance.model.mapper.ProgramaMapper;
import com.aliance.services.WebService;
import com.aliance.services.qualifiers.Remote;
import prematriculaClient.Estudiante;
import prematriculaClient.PrematriculasControl;

import javax.enterprise.context.Dependent;

@Remote
public class LoginService implements ILoginService{

    private PrematriculasControl _webService;
    private Autentica _autenticador;


    public LoginService() {
        _webService = WebService.Instanciar().GetService();
        _autenticador = WebService.Instanciar().GetAutenticador();
    }

    @Override
    public EstudianteModel Login(String nombreUsuario, String contrasena) {
        System.out.println("Credentials: "+ nombreUsuario + "-"+contrasena);
        try {
            int res = _autenticador.getResultado(nombreUsuario, contrasena);
            if(res == 1)
            {
                ProgramaMapper mapper = new ProgramaMapper(_webService
                                .cargarProgramasEstudiante(nombreUsuario));

                Estudiante est =
                        _webService.cargarDatosEstudiante(mapper.GetProgramas()[0].codigo);
                return new EstudianteMapper(est).GetModel(nombreUsuario,
                        mapper.GetProgramas());
            }

        }
        catch (Exception e) {
            System.out.println("Error de autenticación: "+e.getMessage());
        }
        return null;
    }
}
