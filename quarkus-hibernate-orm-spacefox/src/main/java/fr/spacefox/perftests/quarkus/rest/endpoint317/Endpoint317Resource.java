package fr.spacefox.perftests.quarkus.rest.endpoint317;

import fr.spacefox.perftests.quarkus.core.service317.Service317;
import fr.spacefox.perftests.quarkus.rest.endpoint317.schema.Schema317;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint317")
public class Endpoint317Resource {

    private final Service317 service;

    public Endpoint317Resource(Service317 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema317 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
