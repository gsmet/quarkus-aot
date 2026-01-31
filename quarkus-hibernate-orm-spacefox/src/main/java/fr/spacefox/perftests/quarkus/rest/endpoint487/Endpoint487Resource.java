package fr.spacefox.perftests.quarkus.rest.endpoint487;

import fr.spacefox.perftests.quarkus.core.service487.Service487;
import fr.spacefox.perftests.quarkus.rest.endpoint487.schema.Schema487;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint487")
public class Endpoint487Resource {

    private final Service487 service;

    public Endpoint487Resource(Service487 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema487 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
