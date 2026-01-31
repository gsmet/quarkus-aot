package fr.spacefox.perftests.quarkus.rest.endpoint740;

import fr.spacefox.perftests.quarkus.core.service740.Service740;
import fr.spacefox.perftests.quarkus.rest.endpoint740.schema.Schema740;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint740")
public class Endpoint740Resource {

    private final Service740 service;

    public Endpoint740Resource(Service740 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema740 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
