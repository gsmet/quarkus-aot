package fr.spacefox.perftests.quarkus.rest.endpoint707;

import fr.spacefox.perftests.quarkus.core.service707.Service707;
import fr.spacefox.perftests.quarkus.rest.endpoint707.schema.Schema707;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint707")
public class Endpoint707Resource {

    private final Service707 service;

    public Endpoint707Resource(Service707 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema707 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
