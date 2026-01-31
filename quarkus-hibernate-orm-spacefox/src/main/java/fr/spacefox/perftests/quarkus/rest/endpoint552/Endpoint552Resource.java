package fr.spacefox.perftests.quarkus.rest.endpoint552;

import fr.spacefox.perftests.quarkus.core.service552.Service552;
import fr.spacefox.perftests.quarkus.rest.endpoint552.schema.Schema552;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint552")
public class Endpoint552Resource {

    private final Service552 service;

    public Endpoint552Resource(Service552 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema552 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
