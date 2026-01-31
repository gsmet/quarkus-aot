package fr.spacefox.perftests.quarkus.rest.endpoint934;

import fr.spacefox.perftests.quarkus.core.service934.Service934;
import fr.spacefox.perftests.quarkus.rest.endpoint934.schema.Schema934;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint934")
public class Endpoint934Resource {

    private final Service934 service;

    public Endpoint934Resource(Service934 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema934 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
