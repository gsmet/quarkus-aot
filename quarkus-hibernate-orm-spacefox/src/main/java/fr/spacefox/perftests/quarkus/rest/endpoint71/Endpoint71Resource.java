package fr.spacefox.perftests.quarkus.rest.endpoint71;

import fr.spacefox.perftests.quarkus.core.service71.Service71;
import fr.spacefox.perftests.quarkus.rest.endpoint71.schema.Schema71;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint71")
public class Endpoint71Resource {

    private final Service71 service;

    public Endpoint71Resource(Service71 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema71 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
