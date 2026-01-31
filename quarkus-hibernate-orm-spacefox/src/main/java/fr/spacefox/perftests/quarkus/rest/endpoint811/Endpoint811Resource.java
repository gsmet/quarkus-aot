package fr.spacefox.perftests.quarkus.rest.endpoint811;

import fr.spacefox.perftests.quarkus.core.service811.Service811;
import fr.spacefox.perftests.quarkus.rest.endpoint811.schema.Schema811;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint811")
public class Endpoint811Resource {

    private final Service811 service;

    public Endpoint811Resource(Service811 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema811 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
