package fr.spacefox.perftests.quarkus.rest.endpoint774;

import fr.spacefox.perftests.quarkus.core.service774.Service774;
import fr.spacefox.perftests.quarkus.rest.endpoint774.schema.Schema774;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint774")
public class Endpoint774Resource {

    private final Service774 service;

    public Endpoint774Resource(Service774 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema774 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
