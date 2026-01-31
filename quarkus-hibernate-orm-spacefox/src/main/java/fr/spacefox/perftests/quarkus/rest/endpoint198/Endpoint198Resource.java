package fr.spacefox.perftests.quarkus.rest.endpoint198;

import fr.spacefox.perftests.quarkus.core.service198.Service198;
import fr.spacefox.perftests.quarkus.rest.endpoint198.schema.Schema198;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint198")
public class Endpoint198Resource {

    private final Service198 service;

    public Endpoint198Resource(Service198 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema198 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
