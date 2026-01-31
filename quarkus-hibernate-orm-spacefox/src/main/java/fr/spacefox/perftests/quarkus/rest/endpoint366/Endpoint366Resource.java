package fr.spacefox.perftests.quarkus.rest.endpoint366;

import fr.spacefox.perftests.quarkus.core.service366.Service366;
import fr.spacefox.perftests.quarkus.rest.endpoint366.schema.Schema366;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint366")
public class Endpoint366Resource {

    private final Service366 service;

    public Endpoint366Resource(Service366 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema366 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
