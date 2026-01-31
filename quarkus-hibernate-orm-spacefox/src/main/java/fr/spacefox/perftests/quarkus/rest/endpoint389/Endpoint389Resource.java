package fr.spacefox.perftests.quarkus.rest.endpoint389;

import fr.spacefox.perftests.quarkus.core.service389.Service389;
import fr.spacefox.perftests.quarkus.rest.endpoint389.schema.Schema389;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint389")
public class Endpoint389Resource {

    private final Service389 service;

    public Endpoint389Resource(Service389 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema389 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
