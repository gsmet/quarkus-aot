package fr.spacefox.perftests.quarkus.rest.endpoint937;

import fr.spacefox.perftests.quarkus.core.service937.Service937;
import fr.spacefox.perftests.quarkus.rest.endpoint937.schema.Schema937;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint937")
public class Endpoint937Resource {

    private final Service937 service;

    public Endpoint937Resource(Service937 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema937 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
