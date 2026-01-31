package fr.spacefox.perftests.quarkus.rest.endpoint530;

import fr.spacefox.perftests.quarkus.core.service530.Service530;
import fr.spacefox.perftests.quarkus.rest.endpoint530.schema.Schema530;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint530")
public class Endpoint530Resource {

    private final Service530 service;

    public Endpoint530Resource(Service530 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema530 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
