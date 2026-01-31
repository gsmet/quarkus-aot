package fr.spacefox.perftests.quarkus.rest.endpoint809;

import fr.spacefox.perftests.quarkus.core.service809.Service809;
import fr.spacefox.perftests.quarkus.rest.endpoint809.schema.Schema809;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint809")
public class Endpoint809Resource {

    private final Service809 service;

    public Endpoint809Resource(Service809 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema809 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
