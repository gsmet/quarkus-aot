package fr.spacefox.perftests.quarkus.rest.endpoint108;

import fr.spacefox.perftests.quarkus.core.service108.Service108;
import fr.spacefox.perftests.quarkus.rest.endpoint108.schema.Schema108;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint108")
public class Endpoint108Resource {

    private final Service108 service;

    public Endpoint108Resource(Service108 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema108 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
