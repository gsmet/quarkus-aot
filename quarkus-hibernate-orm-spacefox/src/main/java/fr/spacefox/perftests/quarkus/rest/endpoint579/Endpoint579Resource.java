package fr.spacefox.perftests.quarkus.rest.endpoint579;

import fr.spacefox.perftests.quarkus.core.service579.Service579;
import fr.spacefox.perftests.quarkus.rest.endpoint579.schema.Schema579;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint579")
public class Endpoint579Resource {

    private final Service579 service;

    public Endpoint579Resource(Service579 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema579 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
