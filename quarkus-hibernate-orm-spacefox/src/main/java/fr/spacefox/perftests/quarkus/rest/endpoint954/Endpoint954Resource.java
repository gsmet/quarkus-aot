package fr.spacefox.perftests.quarkus.rest.endpoint954;

import fr.spacefox.perftests.quarkus.core.service954.Service954;
import fr.spacefox.perftests.quarkus.rest.endpoint954.schema.Schema954;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint954")
public class Endpoint954Resource {

    private final Service954 service;

    public Endpoint954Resource(Service954 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema954 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
