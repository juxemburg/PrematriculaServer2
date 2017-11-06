package com.aliance.services.login;

import com.aliance.model.EstudianteModel;

public interface ILoginService {

    EstudianteModel Login(String nombreUsuario, String contrasena);
}
