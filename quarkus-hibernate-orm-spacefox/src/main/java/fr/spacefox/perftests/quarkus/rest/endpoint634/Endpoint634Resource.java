package fr.spacefox.perftests.quarkus.rest.endpoint634;

import fr.spacefox.perftests.quarkus.core.service634.Service634;
import fr.spacefox.perftests.quarkus.rest.endpoint634.schema.Schema634;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint634")
public class Endpoint634Resource {

    private final Service634 service;

    public Endpoint634Resource(Service634 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema634 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
