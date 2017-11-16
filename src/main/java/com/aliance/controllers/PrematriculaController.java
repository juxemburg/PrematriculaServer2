package com.aliance.controllers;

import com.aliance.model.GroupMateriaModel;
import com.aliance.model.PrematriculaModel;
import com.aliance.model.PrematriculaReporteModel;
import com.aliance.services.prematricula.IPrematriculaService;
import com.aliance.services.qualifiers.Remote;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.Date;
import java.util.List;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Path("/prematricula")
public class PrematriculaController {

    @Inject @Remote
    private IPrematriculaService _ctrlService;

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

    @GET
    @Produces(APPLICATION_JSON)
    @Path("/{idProg: \\d+}/{periodo: \\d+}")
    public Response getPrematriculaReporte(@PathParam("idProg") String idProg,
                                           @PathParam("periodo")String periodo) {
        List<GroupMateriaModel<PrematriculaReporteModel>> resultModel =
                _ctrlService.GetReporte(idProg, periodo);
        return (resultModel != null) ? Response.ok(resultModel).build() :
                Response.status(Response.Status.BAD_REQUEST).build();
    }

    @POST
    public  Response postPrematricula(PrematriculaModel model) {
        _ctrlService.AddPrematricula(model);
        return Response.noContent().build();
    }
}
