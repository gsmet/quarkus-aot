package fr.spacefox.perftests.quarkus.rest.endpoint726;

import fr.spacefox.perftests.quarkus.core.service726.Service726;
import fr.spacefox.perftests.quarkus.rest.endpoint726.schema.Schema726;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint726")
public class Endpoint726Resource {

    private final Service726 service;

    public Endpoint726Resource(Service726 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema726 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
