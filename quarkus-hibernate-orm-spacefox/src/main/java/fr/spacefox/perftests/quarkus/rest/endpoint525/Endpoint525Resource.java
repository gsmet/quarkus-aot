package fr.spacefox.perftests.quarkus.rest.endpoint525;

import fr.spacefox.perftests.quarkus.core.service525.Service525;
import fr.spacefox.perftests.quarkus.rest.endpoint525.schema.Schema525;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint525")
public class Endpoint525Resource {

    private final Service525 service;

    public Endpoint525Resource(Service525 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema525 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
