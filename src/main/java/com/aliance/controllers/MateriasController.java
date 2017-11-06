package com.aliance.controllers;

import com.aliance.model.GroupMateriaModel;
import com.aliance.services.MateriaService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import java.util.List;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Path("/materias")
public class MateriasController {

    @Inject
    private MateriaService _ctrlService;

    @GET
    @Path("/{idEst: \\d+}")
    @Produces(APPLICATION_JSON)
    public Response getMaterias(@PathParam("idEst") String idEst) {
        List<GroupMateriaModel> modelList = _ctrlService.getMaterias(idEst);
        return (modelList.size() > 0) ? Response.ok(modelList).build() :
                Response.status(Response.Status.NOT_FOUND).build();
    }


    @GET
    @Path("historial/{idEst: \\d+}")
    @Produces(APPLICATION_JSON)
    public Response getHistorial(@PathParam("idEst") String idEst) {
        List<GroupMateriaModel> modelList = _ctrlService.getMateriasAprobadas(idEst);
        return (modelList.size() > 0) ? Response.ok(modelList).build() :
                Response.status(Response.Status.NOT_FOUND).build();
    }

    @GET
    @Path("pensum/{idEst: \\d+}")
    @Produces(APPLICATION_JSON)
    public Response getPensum(@PathParam("idEst") String idEst) {
        List<GroupMateriaModel> modelList = _ctrlService.getPensum(idEst);
        return (modelList.size() > 0) ? Response.ok(modelList).build() :
                Response.status(Response.Status.NOT_FOUND).build();
    }


}
