package com.aliance.controllers;

import com.aliance.model.GroupMateriaModel;
import com.aliance.model.MateriaModel;
import com.aliance.services.materias.IMateriaService;
import com.aliance.services.qualifiers.Remote;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.util.List;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Path("/materias")
public class MateriasController {

    @Inject @Remote
    private IMateriaService _ctrlService;

    @GET
    @Path("/{idEst: \\d+}")
    @Produces(APPLICATION_JSON)
    public Response getMaterias(@PathParam("idEst") String idEst) {
        List<GroupMateriaModel<MateriaModel>> modelList = _ctrlService.getMaterias(idEst);
        return (modelList.size() > 0) ? Response.ok(modelList).build() :
                Response.status(Response.Status.NOT_FOUND).build();
    }


    @GET
    @Path("historial/{idEst: \\d+}")
    @Produces(APPLICATION_JSON)
    public Response getHistorial(@PathParam("idEst") String idEst) {
        List<GroupMateriaModel<MateriaModel>> modelList = _ctrlService.getMateriasAprobadas(idEst);
        return (modelList.size() > 0) ? Response.ok(modelList).build() :
                Response.status(Response.Status.NOT_FOUND).build();
    }

    @GET
    @Path("pensum/{idEst: \\d+}")
    @Produces(APPLICATION_JSON)
    public Response getPensum(@PathParam("idEst") String idEst) {
        List<GroupMateriaModel<MateriaModel>> modelList = _ctrlService.getPensum(idEst);
        return (modelList.size() > 0) ? Response.ok(modelList).build() :
                Response.status(Response.Status.NOT_FOUND).build();
    }


}
