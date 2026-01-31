package fr.spacefox.perftests.quarkus.rest.endpoint39;

import fr.spacefox.perftests.quarkus.core.service39.Service39;
import fr.spacefox.perftests.quarkus.rest.endpoint39.schema.Schema39;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint39")
public class Endpoint39Resource {

    private final Service39 service;

    public Endpoint39Resource(Service39 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema39 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
