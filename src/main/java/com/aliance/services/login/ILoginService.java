package com.aliance.services.login;

import com.aliance.model.EstudianteModel;
import com.aliance.model.dto.CoordinadorModel;

public interface ILoginService {

    EstudianteModel Login(String nombreUsuario, String contrasena);

    CoordinadorModel LoginAdmin(String nombreUsuario, String contrasena);
}
