package fr.spacefox.perftests.quarkus.rest.endpoint741;

import fr.spacefox.perftests.quarkus.core.service741.Service741;
import fr.spacefox.perftests.quarkus.rest.endpoint741.schema.Schema741;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint741")
public class Endpoint741Resource {

    private final Service741 service;

    public Endpoint741Resource(Service741 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema741 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
