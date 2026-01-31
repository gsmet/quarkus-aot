package fr.spacefox.perftests.quarkus.rest.endpoint894;

import fr.spacefox.perftests.quarkus.core.service894.Service894;
import fr.spacefox.perftests.quarkus.rest.endpoint894.schema.Schema894;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint894")
public class Endpoint894Resource {

    private final Service894 service;

    public Endpoint894Resource(Service894 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema894 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
