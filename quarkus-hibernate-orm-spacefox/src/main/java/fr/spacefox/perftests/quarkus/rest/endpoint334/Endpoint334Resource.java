package fr.spacefox.perftests.quarkus.rest.endpoint334;

import fr.spacefox.perftests.quarkus.core.service334.Service334;
import fr.spacefox.perftests.quarkus.rest.endpoint334.schema.Schema334;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint334")
public class Endpoint334Resource {

    private final Service334 service;

    public Endpoint334Resource(Service334 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema334 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
