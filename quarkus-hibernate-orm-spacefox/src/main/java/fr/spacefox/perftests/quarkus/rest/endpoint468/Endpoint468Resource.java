package fr.spacefox.perftests.quarkus.rest.endpoint468;

import fr.spacefox.perftests.quarkus.core.service468.Service468;
import fr.spacefox.perftests.quarkus.rest.endpoint468.schema.Schema468;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint468")
public class Endpoint468Resource {

    private final Service468 service;

    public Endpoint468Resource(Service468 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema468 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
