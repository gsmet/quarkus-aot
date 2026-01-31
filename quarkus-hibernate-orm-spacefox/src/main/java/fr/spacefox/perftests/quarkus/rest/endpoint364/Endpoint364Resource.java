package fr.spacefox.perftests.quarkus.rest.endpoint364;

import fr.spacefox.perftests.quarkus.core.service364.Service364;
import fr.spacefox.perftests.quarkus.rest.endpoint364.schema.Schema364;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint364")
public class Endpoint364Resource {

    private final Service364 service;

    public Endpoint364Resource(Service364 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema364 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
