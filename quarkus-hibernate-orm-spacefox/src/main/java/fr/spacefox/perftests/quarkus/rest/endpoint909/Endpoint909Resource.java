package fr.spacefox.perftests.quarkus.rest.endpoint909;

import fr.spacefox.perftests.quarkus.core.service909.Service909;
import fr.spacefox.perftests.quarkus.rest.endpoint909.schema.Schema909;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint909")
public class Endpoint909Resource {

    private final Service909 service;

    public Endpoint909Resource(Service909 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema909 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
