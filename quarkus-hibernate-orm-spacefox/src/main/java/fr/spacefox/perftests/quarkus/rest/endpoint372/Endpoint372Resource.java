package fr.spacefox.perftests.quarkus.rest.endpoint372;

import fr.spacefox.perftests.quarkus.core.service372.Service372;
import fr.spacefox.perftests.quarkus.rest.endpoint372.schema.Schema372;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint372")
public class Endpoint372Resource {

    private final Service372 service;

    public Endpoint372Resource(Service372 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema372 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
