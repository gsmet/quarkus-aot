package fr.spacefox.perftests.quarkus.rest.endpoint323;

import fr.spacefox.perftests.quarkus.core.service323.Service323;
import fr.spacefox.perftests.quarkus.rest.endpoint323.schema.Schema323;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint323")
public class Endpoint323Resource {

    private final Service323 service;

    public Endpoint323Resource(Service323 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema323 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
