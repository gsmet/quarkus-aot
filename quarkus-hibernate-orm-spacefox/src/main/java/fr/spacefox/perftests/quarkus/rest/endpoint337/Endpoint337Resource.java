package fr.spacefox.perftests.quarkus.rest.endpoint337;

import fr.spacefox.perftests.quarkus.core.service337.Service337;
import fr.spacefox.perftests.quarkus.rest.endpoint337.schema.Schema337;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint337")
public class Endpoint337Resource {

    private final Service337 service;

    public Endpoint337Resource(Service337 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema337 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
