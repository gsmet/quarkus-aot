package fr.spacefox.perftests.quarkus.rest.endpoint544;

import fr.spacefox.perftests.quarkus.core.service544.Service544;
import fr.spacefox.perftests.quarkus.rest.endpoint544.schema.Schema544;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint544")
public class Endpoint544Resource {

    private final Service544 service;

    public Endpoint544Resource(Service544 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema544 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
