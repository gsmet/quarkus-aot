package fr.spacefox.perftests.quarkus.rest.endpoint48;

import fr.spacefox.perftests.quarkus.core.service48.Service48;
import fr.spacefox.perftests.quarkus.rest.endpoint48.schema.Schema48;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint48")
public class Endpoint48Resource {

    private final Service48 service;

    public Endpoint48Resource(Service48 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema48 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
