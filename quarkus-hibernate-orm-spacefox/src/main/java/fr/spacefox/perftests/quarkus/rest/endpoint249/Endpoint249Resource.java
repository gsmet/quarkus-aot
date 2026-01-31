package fr.spacefox.perftests.quarkus.rest.endpoint249;

import fr.spacefox.perftests.quarkus.core.service249.Service249;
import fr.spacefox.perftests.quarkus.rest.endpoint249.schema.Schema249;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint249")
public class Endpoint249Resource {

    private final Service249 service;

    public Endpoint249Resource(Service249 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema249 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
