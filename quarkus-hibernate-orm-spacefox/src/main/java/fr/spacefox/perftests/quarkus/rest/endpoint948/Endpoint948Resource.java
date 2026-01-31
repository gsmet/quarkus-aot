package fr.spacefox.perftests.quarkus.rest.endpoint948;

import fr.spacefox.perftests.quarkus.core.service948.Service948;
import fr.spacefox.perftests.quarkus.rest.endpoint948.schema.Schema948;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint948")
public class Endpoint948Resource {

    private final Service948 service;

    public Endpoint948Resource(Service948 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema948 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
