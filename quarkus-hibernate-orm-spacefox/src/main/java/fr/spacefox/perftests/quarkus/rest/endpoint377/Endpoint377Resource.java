package fr.spacefox.perftests.quarkus.rest.endpoint377;

import fr.spacefox.perftests.quarkus.core.service377.Service377;
import fr.spacefox.perftests.quarkus.rest.endpoint377.schema.Schema377;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint377")
public class Endpoint377Resource {

    private final Service377 service;

    public Endpoint377Resource(Service377 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema377 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
