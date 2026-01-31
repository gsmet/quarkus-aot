package fr.spacefox.perftests.quarkus.rest.endpoint582;

import fr.spacefox.perftests.quarkus.core.service582.Service582;
import fr.spacefox.perftests.quarkus.rest.endpoint582.schema.Schema582;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint582")
public class Endpoint582Resource {

    private final Service582 service;

    public Endpoint582Resource(Service582 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema582 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
