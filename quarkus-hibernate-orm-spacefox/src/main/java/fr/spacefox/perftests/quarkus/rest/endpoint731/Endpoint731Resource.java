package fr.spacefox.perftests.quarkus.rest.endpoint731;

import fr.spacefox.perftests.quarkus.core.service731.Service731;
import fr.spacefox.perftests.quarkus.rest.endpoint731.schema.Schema731;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint731")
public class Endpoint731Resource {

    private final Service731 service;

    public Endpoint731Resource(Service731 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema731 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
