package fr.spacefox.perftests.quarkus.rest.endpoint898;

import fr.spacefox.perftests.quarkus.core.service898.Service898;
import fr.spacefox.perftests.quarkus.rest.endpoint898.schema.Schema898;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint898")
public class Endpoint898Resource {

    private final Service898 service;

    public Endpoint898Resource(Service898 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema898 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
