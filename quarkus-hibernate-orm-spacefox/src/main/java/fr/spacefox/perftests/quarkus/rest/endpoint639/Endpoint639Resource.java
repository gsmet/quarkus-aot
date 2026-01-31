package fr.spacefox.perftests.quarkus.rest.endpoint639;

import fr.spacefox.perftests.quarkus.core.service639.Service639;
import fr.spacefox.perftests.quarkus.rest.endpoint639.schema.Schema639;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint639")
public class Endpoint639Resource {

    private final Service639 service;

    public Endpoint639Resource(Service639 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema639 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
