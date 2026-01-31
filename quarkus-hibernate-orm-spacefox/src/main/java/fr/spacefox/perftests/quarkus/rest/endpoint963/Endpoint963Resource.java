package fr.spacefox.perftests.quarkus.rest.endpoint963;

import fr.spacefox.perftests.quarkus.core.service963.Service963;
import fr.spacefox.perftests.quarkus.rest.endpoint963.schema.Schema963;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint963")
public class Endpoint963Resource {

    private final Service963 service;

    public Endpoint963Resource(Service963 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema963 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
