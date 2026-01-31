package fr.spacefox.perftests.quarkus.rest.endpoint271;

import fr.spacefox.perftests.quarkus.core.service271.Service271;
import fr.spacefox.perftests.quarkus.rest.endpoint271.schema.Schema271;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint271")
public class Endpoint271Resource {

    private final Service271 service;

    public Endpoint271Resource(Service271 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema271 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
