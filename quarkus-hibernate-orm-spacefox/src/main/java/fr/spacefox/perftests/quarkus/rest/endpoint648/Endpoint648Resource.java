package fr.spacefox.perftests.quarkus.rest.endpoint648;

import fr.spacefox.perftests.quarkus.core.service648.Service648;
import fr.spacefox.perftests.quarkus.rest.endpoint648.schema.Schema648;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint648")
public class Endpoint648Resource {

    private final Service648 service;

    public Endpoint648Resource(Service648 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema648 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
