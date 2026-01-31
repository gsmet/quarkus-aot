package fr.spacefox.perftests.quarkus.rest.endpoint465;

import fr.spacefox.perftests.quarkus.core.service465.Service465;
import fr.spacefox.perftests.quarkus.rest.endpoint465.schema.Schema465;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint465")
public class Endpoint465Resource {

    private final Service465 service;

    public Endpoint465Resource(Service465 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema465 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
