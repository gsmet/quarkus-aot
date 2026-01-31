package fr.spacefox.perftests.quarkus.rest.endpoint484;

import fr.spacefox.perftests.quarkus.core.service484.Service484;
import fr.spacefox.perftests.quarkus.rest.endpoint484.schema.Schema484;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint484")
public class Endpoint484Resource {

    private final Service484 service;

    public Endpoint484Resource(Service484 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema484 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
