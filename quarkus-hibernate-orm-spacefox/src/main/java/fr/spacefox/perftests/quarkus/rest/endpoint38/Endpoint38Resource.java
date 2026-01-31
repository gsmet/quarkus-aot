package fr.spacefox.perftests.quarkus.rest.endpoint38;

import fr.spacefox.perftests.quarkus.core.service38.Service38;
import fr.spacefox.perftests.quarkus.rest.endpoint38.schema.Schema38;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint38")
public class Endpoint38Resource {

    private final Service38 service;

    public Endpoint38Resource(Service38 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema38 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
