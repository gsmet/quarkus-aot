package fr.spacefox.perftests.quarkus.rest.endpoint653;

import fr.spacefox.perftests.quarkus.core.service653.Service653;
import fr.spacefox.perftests.quarkus.rest.endpoint653.schema.Schema653;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint653")
public class Endpoint653Resource {

    private final Service653 service;

    public Endpoint653Resource(Service653 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema653 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
