package fr.spacefox.perftests.quarkus.rest.endpoint130;

import fr.spacefox.perftests.quarkus.core.service130.Service130;
import fr.spacefox.perftests.quarkus.rest.endpoint130.schema.Schema130;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint130")
public class Endpoint130Resource {

    private final Service130 service;

    public Endpoint130Resource(Service130 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema130 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
