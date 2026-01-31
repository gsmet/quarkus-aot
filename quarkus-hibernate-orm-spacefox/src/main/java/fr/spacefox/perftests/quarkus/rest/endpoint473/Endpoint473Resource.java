package fr.spacefox.perftests.quarkus.rest.endpoint473;

import fr.spacefox.perftests.quarkus.core.service473.Service473;
import fr.spacefox.perftests.quarkus.rest.endpoint473.schema.Schema473;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint473")
public class Endpoint473Resource {

    private final Service473 service;

    public Endpoint473Resource(Service473 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema473 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
