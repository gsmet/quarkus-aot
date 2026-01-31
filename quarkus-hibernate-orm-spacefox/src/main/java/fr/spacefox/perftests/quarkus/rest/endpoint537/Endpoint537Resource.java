package fr.spacefox.perftests.quarkus.rest.endpoint537;

import fr.spacefox.perftests.quarkus.core.service537.Service537;
import fr.spacefox.perftests.quarkus.rest.endpoint537.schema.Schema537;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint537")
public class Endpoint537Resource {

    private final Service537 service;

    public Endpoint537Resource(Service537 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema537 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
