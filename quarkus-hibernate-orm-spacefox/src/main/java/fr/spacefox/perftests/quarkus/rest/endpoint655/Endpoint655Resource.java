package fr.spacefox.perftests.quarkus.rest.endpoint655;

import fr.spacefox.perftests.quarkus.core.service655.Service655;
import fr.spacefox.perftests.quarkus.rest.endpoint655.schema.Schema655;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint655")
public class Endpoint655Resource {

    private final Service655 service;

    public Endpoint655Resource(Service655 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema655 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
