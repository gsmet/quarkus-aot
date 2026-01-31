package fr.spacefox.perftests.quarkus.rest.endpoint405;

import fr.spacefox.perftests.quarkus.core.service405.Service405;
import fr.spacefox.perftests.quarkus.rest.endpoint405.schema.Schema405;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint405")
public class Endpoint405Resource {

    private final Service405 service;

    public Endpoint405Resource(Service405 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema405 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
