package com.art.gallery.resources;

import com.art.gallery.model.StatusMessages;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.annotation.security.PermitAll;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/healthCheck")
public class HealthCheckResource {

    @GET
    @PermitAll
    @Produces("application/json")
    public Response healthCheckTest(){
        StatusMessages statusMessages = new StatusMessages();
        statusMessages.setMessage("Health Check Works!!");
        return Response.status(Response.Status.OK).entity(statusMessages).build();
    }

}