package fr.spacefox.perftests.quarkus.rest.endpoint861;

import fr.spacefox.perftests.quarkus.core.service861.Service861;
import fr.spacefox.perftests.quarkus.rest.endpoint861.schema.Schema861;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint861")
public class Endpoint861Resource {

    private final Service861 service;

    public Endpoint861Resource(Service861 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema861 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
