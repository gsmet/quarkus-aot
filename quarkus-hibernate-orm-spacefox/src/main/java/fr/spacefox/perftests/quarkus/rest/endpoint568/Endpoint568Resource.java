package fr.spacefox.perftests.quarkus.rest.endpoint568;

import fr.spacefox.perftests.quarkus.core.service568.Service568;
import fr.spacefox.perftests.quarkus.rest.endpoint568.schema.Schema568;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint568")
public class Endpoint568Resource {

    private final Service568 service;

    public Endpoint568Resource(Service568 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema568 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
