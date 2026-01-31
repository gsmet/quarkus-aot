package fr.spacefox.perftests.quarkus.rest.endpoint919;

import fr.spacefox.perftests.quarkus.core.service919.Service919;
import fr.spacefox.perftests.quarkus.rest.endpoint919.schema.Schema919;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint919")
public class Endpoint919Resource {

    private final Service919 service;

    public Endpoint919Resource(Service919 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema919 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
