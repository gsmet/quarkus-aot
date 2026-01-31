package fr.spacefox.perftests.quarkus.rest.endpoint440;

import fr.spacefox.perftests.quarkus.core.service440.Service440;
import fr.spacefox.perftests.quarkus.rest.endpoint440.schema.Schema440;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint440")
public class Endpoint440Resource {

    private final Service440 service;

    public Endpoint440Resource(Service440 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema440 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
