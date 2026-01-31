package fr.spacefox.perftests.quarkus.rest.endpoint918;

import fr.spacefox.perftests.quarkus.core.service918.Service918;
import fr.spacefox.perftests.quarkus.rest.endpoint918.schema.Schema918;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint918")
public class Endpoint918Resource {

    private final Service918 service;

    public Endpoint918Resource(Service918 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema918 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
