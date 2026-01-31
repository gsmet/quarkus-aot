package fr.spacefox.perftests.quarkus.rest.endpoint442;

import fr.spacefox.perftests.quarkus.core.service442.Service442;
import fr.spacefox.perftests.quarkus.rest.endpoint442.schema.Schema442;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint442")
public class Endpoint442Resource {

    private final Service442 service;

    public Endpoint442Resource(Service442 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema442 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
