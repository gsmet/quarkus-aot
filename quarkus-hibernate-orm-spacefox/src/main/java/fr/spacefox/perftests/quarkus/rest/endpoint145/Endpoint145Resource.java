package fr.spacefox.perftests.quarkus.rest.endpoint145;

import fr.spacefox.perftests.quarkus.core.service145.Service145;
import fr.spacefox.perftests.quarkus.rest.endpoint145.schema.Schema145;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint145")
public class Endpoint145Resource {

    private final Service145 service;

    public Endpoint145Resource(Service145 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema145 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
