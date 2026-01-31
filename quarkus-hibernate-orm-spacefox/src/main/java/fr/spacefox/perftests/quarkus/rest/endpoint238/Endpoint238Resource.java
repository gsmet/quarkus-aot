package fr.spacefox.perftests.quarkus.rest.endpoint238;

import fr.spacefox.perftests.quarkus.core.service238.Service238;
import fr.spacefox.perftests.quarkus.rest.endpoint238.schema.Schema238;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint238")
public class Endpoint238Resource {

    private final Service238 service;

    public Endpoint238Resource(Service238 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema238 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
