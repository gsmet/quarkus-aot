package fr.spacefox.perftests.quarkus.rest.endpoint462;

import fr.spacefox.perftests.quarkus.core.service462.Service462;
import fr.spacefox.perftests.quarkus.rest.endpoint462.schema.Schema462;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint462")
public class Endpoint462Resource {

    private final Service462 service;

    public Endpoint462Resource(Service462 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema462 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
