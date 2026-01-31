package fr.spacefox.perftests.quarkus.rest.endpoint920;

import fr.spacefox.perftests.quarkus.core.service920.Service920;
import fr.spacefox.perftests.quarkus.rest.endpoint920.schema.Schema920;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint920")
public class Endpoint920Resource {

    private final Service920 service;

    public Endpoint920Resource(Service920 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema920 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
