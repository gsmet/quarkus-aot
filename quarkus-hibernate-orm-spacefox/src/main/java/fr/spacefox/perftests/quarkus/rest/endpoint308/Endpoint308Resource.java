package fr.spacefox.perftests.quarkus.rest.endpoint308;

import fr.spacefox.perftests.quarkus.core.service308.Service308;
import fr.spacefox.perftests.quarkus.rest.endpoint308.schema.Schema308;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint308")
public class Endpoint308Resource {

    private final Service308 service;

    public Endpoint308Resource(Service308 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema308 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
