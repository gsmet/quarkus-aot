package fr.spacefox.perftests.quarkus.rest.endpoint347;

import fr.spacefox.perftests.quarkus.core.service347.Service347;
import fr.spacefox.perftests.quarkus.rest.endpoint347.schema.Schema347;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint347")
public class Endpoint347Resource {

    private final Service347 service;

    public Endpoint347Resource(Service347 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema347 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
