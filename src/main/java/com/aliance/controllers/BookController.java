//package com.aliance.controllers;
//
//
//import com.aliance.repository.PrematriculaRepository;
//
//import javax.inject.Inject;
//import javax.validation.constraints.Min;
//import javax.ws.rs.*;
//import javax.ws.rs.core.Context;
//import javax.ws.rs.core.Response;
//import javax.ws.rs.core.UriInfo;
//import java.net.URI;
//
//import static javax.ws.rs.core.MediaType.APPLICATION_JSON;
//
//@Path("/books")
//public class BookController {
//
//    @Inject
//    private PrematriculaRepository _prematriculaRepository;
//
//    @GET
//    @Produces(APPLICATION_JSON)
//    @Path("/{id : \\d+}")
//    public Response getBook(@PathParam("id") @Min(1) Long id) {
//        Book book = _prematriculaRepository.find(id);
//        if(book == null)
//            return Response.status(Response.Status.NOT_FOUND).build();
//
//        return Response.ok(book).build();
//    }
//
//    @GET
//    @Produces(APPLICATION_JSON)
//    public Response getBooks() {
//        List<Book> books = _prematriculaRepository.findAll();
//
//        if(books.size() == 0)
//            return Response.noContent().build();
//        return Response.ok(books).build();
//
//    }
//
//    @GET
//    @Path("/count")
//    @Produces(APPLICATION_JSON)
//    public Response countBooks() {
//        return Response.ok(_prematriculaRepository.countAll()).build();
//    }
//
//
//    @POST
//    @Consumes(APPLICATION_JSON)
//    public Response createBook(Book book, @Context UriInfo uriInfo) {
//        book = _prematriculaRepository.create(book);
//        URI createdUri = uriInfo.getBaseUriBuilder().path(book.getId().toString()).build();
//        return Response.created(createdUri).build();
//
//    }
//
//
//    @DELETE
//    @Path("/{id : \\d+}")
//    public Response deleteBook(@PathParam("id") @Min(1)Long id) {
//        _prematriculaRepository.delete(id);
//        return Response.noContent().build();
//    }
//}
