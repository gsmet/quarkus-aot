package fr.spacefox.perftests.quarkus.rest.endpoint792;

import fr.spacefox.perftests.quarkus.core.service792.Service792;
import fr.spacefox.perftests.quarkus.rest.endpoint792.schema.Schema792;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint792")
public class Endpoint792Resource {

    private final Service792 service;

    public Endpoint792Resource(Service792 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema792 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
