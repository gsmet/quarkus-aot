package fr.spacefox.perftests.quarkus.rest.endpoint677;

import fr.spacefox.perftests.quarkus.core.service677.Service677;
import fr.spacefox.perftests.quarkus.rest.endpoint677.schema.Schema677;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint677")
public class Endpoint677Resource {

    private final Service677 service;

    public Endpoint677Resource(Service677 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema677 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
