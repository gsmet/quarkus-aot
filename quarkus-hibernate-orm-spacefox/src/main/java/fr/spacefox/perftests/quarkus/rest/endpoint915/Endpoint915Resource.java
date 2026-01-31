package fr.spacefox.perftests.quarkus.rest.endpoint915;

import fr.spacefox.perftests.quarkus.core.service915.Service915;
import fr.spacefox.perftests.quarkus.rest.endpoint915.schema.Schema915;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint915")
public class Endpoint915Resource {

    private final Service915 service;

    public Endpoint915Resource(Service915 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema915 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
