package fr.spacefox.perftests.quarkus.rest.endpoint94;

import fr.spacefox.perftests.quarkus.core.service94.Service94;
import fr.spacefox.perftests.quarkus.rest.endpoint94.schema.Schema94;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint94")
public class Endpoint94Resource {

    private final Service94 service;

    public Endpoint94Resource(Service94 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema94 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
