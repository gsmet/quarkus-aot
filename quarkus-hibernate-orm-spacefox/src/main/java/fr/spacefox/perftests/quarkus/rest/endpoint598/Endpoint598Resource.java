package fr.spacefox.perftests.quarkus.rest.endpoint598;

import fr.spacefox.perftests.quarkus.core.service598.Service598;
import fr.spacefox.perftests.quarkus.rest.endpoint598.schema.Schema598;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint598")
public class Endpoint598Resource {

    private final Service598 service;

    public Endpoint598Resource(Service598 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema598 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
