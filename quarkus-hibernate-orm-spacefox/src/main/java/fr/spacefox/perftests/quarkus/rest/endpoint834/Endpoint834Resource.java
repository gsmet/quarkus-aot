package fr.spacefox.perftests.quarkus.rest.endpoint834;

import fr.spacefox.perftests.quarkus.core.service834.Service834;
import fr.spacefox.perftests.quarkus.rest.endpoint834.schema.Schema834;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint834")
public class Endpoint834Resource {

    private final Service834 service;

    public Endpoint834Resource(Service834 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema834 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
