package fr.spacefox.perftests.quarkus.rest.endpoint31;

import fr.spacefox.perftests.quarkus.core.service31.Service31;
import fr.spacefox.perftests.quarkus.rest.endpoint31.schema.Schema31;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint31")
public class Endpoint31Resource {

    private final Service31 service;

    public Endpoint31Resource(Service31 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema31 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
