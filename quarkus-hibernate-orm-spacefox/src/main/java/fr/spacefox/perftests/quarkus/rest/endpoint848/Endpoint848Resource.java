package fr.spacefox.perftests.quarkus.rest.endpoint848;

import fr.spacefox.perftests.quarkus.core.service848.Service848;
import fr.spacefox.perftests.quarkus.rest.endpoint848.schema.Schema848;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint848")
public class Endpoint848Resource {

    private final Service848 service;

    public Endpoint848Resource(Service848 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema848 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
