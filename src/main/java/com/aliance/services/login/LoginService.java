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
        _webService = WebService.Instanciar().GetService();
        System.out.println("Credentials: "+ nombreUsuario + "-"+contrasena);
//      int res = _autenticador.getResultado(nombreUsuario, contrasena);


//      if(_autenticador.getResultado(nombreUsuario, contrasena) == 1)
        if(true)
        {
            ProgramaMapper mapper = new ProgramaMapper(_webService
                    .cargarProgramasEstudiante(nombreUsuario));
            System.out.println("Código Usuario: "+ mapper.GetProgramas()[0].codigo);

            Estudiante est =
                    _webService.cargarDatosEstudiante(mapper.GetProgramas()[0].codigo);
            System.out.println("Nombre de usuario: "+ est.getPrimerApellido());
            return new EstudianteMapper(est).GetModel(nombreUsuario,
                    mapper.GetProgramas());
        }
        return null;
    }
}
