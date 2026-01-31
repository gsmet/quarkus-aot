package fr.spacefox.perftests.quarkus.rest.endpoint613;

import fr.spacefox.perftests.quarkus.core.service613.Service613;
import fr.spacefox.perftests.quarkus.rest.endpoint613.schema.Schema613;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint613")
public class Endpoint613Resource {

    private final Service613 service;

    public Endpoint613Resource(Service613 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema613 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
