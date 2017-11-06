package com.aliance.services.login;

import com.aliance.model.EstudianteModel;
import com.aliance.model.ProgramaModel;
import com.aliance.services.qualifiers.Local;

@Local
public class LoginLocalService implements ILoginService{
    @Override
    public EstudianteModel Login(String nombreUsuario, String contrasena) {
        return new EstudianteModel(nombreUsuario, "Juan Sebastian",
                "Montaño Molina", new ProgramaModel[]{
                new ProgramaModel("344","Ingeniería de Sistemas",
                        "123124123123")});
    }



}
