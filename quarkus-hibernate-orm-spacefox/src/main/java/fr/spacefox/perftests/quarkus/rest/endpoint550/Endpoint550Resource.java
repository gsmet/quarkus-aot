package fr.spacefox.perftests.quarkus.rest.endpoint550;

import fr.spacefox.perftests.quarkus.core.service550.Service550;
import fr.spacefox.perftests.quarkus.rest.endpoint550.schema.Schema550;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint550")
public class Endpoint550Resource {

    private final Service550 service;

    public Endpoint550Resource(Service550 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema550 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
