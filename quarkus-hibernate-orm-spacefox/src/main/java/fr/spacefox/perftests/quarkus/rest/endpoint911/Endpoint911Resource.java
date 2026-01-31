package fr.spacefox.perftests.quarkus.rest.endpoint911;

import fr.spacefox.perftests.quarkus.core.service911.Service911;
import fr.spacefox.perftests.quarkus.rest.endpoint911.schema.Schema911;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint911")
public class Endpoint911Resource {

    private final Service911 service;

    public Endpoint911Resource(Service911 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema911 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
