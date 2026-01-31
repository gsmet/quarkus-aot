package fr.spacefox.perftests.quarkus.rest.endpoint727;

import fr.spacefox.perftests.quarkus.core.service727.Service727;
import fr.spacefox.perftests.quarkus.rest.endpoint727.schema.Schema727;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint727")
public class Endpoint727Resource {

    private final Service727 service;

    public Endpoint727Resource(Service727 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema727 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
