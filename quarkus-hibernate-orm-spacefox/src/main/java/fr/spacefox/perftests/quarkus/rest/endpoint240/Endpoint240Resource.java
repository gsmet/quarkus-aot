package fr.spacefox.perftests.quarkus.rest.endpoint240;

import fr.spacefox.perftests.quarkus.core.service240.Service240;
import fr.spacefox.perftests.quarkus.rest.endpoint240.schema.Schema240;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint240")
public class Endpoint240Resource {

    private final Service240 service;

    public Endpoint240Resource(Service240 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema240 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
