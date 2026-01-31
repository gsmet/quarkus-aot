package fr.spacefox.perftests.quarkus.rest.endpoint409;

import fr.spacefox.perftests.quarkus.core.service409.Service409;
import fr.spacefox.perftests.quarkus.rest.endpoint409.schema.Schema409;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint409")
public class Endpoint409Resource {

    private final Service409 service;

    public Endpoint409Resource(Service409 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema409 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
