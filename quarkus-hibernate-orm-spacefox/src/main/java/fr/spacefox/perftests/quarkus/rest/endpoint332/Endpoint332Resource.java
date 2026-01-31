package fr.spacefox.perftests.quarkus.rest.endpoint332;

import fr.spacefox.perftests.quarkus.core.service332.Service332;
import fr.spacefox.perftests.quarkus.rest.endpoint332.schema.Schema332;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint332")
public class Endpoint332Resource {

    private final Service332 service;

    public Endpoint332Resource(Service332 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema332 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
