package fr.spacefox.perftests.quarkus.rest.endpoint173;

import fr.spacefox.perftests.quarkus.core.service173.Service173;
import fr.spacefox.perftests.quarkus.rest.endpoint173.schema.Schema173;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint173")
public class Endpoint173Resource {

    private final Service173 service;

    public Endpoint173Resource(Service173 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema173 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
