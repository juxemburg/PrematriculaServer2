package com.aliance.services.login;

import autenticacion.Autentica;
import com.aliance.model.EstudianteModel;
import com.aliance.model.ProgramaModel;
import com.aliance.model.dto.CoordinadorModel;
import com.aliance.model.mapper.CoordinadorMapper;
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

        System.out.println("Credentials: "+ nombreUsuario + "-"+contrasena);
//        int res = autenticar(nombreUsuario, contrasena);


//      if(_autenticador.getResultado(nombreUsuario, contrasena) == 1)
        if(true)
        {
            ProgramaMapper mapper = new ProgramaMapper(_webService
                    .cargarProgramasEstudiante(nombreUsuario));
            ProgramaModel[] programas = mapper.GetProgramas();

            if(programas.length <= 0) {
                return null;
            }

            System.out.println("Código Usuario: "+ mapper.GetProgramas()[0].codigo);
            Estudiante est =
                    _webService.cargarDatosEstudiante(mapper.GetProgramas()[0].codigo);
            System.out.println("Nombre de usuario: "+ est.getPrimerApellido());
            return new EstudianteMapper(est).GetModel(nombreUsuario,
                    mapper.GetProgramas());
        }
        return null;
    }

    @Override
    public CoordinadorModel LoginAdmin(String nombreUsuario, String contrasena) {
        if(autenticar(nombreUsuario, contrasena) != 1)
            return null;
        return CoordinadorMapper.getCoordinador(
                _webService.cargarDatosDocente(nombreUsuario));
    }

    private int autenticar(String nombreUsuario, String contrasena) {
        return _autenticador.getResultado(nombreUsuario, contrasena);
    }
}
