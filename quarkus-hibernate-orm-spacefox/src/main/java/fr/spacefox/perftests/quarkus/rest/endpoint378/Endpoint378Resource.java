package fr.spacefox.perftests.quarkus.rest.endpoint378;

import fr.spacefox.perftests.quarkus.core.service378.Service378;
import fr.spacefox.perftests.quarkus.rest.endpoint378.schema.Schema378;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint378")
public class Endpoint378Resource {

    private final Service378 service;

    public Endpoint378Resource(Service378 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema378 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
