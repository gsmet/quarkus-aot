package fr.spacefox.perftests.quarkus.rest.endpoint60;

import fr.spacefox.perftests.quarkus.core.service60.Service60;
import fr.spacefox.perftests.quarkus.rest.endpoint60.schema.Schema60;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint60")
public class Endpoint60Resource {

    private final Service60 service;

    public Endpoint60Resource(Service60 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema60 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
