package fr.spacefox.perftests.quarkus.rest.endpoint576;

import fr.spacefox.perftests.quarkus.core.service576.Service576;
import fr.spacefox.perftests.quarkus.rest.endpoint576.schema.Schema576;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint576")
public class Endpoint576Resource {

    private final Service576 service;

    public Endpoint576Resource(Service576 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema576 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
