package com.art.gallery.resource;

import com.art.gallery.model.StatusMessages;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.annotation.security.PermitAll;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/healthCheck")
public class HealthCheck {

    @GET
    @PermitAll
    @Produces("application/json")
    @Path("/200")
    public Response healthCheckTest(){
        StatusMessages statusMessages = new StatusMessages();
        statusMessages.setMessage("Health Check Works!");
        return Response.status(Response.Status.OK).entity(statusMessages).build();
    }

    @GET
    @PermitAll
    @Produces("application/json")
    @Path("/201")
    public Response healthCheckTestNew(){
        StatusMessages statusMessages = new StatusMessages();
        statusMessages.setMessage("Health Check Works!");
        return Response.status(Response.Status.CREATED).entity(statusMessages).build();
    }

    @GET
    @PermitAll
    @Produces("application/json")
    @Path("/204")
    public Response healthCheckTestNew1(){
        StatusMessages statusMessages = new StatusMessages();
        statusMessages.setMessage("Health Check Works!");
        return Response.status(Response.Status.NO_CONTENT).entity(statusMessages).build();
    }

    @GET
    @PermitAll
    @Produces("application/json")
    @Path("/400")
    public Response healthCheckTestNew2(){
        StatusMessages statusMessages = new StatusMessages();
        statusMessages.setMessage("Health Check Works!");
        return Response.status(Response.Status.BAD_REQUEST).entity(statusMessages).build();
    }

    @GET
    @PermitAll
    @Produces("application/json")
    @Path("/405")
    public Response healthCheckTestNew3(){
        StatusMessages statusMessages = new StatusMessages();
        statusMessages.setMessage("Health Check Works!");
        return Response.status(Response.Status.METHOD_NOT_ALLOWED).entity(statusMessages).build();
    }
}
