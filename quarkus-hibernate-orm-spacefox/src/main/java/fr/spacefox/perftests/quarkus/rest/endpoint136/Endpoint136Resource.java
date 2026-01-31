package fr.spacefox.perftests.quarkus.rest.endpoint136;

import fr.spacefox.perftests.quarkus.core.service136.Service136;
import fr.spacefox.perftests.quarkus.rest.endpoint136.schema.Schema136;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint136")
public class Endpoint136Resource {

    private final Service136 service;

    public Endpoint136Resource(Service136 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema136 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
