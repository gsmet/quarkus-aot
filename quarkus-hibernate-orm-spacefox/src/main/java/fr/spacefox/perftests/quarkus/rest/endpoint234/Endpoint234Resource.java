package fr.spacefox.perftests.quarkus.rest.endpoint234;

import fr.spacefox.perftests.quarkus.core.service234.Service234;
import fr.spacefox.perftests.quarkus.rest.endpoint234.schema.Schema234;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint234")
public class Endpoint234Resource {

    private final Service234 service;

    public Endpoint234Resource(Service234 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema234 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
