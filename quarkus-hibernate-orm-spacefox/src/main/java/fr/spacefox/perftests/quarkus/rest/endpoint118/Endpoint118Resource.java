package fr.spacefox.perftests.quarkus.rest.endpoint118;

import fr.spacefox.perftests.quarkus.core.service118.Service118;
import fr.spacefox.perftests.quarkus.rest.endpoint118.schema.Schema118;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint118")
public class Endpoint118Resource {

    private final Service118 service;

    public Endpoint118Resource(Service118 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema118 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
