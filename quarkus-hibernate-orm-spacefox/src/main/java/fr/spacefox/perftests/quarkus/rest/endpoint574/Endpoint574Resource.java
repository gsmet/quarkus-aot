package fr.spacefox.perftests.quarkus.rest.endpoint574;

import fr.spacefox.perftests.quarkus.core.service574.Service574;
import fr.spacefox.perftests.quarkus.rest.endpoint574.schema.Schema574;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint574")
public class Endpoint574Resource {

    private final Service574 service;

    public Endpoint574Resource(Service574 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema574 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
