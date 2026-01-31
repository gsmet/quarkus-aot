package fr.spacefox.perftests.quarkus.rest.endpoint493;

import fr.spacefox.perftests.quarkus.core.service493.Service493;
import fr.spacefox.perftests.quarkus.rest.endpoint493.schema.Schema493;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint493")
public class Endpoint493Resource {

    private final Service493 service;

    public Endpoint493Resource(Service493 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema493 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
