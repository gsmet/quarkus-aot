package fr.spacefox.perftests.quarkus.rest.endpoint534;

import fr.spacefox.perftests.quarkus.core.service534.Service534;
import fr.spacefox.perftests.quarkus.rest.endpoint534.schema.Schema534;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint534")
public class Endpoint534Resource {

    private final Service534 service;

    public Endpoint534Resource(Service534 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema534 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
