package org.uek223;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/ihatemvn")
public class INeedToFlex {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String lol() {
        return "Lolol Maven scheisse, Gradle besser";
    }
}
