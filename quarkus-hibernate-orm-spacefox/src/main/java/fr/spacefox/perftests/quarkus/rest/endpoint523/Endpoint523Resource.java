package fr.spacefox.perftests.quarkus.rest.endpoint523;

import fr.spacefox.perftests.quarkus.core.service523.Service523;
import fr.spacefox.perftests.quarkus.rest.endpoint523.schema.Schema523;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint523")
public class Endpoint523Resource {

    private final Service523 service;

    public Endpoint523Resource(Service523 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema523 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
