package com.aliance.controllers;

import com.aliance.model.EstudianteModel;
import com.aliance.model.LoginModel;
import com.aliance.services.login.LoginService;

import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Path("/account")
public class LoginController {

    @Inject
    private LoginService _ctrlService;

    @POST
    @Path("login")
    @Produces(APPLICATION_JSON )
    public Response postLogin(LoginModel model) {
        EstudianteModel responseModel = _ctrlService.Login(model.getUsuario(),
                model.getContrasena());
        if(responseModel == null) {
            return Response.status(Response.Status.UNAUTHORIZED).build();
        }
        return Response.ok(responseModel).build();
    }



}


