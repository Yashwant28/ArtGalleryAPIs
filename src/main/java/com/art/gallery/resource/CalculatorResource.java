package com.art.gallery.resource;


import com.art.gallery.model.CalcAnswer;
import com.art.gallery.model.CalcInputs;
import com.art.gallery.model.StatusMessages;
import com.art.gallery.service.CalculatorService;
import org.springframework.web.bind.annotation.RequestBody;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Produces("application/json")
@Consumes("application/json")
@Path("/calculate")
public class CalculatorResource {

    private CalculatorService calculatorService;

    @Inject
    public CalculatorResource(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @POST
    @Path("/save")
    public Response getInputValues(@RequestBody @Valid CalcInputs calcInputs) {
        StatusMessages statusMessages = new StatusMessages();
        try {
            statusMessages = calculatorService.getInputValues(calcInputs);
        } catch (Exception exception) {
            statusMessages.setMessage("Invalid Inputs Found!");
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(statusMessages).build();
        }
        return Response.status(Response.Status.CREATED).entity(statusMessages).build();
    }

    @GET
    @Path("/addition")
    public Response getAddition() {
        CalcAnswer calcAnswer = new CalcAnswer();
        try {
            calcAnswer = calculatorService.getAddition();
        } catch (Exception exception) {
            StatusMessages statusMessages = new StatusMessages();
            statusMessages.setMessage("Invalid Inputs Found!");
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(statusMessages).build();
        }
        return Response.status(Response.Status.OK).entity(calcAnswer).build();
    }

    @PUT
    @Path("/update")
    public Response updateInputValues(@RequestBody @Valid CalcInputs calcInputs) {
        StatusMessages statusMessages = new StatusMessages();
        try {
            statusMessages = calculatorService.updateInputValues(calcInputs);
        } catch (Exception exception) {
            statusMessages.setMessage("Invalid Inputs Found!");
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(statusMessages).build();
        }
        return Response.status(Response.Status.CREATED).entity(statusMessages).build();
    }

    @DELETE
    @Path("/delete")
    public Response deleteInputValues(){
        StatusMessages statusMessages = new StatusMessages();
        try {
            statusMessages = calculatorService.deleteInputValues();
        } catch (Exception exception) {
            statusMessages.setMessage("Invalid Inputs Found!");
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(statusMessages).build();
        }
        return Response.status(Response.Status.CREATED).entity(statusMessages).build();
    }


}
