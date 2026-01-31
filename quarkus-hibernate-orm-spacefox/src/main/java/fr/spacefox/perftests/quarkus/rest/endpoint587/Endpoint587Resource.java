package fr.spacefox.perftests.quarkus.rest.endpoint587;

import fr.spacefox.perftests.quarkus.core.service587.Service587;
import fr.spacefox.perftests.quarkus.rest.endpoint587.schema.Schema587;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint587")
public class Endpoint587Resource {

    private final Service587 service;

    public Endpoint587Resource(Service587 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema587 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
