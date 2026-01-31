package fr.spacefox.perftests.quarkus.rest.endpoint135;

import fr.spacefox.perftests.quarkus.core.service135.Service135;
import fr.spacefox.perftests.quarkus.rest.endpoint135.schema.Schema135;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint135")
public class Endpoint135Resource {

    private final Service135 service;

    public Endpoint135Resource(Service135 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema135 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
