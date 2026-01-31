package fr.spacefox.perftests.quarkus.rest.endpoint722;

import fr.spacefox.perftests.quarkus.core.service722.Service722;
import fr.spacefox.perftests.quarkus.rest.endpoint722.schema.Schema722;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint722")
public class Endpoint722Resource {

    private final Service722 service;

    public Endpoint722Resource(Service722 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema722 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
