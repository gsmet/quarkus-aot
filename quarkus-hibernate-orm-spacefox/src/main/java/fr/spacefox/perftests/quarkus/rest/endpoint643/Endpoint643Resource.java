package fr.spacefox.perftests.quarkus.rest.endpoint643;

import fr.spacefox.perftests.quarkus.core.service643.Service643;
import fr.spacefox.perftests.quarkus.rest.endpoint643.schema.Schema643;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint643")
public class Endpoint643Resource {

    private final Service643 service;

    public Endpoint643Resource(Service643 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema643 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
