package fr.spacefox.perftests.quarkus.rest.endpoint580;

import fr.spacefox.perftests.quarkus.core.service580.Service580;
import fr.spacefox.perftests.quarkus.rest.endpoint580.schema.Schema580;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint580")
public class Endpoint580Resource {

    private final Service580 service;

    public Endpoint580Resource(Service580 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema580 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
