package fr.spacefox.perftests.quarkus.rest.endpoint460;

import fr.spacefox.perftests.quarkus.core.service460.Service460;
import fr.spacefox.perftests.quarkus.rest.endpoint460.schema.Schema460;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint460")
public class Endpoint460Resource {

    private final Service460 service;

    public Endpoint460Resource(Service460 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema460 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
