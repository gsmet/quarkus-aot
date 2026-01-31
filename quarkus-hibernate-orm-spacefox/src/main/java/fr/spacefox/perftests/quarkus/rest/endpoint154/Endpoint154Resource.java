package fr.spacefox.perftests.quarkus.rest.endpoint154;

import fr.spacefox.perftests.quarkus.core.service154.Service154;
import fr.spacefox.perftests.quarkus.rest.endpoint154.schema.Schema154;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint154")
public class Endpoint154Resource {

    private final Service154 service;

    public Endpoint154Resource(Service154 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema154 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
