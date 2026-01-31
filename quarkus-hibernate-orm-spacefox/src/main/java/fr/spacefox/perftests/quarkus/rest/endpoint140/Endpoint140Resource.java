package fr.spacefox.perftests.quarkus.rest.endpoint140;

import fr.spacefox.perftests.quarkus.core.service140.Service140;
import fr.spacefox.perftests.quarkus.rest.endpoint140.schema.Schema140;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint140")
public class Endpoint140Resource {

    private final Service140 service;

    public Endpoint140Resource(Service140 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema140 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
