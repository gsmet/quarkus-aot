package fr.spacefox.perftests.quarkus.rest.endpoint27;

import fr.spacefox.perftests.quarkus.core.service27.Service27;
import fr.spacefox.perftests.quarkus.rest.endpoint27.schema.Schema27;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint27")
public class Endpoint27Resource {

    private final Service27 service;

    public Endpoint27Resource(Service27 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema27 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
