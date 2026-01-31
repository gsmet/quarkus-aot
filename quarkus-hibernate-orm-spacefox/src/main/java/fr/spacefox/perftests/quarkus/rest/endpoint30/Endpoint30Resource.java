package fr.spacefox.perftests.quarkus.rest.endpoint30;

import fr.spacefox.perftests.quarkus.core.service30.Service30;
import fr.spacefox.perftests.quarkus.rest.endpoint30.schema.Schema30;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint30")
public class Endpoint30Resource {

    private final Service30 service;

    public Endpoint30Resource(Service30 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema30 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
