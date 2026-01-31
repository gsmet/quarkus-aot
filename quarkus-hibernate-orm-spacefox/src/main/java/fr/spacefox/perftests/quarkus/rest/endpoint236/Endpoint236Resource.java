package fr.spacefox.perftests.quarkus.rest.endpoint236;

import fr.spacefox.perftests.quarkus.core.service236.Service236;
import fr.spacefox.perftests.quarkus.rest.endpoint236.schema.Schema236;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint236")
public class Endpoint236Resource {

    private final Service236 service;

    public Endpoint236Resource(Service236 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema236 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
