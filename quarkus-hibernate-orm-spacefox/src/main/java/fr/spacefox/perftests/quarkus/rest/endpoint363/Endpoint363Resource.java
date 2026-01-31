package fr.spacefox.perftests.quarkus.rest.endpoint363;

import fr.spacefox.perftests.quarkus.core.service363.Service363;
import fr.spacefox.perftests.quarkus.rest.endpoint363.schema.Schema363;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint363")
public class Endpoint363Resource {

    private final Service363 service;

    public Endpoint363Resource(Service363 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema363 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
