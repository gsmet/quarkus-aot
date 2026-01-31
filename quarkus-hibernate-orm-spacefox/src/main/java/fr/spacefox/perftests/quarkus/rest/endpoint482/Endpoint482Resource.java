package fr.spacefox.perftests.quarkus.rest.endpoint482;

import fr.spacefox.perftests.quarkus.core.service482.Service482;
import fr.spacefox.perftests.quarkus.rest.endpoint482.schema.Schema482;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint482")
public class Endpoint482Resource {

    private final Service482 service;

    public Endpoint482Resource(Service482 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema482 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
