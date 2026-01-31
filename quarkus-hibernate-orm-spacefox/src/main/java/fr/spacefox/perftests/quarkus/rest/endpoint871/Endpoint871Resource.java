package fr.spacefox.perftests.quarkus.rest.endpoint871;

import fr.spacefox.perftests.quarkus.core.service871.Service871;
import fr.spacefox.perftests.quarkus.rest.endpoint871.schema.Schema871;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint871")
public class Endpoint871Resource {

    private final Service871 service;

    public Endpoint871Resource(Service871 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema871 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
