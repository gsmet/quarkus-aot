package fr.spacefox.perftests.quarkus.rest.endpoint99;

import fr.spacefox.perftests.quarkus.core.service99.Service99;
import fr.spacefox.perftests.quarkus.rest.endpoint99.schema.Schema99;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint99")
public class Endpoint99Resource {

    private final Service99 service;

    public Endpoint99Resource(Service99 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema99 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
