package fr.spacefox.perftests.quarkus.rest.endpoint107;

import fr.spacefox.perftests.quarkus.core.service107.Service107;
import fr.spacefox.perftests.quarkus.rest.endpoint107.schema.Schema107;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint107")
public class Endpoint107Resource {

    private final Service107 service;

    public Endpoint107Resource(Service107 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema107 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
