package fr.spacefox.perftests.quarkus.rest.endpoint73;

import fr.spacefox.perftests.quarkus.core.service73.Service73;
import fr.spacefox.perftests.quarkus.rest.endpoint73.schema.Schema73;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint73")
public class Endpoint73Resource {

    private final Service73 service;

    public Endpoint73Resource(Service73 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema73 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
