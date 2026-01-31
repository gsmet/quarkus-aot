package fr.spacefox.perftests.quarkus.rest.endpoint255;

import fr.spacefox.perftests.quarkus.core.service255.Service255;
import fr.spacefox.perftests.quarkus.rest.endpoint255.schema.Schema255;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint255")
public class Endpoint255Resource {

    private final Service255 service;

    public Endpoint255Resource(Service255 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema255 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
