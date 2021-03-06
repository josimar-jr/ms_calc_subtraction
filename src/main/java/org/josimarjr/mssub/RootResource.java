package org.josimarjr.mssub;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.josimarjr.mssub.Healthcheck.*;

@Path("/")
public class RootResource {

    @Inject
    HealthcheckResource healthcheck;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String root() {
        return healthcheck.healthcheck();
    }
}
