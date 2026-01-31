package fr.spacefox.perftests.quarkus.rest.endpoint59;

import fr.spacefox.perftests.quarkus.core.service59.Service59;
import fr.spacefox.perftests.quarkus.rest.endpoint59.schema.Schema59;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint59")
public class Endpoint59Resource {

    private final Service59 service;

    public Endpoint59Resource(Service59 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema59 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
