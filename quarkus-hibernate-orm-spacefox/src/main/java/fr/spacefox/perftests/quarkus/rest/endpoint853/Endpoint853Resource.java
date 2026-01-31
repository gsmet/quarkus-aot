package fr.spacefox.perftests.quarkus.rest.endpoint853;

import fr.spacefox.perftests.quarkus.core.service853.Service853;
import fr.spacefox.perftests.quarkus.rest.endpoint853.schema.Schema853;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint853")
public class Endpoint853Resource {

    private final Service853 service;

    public Endpoint853Resource(Service853 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema853 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
