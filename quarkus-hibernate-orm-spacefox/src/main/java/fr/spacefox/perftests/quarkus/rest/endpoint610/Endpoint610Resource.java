package fr.spacefox.perftests.quarkus.rest.endpoint610;

import fr.spacefox.perftests.quarkus.core.service610.Service610;
import fr.spacefox.perftests.quarkus.rest.endpoint610.schema.Schema610;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint610")
public class Endpoint610Resource {

    private final Service610 service;

    public Endpoint610Resource(Service610 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema610 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
