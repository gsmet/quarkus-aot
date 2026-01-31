package fr.spacefox.perftests.quarkus.rest.endpoint782;

import fr.spacefox.perftests.quarkus.core.service782.Service782;
import fr.spacefox.perftests.quarkus.rest.endpoint782.schema.Schema782;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint782")
public class Endpoint782Resource {

    private final Service782 service;

    public Endpoint782Resource(Service782 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema782 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
