package fr.spacefox.perftests.quarkus.rest.endpoint380;

import fr.spacefox.perftests.quarkus.core.service380.Service380;
import fr.spacefox.perftests.quarkus.rest.endpoint380.schema.Schema380;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint380")
public class Endpoint380Resource {

    private final Service380 service;

    public Endpoint380Resource(Service380 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema380 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
