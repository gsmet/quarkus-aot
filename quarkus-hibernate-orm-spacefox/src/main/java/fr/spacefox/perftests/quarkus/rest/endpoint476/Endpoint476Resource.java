package fr.spacefox.perftests.quarkus.rest.endpoint476;

import fr.spacefox.perftests.quarkus.core.service476.Service476;
import fr.spacefox.perftests.quarkus.rest.endpoint476.schema.Schema476;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint476")
public class Endpoint476Resource {

    private final Service476 service;

    public Endpoint476Resource(Service476 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema476 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
