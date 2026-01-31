package fr.spacefox.perftests.quarkus.rest.endpoint490;

import fr.spacefox.perftests.quarkus.core.service490.Service490;
import fr.spacefox.perftests.quarkus.rest.endpoint490.schema.Schema490;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint490")
public class Endpoint490Resource {

    private final Service490 service;

    public Endpoint490Resource(Service490 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema490 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
