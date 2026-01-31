package fr.spacefox.perftests.quarkus.rest.endpoint642;

import fr.spacefox.perftests.quarkus.core.service642.Service642;
import fr.spacefox.perftests.quarkus.rest.endpoint642.schema.Schema642;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint642")
public class Endpoint642Resource {

    private final Service642 service;

    public Endpoint642Resource(Service642 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema642 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
