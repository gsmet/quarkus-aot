package fr.spacefox.perftests.quarkus.rest.endpoint737;

import fr.spacefox.perftests.quarkus.core.service737.Service737;
import fr.spacefox.perftests.quarkus.rest.endpoint737.schema.Schema737;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint737")
public class Endpoint737Resource {

    private final Service737 service;

    public Endpoint737Resource(Service737 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema737 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
