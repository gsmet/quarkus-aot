package fr.spacefox.perftests.quarkus.rest.endpoint474;

import fr.spacefox.perftests.quarkus.core.service474.Service474;
import fr.spacefox.perftests.quarkus.rest.endpoint474.schema.Schema474;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint474")
public class Endpoint474Resource {

    private final Service474 service;

    public Endpoint474Resource(Service474 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema474 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
