package fr.spacefox.perftests.quarkus.rest.endpoint973;

import fr.spacefox.perftests.quarkus.core.service973.Service973;
import fr.spacefox.perftests.quarkus.rest.endpoint973.schema.Schema973;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint973")
public class Endpoint973Resource {

    private final Service973 service;

    public Endpoint973Resource(Service973 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema973 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
