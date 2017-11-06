package com.aliance.services.login;

import autenticacion.Autentica;
import com.aliance.model.EstudianteModel;
import com.aliance.model.ProgramaModel;
import com.aliance.model.mapper.EstudianteMapper;
import com.aliance.model.mapper.ProgramaMapper;
import prematriculaClient.Estudiante;
import prematriculaClient.PrematriculasControl;

public class LoginService {

    private PrematriculasControl _webService;
    private Autentica _autenticador;

    public LoginService() {
//        _webService = WebService.Instanciar().GetService();
//        _autenticador = WebService.Instanciar().GetAutenticador();
    }

    public EstudianteModel Login(String nombreUsuario, String contrasena) {
        System.out.println("Credentials: "+ nombreUsuario + "-"+contrasena);
        try {
            //int res = _autenticador.getResultado(nombreUsuario, contrasena);
            return new EstudianteModel(nombreUsuario, "Juan Sebastian",
                    "Montaño Molina", new ProgramaModel[]{
                    new ProgramaModel("344","Ingeniería de Sistemas",
                            "123124123123")
            });

//            if(_autenticador.getResultado(nombreUsuario, contrasena) == 1)
//            if(true)
//            {
//                ProgramaMapper mapper = new ProgramaMapper(_webService
//                                .cargarProgramasEstudiante(nombreUsuario));
//
//                Estudiante est =
//                        _webService.cargarDatosEstudiante(mapper.GetProgramas()[0].codigo);
//                return new EstudianteMapper(est).GetModel(nombreUsuario,
//                        mapper.GetProgramas());
//            }

        }
        catch (Exception e) {
            System.out.println("Error de autenticación: "+e.getMessage());
        }
        return null;
    }
}
