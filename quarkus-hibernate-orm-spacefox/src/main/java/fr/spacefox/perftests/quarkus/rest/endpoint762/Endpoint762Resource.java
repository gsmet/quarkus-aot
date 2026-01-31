package fr.spacefox.perftests.quarkus.rest.endpoint762;

import fr.spacefox.perftests.quarkus.core.service762.Service762;
import fr.spacefox.perftests.quarkus.rest.endpoint762.schema.Schema762;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint762")
public class Endpoint762Resource {

    private final Service762 service;

    public Endpoint762Resource(Service762 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema762 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
