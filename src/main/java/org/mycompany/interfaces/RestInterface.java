package org.mycompany.interfaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("")
public interface RestInterface{
    @POST
    @Consumes(value = "application/json")
    @Produces(value = "application/json")
    @Path("/enrolar/validar")
    Object enrolarValidar(String payload);
}
