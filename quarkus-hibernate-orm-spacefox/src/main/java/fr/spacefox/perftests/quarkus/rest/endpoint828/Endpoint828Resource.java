package fr.spacefox.perftests.quarkus.rest.endpoint828;

import fr.spacefox.perftests.quarkus.core.service828.Service828;
import fr.spacefox.perftests.quarkus.rest.endpoint828.schema.Schema828;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint828")
public class Endpoint828Resource {

    private final Service828 service;

    public Endpoint828Resource(Service828 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema828 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
