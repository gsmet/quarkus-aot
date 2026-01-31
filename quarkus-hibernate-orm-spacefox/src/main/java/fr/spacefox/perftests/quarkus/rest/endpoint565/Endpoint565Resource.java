package fr.spacefox.perftests.quarkus.rest.endpoint565;

import fr.spacefox.perftests.quarkus.core.service565.Service565;
import fr.spacefox.perftests.quarkus.rest.endpoint565.schema.Schema565;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint565")
public class Endpoint565Resource {

    private final Service565 service;

    public Endpoint565Resource(Service565 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema565 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
