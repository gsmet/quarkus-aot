package fr.spacefox.perftests.quarkus.rest.endpoint823;

import fr.spacefox.perftests.quarkus.core.service823.Service823;
import fr.spacefox.perftests.quarkus.rest.endpoint823.schema.Schema823;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint823")
public class Endpoint823Resource {

    private final Service823 service;

    public Endpoint823Resource(Service823 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema823 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
