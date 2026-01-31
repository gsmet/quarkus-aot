package fr.spacefox.perftests.quarkus.rest.endpoint55;

import fr.spacefox.perftests.quarkus.core.service55.Service55;
import fr.spacefox.perftests.quarkus.rest.endpoint55.schema.Schema55;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint55")
public class Endpoint55Resource {

    private final Service55 service;

    public Endpoint55Resource(Service55 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema55 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
