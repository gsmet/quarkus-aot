package fr.spacefox.perftests.quarkus.rest.endpoint304;

import fr.spacefox.perftests.quarkus.core.service304.Service304;
import fr.spacefox.perftests.quarkus.rest.endpoint304.schema.Schema304;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint304")
public class Endpoint304Resource {

    private final Service304 service;

    public Endpoint304Resource(Service304 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema304 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
