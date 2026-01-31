package fr.spacefox.perftests.quarkus.rest.endpoint709;

import fr.spacefox.perftests.quarkus.core.service709.Service709;
import fr.spacefox.perftests.quarkus.rest.endpoint709.schema.Schema709;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint709")
public class Endpoint709Resource {

    private final Service709 service;

    public Endpoint709Resource(Service709 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema709 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
