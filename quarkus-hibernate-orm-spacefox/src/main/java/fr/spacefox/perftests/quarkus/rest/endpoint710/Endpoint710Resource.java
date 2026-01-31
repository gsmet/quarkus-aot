package fr.spacefox.perftests.quarkus.rest.endpoint710;

import fr.spacefox.perftests.quarkus.core.service710.Service710;
import fr.spacefox.perftests.quarkus.rest.endpoint710.schema.Schema710;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint710")
public class Endpoint710Resource {

    private final Service710 service;

    public Endpoint710Resource(Service710 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema710 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
