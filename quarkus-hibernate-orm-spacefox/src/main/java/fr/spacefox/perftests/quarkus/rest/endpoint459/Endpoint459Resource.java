package fr.spacefox.perftests.quarkus.rest.endpoint459;

import fr.spacefox.perftests.quarkus.core.service459.Service459;
import fr.spacefox.perftests.quarkus.rest.endpoint459.schema.Schema459;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint459")
public class Endpoint459Resource {

    private final Service459 service;

    public Endpoint459Resource(Service459 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema459 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
