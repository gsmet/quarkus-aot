package fr.spacefox.perftests.quarkus.rest.endpoint367;

import fr.spacefox.perftests.quarkus.core.service367.Service367;
import fr.spacefox.perftests.quarkus.rest.endpoint367.schema.Schema367;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint367")
public class Endpoint367Resource {

    private final Service367 service;

    public Endpoint367Resource(Service367 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema367 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
