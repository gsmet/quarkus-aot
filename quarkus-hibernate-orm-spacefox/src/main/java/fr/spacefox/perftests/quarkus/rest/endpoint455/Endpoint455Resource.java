package fr.spacefox.perftests.quarkus.rest.endpoint455;

import fr.spacefox.perftests.quarkus.core.service455.Service455;
import fr.spacefox.perftests.quarkus.rest.endpoint455.schema.Schema455;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint455")
public class Endpoint455Resource {

    private final Service455 service;

    public Endpoint455Resource(Service455 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema455 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
