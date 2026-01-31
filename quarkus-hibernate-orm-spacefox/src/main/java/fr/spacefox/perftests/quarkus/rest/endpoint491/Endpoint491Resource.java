package fr.spacefox.perftests.quarkus.rest.endpoint491;

import fr.spacefox.perftests.quarkus.core.service491.Service491;
import fr.spacefox.perftests.quarkus.rest.endpoint491.schema.Schema491;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint491")
public class Endpoint491Resource {

    private final Service491 service;

    public Endpoint491Resource(Service491 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema491 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
