package fr.spacefox.perftests.quarkus.rest.endpoint554;

import fr.spacefox.perftests.quarkus.core.service554.Service554;
import fr.spacefox.perftests.quarkus.rest.endpoint554.schema.Schema554;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint554")
public class Endpoint554Resource {

    private final Service554 service;

    public Endpoint554Resource(Service554 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema554 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
