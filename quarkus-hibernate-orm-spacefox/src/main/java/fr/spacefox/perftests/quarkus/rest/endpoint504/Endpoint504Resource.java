package fr.spacefox.perftests.quarkus.rest.endpoint504;

import fr.spacefox.perftests.quarkus.core.service504.Service504;
import fr.spacefox.perftests.quarkus.rest.endpoint504.schema.Schema504;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint504")
public class Endpoint504Resource {

    private final Service504 service;

    public Endpoint504Resource(Service504 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema504 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
