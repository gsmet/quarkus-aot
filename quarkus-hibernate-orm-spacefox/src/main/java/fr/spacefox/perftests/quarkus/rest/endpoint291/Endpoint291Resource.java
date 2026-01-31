package fr.spacefox.perftests.quarkus.rest.endpoint291;

import fr.spacefox.perftests.quarkus.core.service291.Service291;
import fr.spacefox.perftests.quarkus.rest.endpoint291.schema.Schema291;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint291")
public class Endpoint291Resource {

    private final Service291 service;

    public Endpoint291Resource(Service291 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema291 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
