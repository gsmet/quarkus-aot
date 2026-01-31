package fr.spacefox.perftests.quarkus.rest.endpoint469;

import fr.spacefox.perftests.quarkus.core.service469.Service469;
import fr.spacefox.perftests.quarkus.rest.endpoint469.schema.Schema469;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint469")
public class Endpoint469Resource {

    private final Service469 service;

    public Endpoint469Resource(Service469 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema469 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
