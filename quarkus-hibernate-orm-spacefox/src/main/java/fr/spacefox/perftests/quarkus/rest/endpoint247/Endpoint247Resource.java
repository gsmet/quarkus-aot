package fr.spacefox.perftests.quarkus.rest.endpoint247;

import fr.spacefox.perftests.quarkus.core.service247.Service247;
import fr.spacefox.perftests.quarkus.rest.endpoint247.schema.Schema247;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint247")
public class Endpoint247Resource {

    private final Service247 service;

    public Endpoint247Resource(Service247 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema247 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
