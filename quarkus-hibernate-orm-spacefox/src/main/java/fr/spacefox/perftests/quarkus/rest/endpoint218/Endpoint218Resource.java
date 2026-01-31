package fr.spacefox.perftests.quarkus.rest.endpoint218;

import fr.spacefox.perftests.quarkus.core.service218.Service218;
import fr.spacefox.perftests.quarkus.rest.endpoint218.schema.Schema218;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint218")
public class Endpoint218Resource {

    private final Service218 service;

    public Endpoint218Resource(Service218 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema218 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
