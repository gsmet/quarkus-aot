package fr.spacefox.perftests.quarkus.rest.endpoint23;

import fr.spacefox.perftests.quarkus.core.service23.Service23;
import fr.spacefox.perftests.quarkus.rest.endpoint23.schema.Schema23;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint23")
public class Endpoint23Resource {

    private final Service23 service;

    public Endpoint23Resource(Service23 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema23 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
