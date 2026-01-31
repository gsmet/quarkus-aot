package fr.spacefox.perftests.quarkus.rest.endpoint588;

import fr.spacefox.perftests.quarkus.core.service588.Service588;
import fr.spacefox.perftests.quarkus.rest.endpoint588.schema.Schema588;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint588")
public class Endpoint588Resource {

    private final Service588 service;

    public Endpoint588Resource(Service588 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema588 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
