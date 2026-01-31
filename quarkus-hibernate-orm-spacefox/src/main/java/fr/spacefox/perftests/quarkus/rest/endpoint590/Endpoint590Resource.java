package fr.spacefox.perftests.quarkus.rest.endpoint590;

import fr.spacefox.perftests.quarkus.core.service590.Service590;
import fr.spacefox.perftests.quarkus.rest.endpoint590.schema.Schema590;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint590")
public class Endpoint590Resource {

    private final Service590 service;

    public Endpoint590Resource(Service590 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema590 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
