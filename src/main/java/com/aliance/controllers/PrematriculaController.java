package com.aliance.controllers;

import com.aliance.model.PrematriculaModel;
import com.aliance.services.PrematriculaService;

import javax.inject.Inject;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import java.net.URI;
import java.util.Date;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Path("/prematricula")
public class PrematriculaController {

    @Inject
    private PrematriculaService _ctrlService;

    @GET
    @Produces(APPLICATION_JSON)
    @Path("/{idEst: \\d+}/{idProg: \\d+}")
    public Response getPrematricula(@PathParam("idEst") String idEst,
                                    @PathParam("idProg") String idProg) {
        PrematriculaModel model = _ctrlService.GetPrematricula(idEst, idProg,
                new Date());
        return (model != null) ? Response.ok(model).build() :
                Response.status(Response.Status.BAD_REQUEST).build();

    }

    @POST
    public  Response postPrematricula(PrematriculaModel model) {
        _ctrlService.AddPrematricula(model);
        return Response.noContent().build();
    }
}