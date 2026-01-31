package fr.spacefox.perftests.quarkus.rest.endpoint279;

import fr.spacefox.perftests.quarkus.core.service279.Service279;
import fr.spacefox.perftests.quarkus.rest.endpoint279.schema.Schema279;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RunOnVirtualThread
@Path("/endpoint279")
public class Endpoint279Resource {

    private final Service279 service;

    public Endpoint279Resource(Service279 service) {
        this.service = service;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Schema279 getById(@PathParam("id") Long id) {
        return Mapper.of(service.compute(id));
    }
}
