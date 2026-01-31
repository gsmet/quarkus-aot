package fr.spacefox.perftests.quarkus.rest.endpoint687;

import fr.spacefox.perftests.quarkus.core.service687.Service687;
import fr.spacefox.perftests.quarkus.rest.endpoint687.schema.Schema687;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint687")
public class Endpoint687Resource {

    private final Service687 service;

    public Endpoint687Resource(Service687 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema687 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
