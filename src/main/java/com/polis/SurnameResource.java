package com.polis;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

@Path("surname")
public class SurnameResource {

    @GET
    @Produces("text/plain")
    public String surname() {
        return "Polishchuk";
    }

}
