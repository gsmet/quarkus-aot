package fr.spacefox.perftests.quarkus.rest.endpoint269;

import fr.spacefox.perftests.quarkus.core.service269.Service269;
import fr.spacefox.perftests.quarkus.rest.endpoint269.schema.Schema269;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint269")
public class Endpoint269Resource {

    private final Service269 service;

    public Endpoint269Resource(Service269 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema269 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
