package fr.spacefox.perftests.quarkus.rest.endpoint701;

import fr.spacefox.perftests.quarkus.core.service701.Service701;
import fr.spacefox.perftests.quarkus.rest.endpoint701.schema.Schema701;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint701")
public class Endpoint701Resource {

    private final Service701 service;

    public Endpoint701Resource(Service701 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema701 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
